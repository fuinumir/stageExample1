package it.ow.stage;

import it.ow.stage.exception.InvalidParameterException;
import it.ow.stage.exception.NegativeParameterException;
import it.ow.stage.figure.Figure;
import it.ow.stage.figure.impl.Circle;
import it.ow.stage.figure.impl.Square;
import it.ow.stage.figure.impl.Triangle;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by francesco on 29/04/15.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Square wrongSquare = new Square(-10d);
        } catch (NegativeParameterException e) {
            e.printStackTrace();
        }

        try {
            Circle wrongCircle = new Circle(-10d);
        } catch (NegativeParameterException e) {
            e.printStackTrace();
        }

        try {
            Triangle wrongTriangle = new Triangle(-10d,10d,20d);
        } catch (NegativeParameterException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        try {
            Triangle wrongTriangle = new Triangle(10d,10d,50d);
        } catch (NegativeParameterException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        try {
            Figure[] figures = {new Square(5d), new Triangle(25d, 20d, 15d), new Circle(5d)};

            for (Figure figure : figures) {
                System.out.println("----" + figure.getClass().getSimpleName() + "----");
                System.out.println("Area: " + figure.computeArea());
                System.out.println("Perimeter: " + figure.computePerimeter());
                System.out.println();
            }
        } catch (NegativeParameterException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }
}
