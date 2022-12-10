package it.aleemont.sierpinski;
import it.aleemont.sierpinski.Point2D;

public class Line2D {

    private Point2D p_start = new Point2D();
    private Point2D p_end = new Point2D();

    public Line2D(Point2D p_start, Point2D p_end) {
        this.p_start = p_start;
        this.p_end = p_end;
    }

    public double length() {
        return this.p_start.getDistance(p_end);
    }

    public Point2D getP_start() {
        return this.p_start;
    }

    public Point2D getP_end() {
        return this.p_end;
    }

    public String toString() {
        return "p_start: [" + p_start + "] p_end: [" + p_end + "]";
    }


}
