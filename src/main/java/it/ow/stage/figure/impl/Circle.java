package it.ow.stage.figure.impl;

import it.ow.stage.exception.NegativeParameterException;
import it.ow.stage.figure.Figure;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by francesco on 29/04/15.
 */
public class Circle implements Figure {
    private Double radius;

    public Circle(Double radius) throws NegativeParameterException {
        if(radius < 0){
            throw new NegativeParameterException("Radius of a circle cannot be negative [Radius: " + radius + "]");
        }
        this.radius = radius;
    }

    @Override
    public Double computeArea() {
        return PI * pow(radius, 2d);
    }

    @Override
    public Double computePerimeter() {
        return 2 * PI * radius;
    }
}
