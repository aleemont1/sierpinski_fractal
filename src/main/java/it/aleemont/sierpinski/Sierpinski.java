package it.aleemont.sierpinski;
public class Sierpinski {

    private static double height(double length) {
        return length * Math.sqrt(3.0)/2;
    }

    public static void filledTriangle(double x, double y, double length) {

        double x2 = x - x/2;
        double y2 = y + height(length)/2;

        double x3 = x + (x/2);
        double y3 = y + height(length)/2;

        double[] xx = {x, x2, x3};
        double[] yy = {y, y2, y3};

        StdDraw.filledPolygon(xx, yy);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    //

    private static double min_

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

        final double LEN = 1.0;
        final Point2D ORIGIN = new Point2D(0.0,0.0);
        final Point2D END = new Point2D(LEN, 0.0);
        /* base triangle points coordinates */
        //Line2D l = new Line2D(ORIGIN, new Point2D());

        final double HEIGHT = height(LEN);
        //line2D l1 = new line2D(ORIGIN, END);
        //int n = Integer.parseInt(args[0]);
        //double t = Math.sqrt(3.0) / 2.0;
        StdDraw.line(ORIGIN.getX(), ORIGIN.getY(), END.getX(), END.getY());
        StdDraw.line(ORIGIN.getX(), ORIGIN.getY(), LEN/2, HEIGHT);
        StdDraw.line(END.getX(), END.getY(), LEN/2, HEIGHT);
        
        

    }
}
