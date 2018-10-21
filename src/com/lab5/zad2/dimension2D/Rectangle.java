package com.lab5.zad2.dimension2D;

import com.lab5.zad2.Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {

    private double length;
    private double width;
    private double maxSize = 30;

    public Rectangle() {
        this.length = Math.random() * maxSize;
        this.width = Math.random() * maxSize;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getParameter() {
        return length / 2;
    }

    @Override
    public void drawFigure(Graphics2D g, double x, double y) {
        g.draw(new Rectangle2D.Double(x, y, length, width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
