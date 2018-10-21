package com.lab5.zad2;

import java.awt.*;

public interface Figure {
    double getArea();
    double getParameter();
    void drawFigure(Graphics2D g, double x, double y);
}
