package com.lab5.zad2;

import com.lab5.zad2.dimension2D.Circle;
import com.lab5.zad2.dimension2D.Rectangle;
import com.lab5.zad2.dimension2D.RegularPolygon;
import com.lab5.zad2.dimension2D.Square;

public class FabrykaObiektow {

    private int countCircle;
    private int countSquare;
    private int countRectangle;
    private int countRegularPolygon;

    public Shape[] generateObjects(int amount) {

        Shape[] figures = new Shape[amount];
        int typeOfShape = 4;
        double[] shapeTypes = getIntervalArray(typeOfShape);

        for (int i = 0; i < amount; i++) {
            double random = Math.random();

            if(random > shapeTypes[0] && random < shapeTypes[1]) {
                figures[i] = new Circle();
                countCircle++;
            } else if(random > shapeTypes[1] && random < shapeTypes[2]) {
                figures[i] = new Square();
                countSquare++;
            } else if(random > shapeTypes[2] && random < shapeTypes[3]) {
                figures[i] = new Rectangle();
                countRectangle++;
            } else if(random > shapeTypes[3] && random < shapeTypes[4]) {
                figures[i] = new RegularPolygon();
                countRegularPolygon++;
            }
        }

        return figures;
    }

    public Shape[][] splitToArrays(Shape[] objects) {
        Shape[] circles = new Shape[countCircle];
        Shape[] squares = new Shape[countSquare];
        Shape[] rectangles = new Shape[countRectangle];
        Shape[] polygons = new Shape[countRegularPolygon];

        int i = 0;
        int j = 0;
        int z = 0;
        int h = 0;

        for (Shape object : objects) {
            if(object instanceof Circle) {
                circles[i++] = object;
            } else if(object instanceof Square) {
                squares[j++] = object;
            } else if(object instanceof Rectangle) {
                rectangles[z++] = object;
            } else if(object instanceof RegularPolygon) {
                polygons[h++] = object;
            }
        }

        Shape[][] splited = { circles, squares, rectangles, polygons };

        return splited;
    }

    private double[] getIntervalArray(int amountShapeType) {
        double[] interval = new double[amountShapeType + 1];
        double minNormalDistribution = 0.0;
        double maxNormalDistribution = 1.0;
        interval[0] = minNormalDistribution;
        interval[amountShapeType] = 1;
        for (int j = 1; j < amountShapeType; j++) {
            interval[j] = (maxNormalDistribution / amountShapeType) * j;
        }
        return interval;
    }
}
