package it.ow.stage.figure.impl;

import it.ow.stage.exception.InvalidParameterException;
import it.ow.stage.exception.NegativeParameterException;
import it.ow.stage.figure.Figure;

import static java.lang.Math.sqrt;

/**
 * Created by francesco on 29/04/15.
 */
public class Triangle implements Figure {
    private Double side1;
    private Double side2;
    private Double side3;

    public Triangle(Double side1, Double side2, Double side3) throws NegativeParameterException, InvalidParameterException {
        checkParameters(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private void checkParameters(Double side1, Double side2, Double side3) throws NegativeParameterException, InvalidParameterException {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new NegativeParameterException("Sides of a triangle cannot be negative [Sides: " + side1 + ", " + side2 + "," + side3 + "]");
        }
        if ((side1 > side2 + side3) || (side2 > side1 + side3) || (side3 > side1 + side2)) {
            throw new InvalidParameterException("I can't build a triangle with these parameters [Sides: " + side1 + ", " + side2 + "," + side3 + "]");
        }
    }

    @Override
    public Double computeArea() {
        double semiPerimeter = computePerimeter() / 2;
        return sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    @Override
    public Double computePerimeter() {
        return side1 + side2 + side3;
    }
}
