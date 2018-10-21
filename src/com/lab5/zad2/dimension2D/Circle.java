package com.lab5.zad2.dimension2D;

import com.lab5.zad2.Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {

    private double r;
    private double maxSize = 30;

    public Circle() {
        this.r = Math.random() * maxSize;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * Math.PI;
    }

    @Override
    public double getParameter() {
        return r;
    }

    @Override
    public void drawFigure(Graphics2D g, double x, double y) {
        g.draw(new Ellipse2D.Double(x, y, r * 2, r * 2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
