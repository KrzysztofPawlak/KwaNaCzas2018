package com.lab5.zad2;

import com.lab5.zad2.dimension2D.RegularPolygon;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main extends JPanel {

    static Shape[][] shapes;

    public void paint(Graphics graphics) {

        Graphics2D g = (Graphics2D)graphics;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        double xRow = 0;
        double yRow = 0;
        double spaceBetween = 75;

        for (Shape[] shapesArray : shapes) {

            for (Shape shape : shapesArray) {
                shape.drawFigure(g, xRow, yRow);
                if(shape instanceof RegularPolygon) {
                    System.out.println("promien: " + shape.getParameter() + ", v: " + shape.getArea());
                }
                xRow += shape.getParameter() * 2 + spaceBetween;
            }

            xRow = 0;
            yRow += spaceBetween;
        }
    }

    public static void main(String[] args) {
        FabrykaObiektow fo = new FabrykaObiektow();
        Shape[] mixedShapes = fo.generateObjects(20);
        Arrays.sort(mixedShapes);
        shapes = fo.splitToArrays(mixedShapes);

        JFrame frame = new JFrame();
        frame.getContentPane().add(new Main());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }
}
