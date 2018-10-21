package com.lab5.zad2.dimension2D;

import com.lab5.zad2.Shape;

import java.awt.*;
import java.awt.geom.Line2D;

public class RegularPolygon extends Shape {

    private double edgeLength;
    private int amountOfEdges;
    private double startX;
    private double startY;

    // for random
    private int maxEdges = 6; // + shift 3
    private double maxSize = 30;

    public RegularPolygon() {
        this.amountOfEdges = (int) (Math.random() * maxEdges) + 3;
        this.edgeLength = Math.random() * maxSize;
    }

    public RegularPolygon(double edgeLength, int amountOfEdges) {
        this.edgeLength = edgeLength;
        this.amountOfEdges = amountOfEdges;
    }

    @Override
    public double getArea() {
        double promien = getPromien();
        return (this.amountOfEdges / 2) * this.edgeLength * promien;

    }

    protected double getPromien() {
        return (this.edgeLength / 2) * (Math.atan((Math.PI / this.amountOfEdges)));
    }

    protected double getPromienR() {
        return this.edgeLength / (2 * Math.sin((Math.PI / this.amountOfEdges)));
    }

    @Override
    public double getParameter() {
        return getPromienR();
    }

    @Override
    public void drawFigure(Graphics2D g, double startX, double startY) {
        this.startX = startX;
        this.startY = startY;
        double[][] pointsArray = calculatePoints();
        draw(g, pointsArray);
    }

    @Override
    public String toString() {
        return "RegularPolygon{" +
                "edgeLength=" + edgeLength +
                ", amountOfEdges=" + amountOfEdges +
                '}';
    }

    void draw(Graphics2D g, double[][] pointsArray) {

        for (int i = 0; i < this.amountOfEdges - 1; i++) {
            g.draw(new Line2D.Double(pointsArray[0][i], pointsArray[1][i], pointsArray[0][i + 1], pointsArray[1][i + 1]));
        }
        // line end - begin
        g.draw(new Line2D.Double(pointsArray[0][pointsArray[0].length - 1], pointsArray[1][pointsArray[0].length - 1], pointsArray[0][0], pointsArray[1][0]));
    }

    double[][] calculatePoints() {

        double[][] pointsArray = new double[2][this.amountOfEdges];
        double theta = 2 * Math.PI / this.amountOfEdges;

        for (int i = 0; i < this.amountOfEdges; ++i) {
            double xCal = Math.cos(theta * i) * this.edgeLength;
            double yCal = Math.sin(theta * i) * this.edgeLength;

            pointsArray[0][i] = xCal + this.startX + getPromienR();
            pointsArray[1][i] = yCal + this.startY;
        }

        return pointsArray;
    }
}
