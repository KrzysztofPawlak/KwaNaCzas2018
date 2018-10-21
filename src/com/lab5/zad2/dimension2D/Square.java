package com.lab5.zad2.dimension2D;

import com.lab5.zad2.Figure;
import com.lab5.zad2.Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Shape implements Figure {

    private double sideLength;
    private double maxSize = 30;

    public Square() {
        this.sideLength = Math.random() * maxSize;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getParameter() {
        return sideLength / 2;
    }

    @Override
    public void drawFigure(Graphics2D g, double x, double y) {
        g.draw(new Rectangle2D.Double(x, y, sideLength, sideLength));
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }
}
