package it.aleemont.sierpinski;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        
    }
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public void setCoordinates(final double x, final double y) {
        this.setX(x);
        this.setY(y);
    }

    public double getDistance(Point2D p) {
        double x_diff = p.getX() - this.getX();
        double y_diff = p.getY() - this.getY();
        double squared_d = (Math.pow(x_diff,2) + Math.pow(y_diff, 2));
        
        return Math.sqrt(squared_d);
    }

    public String toString() {
        return "x: " + this.getX() + " y: " + this.getY();
    }


}
