package it.aleemont.sierpinski.impl;

import it.aleemont.sierpinski.api.*;

public class Point2DImpl implements Point2D {
    private double x;
    private double y;

    public Point2DImpl(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getDistance(Point2D p) {
        return Math.sqrt(this.getDistanceSquared(p));
    }

    @Override
    public double getDistanceSquared(Point2D p) {
        return Math.abs(Point2DImpl.squaredDifference(p.getX(), this.getX())+Point2DImpl.squaredDifference(p.getY(), this.getY()));
    }

    public static double squaredDifference(double a, double b) {
        return Math.pow((a-b),2);
    }
}
