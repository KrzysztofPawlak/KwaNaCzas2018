package com.lab5.zad2;

public abstract class Shape implements Figure, Comparable<Shape> {

    @Override
    public int compareTo(Shape shape) {

        if(this.getArea() > shape.getArea()) {
            return 1;
        } else if(this.getArea() < shape.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
