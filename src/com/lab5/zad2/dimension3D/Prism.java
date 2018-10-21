package com.lab5.zad2.dimension3D;

import com.lab5.zad2.dimension2D.RegularPolygon;

// tylko dla graniastoslup prawidlowy foremny
public class Prism extends RegularPolygon {

    private double h;

    public Prism(double edgeLength, double h, int amountOfEdges) {
        super(edgeLength, amountOfEdges);
        this.h = h;
    }

    @Override
    public double getArea() {
        return super.getArea() * h;
    }

    @Override
    public double getParameter() {
        return getArea();
    }
}
