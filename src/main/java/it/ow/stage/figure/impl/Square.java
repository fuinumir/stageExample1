package it.ow.stage.figure.impl;

import it.ow.stage.exception.NegativeParameterException;
import it.ow.stage.figure.Figure;

/**
 * Created by francesco on 29/04/15.
 */
public class Square implements Figure {
    private Double side;

    public Square(Double side) throws NegativeParameterException {
        if (side < 0) {
            throw new NegativeParameterException("Side of a square cannot be negative [Side: " + side + "]");
        }
        this.side = side;
    }

    @Override
    public Double computeArea() {
        return side * side;
    }

    @Override
    public Double computePerimeter() {
        return side * 4;
    }
}
