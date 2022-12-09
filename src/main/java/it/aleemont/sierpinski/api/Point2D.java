package it.aleemont.sierpinski.api;

public interface Point2D {
    public double getX();
    public double getY();

    public void setX(double x);
    public void setY(double y);

    public double getDistance(Point2D p);
    public double getDistanceSquared(Point2D p);
}
