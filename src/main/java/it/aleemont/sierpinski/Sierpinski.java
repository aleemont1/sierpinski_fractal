package it.aleemont.sierpinski;
import it.aleemont.Line2D;

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

    

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

        int length = 1;

        /* base triangle points coordinates */
        

        int n = Integer.parseInt(args[0]);
        double t = Math.sqrt(3.0) / 2.0;
        StdDraw.line(x0, y0, x1, y0);
        StdDraw.line(x1, y1, x1/2, y1);
        StdDraw.line(x1/2, y1, x0, y0);
        
        double x = 0.5;
        double y = 0;

        filledTriangle(x, y, length);

    }
}
