package it.aleemont.sierpinski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import it.aleemont.sierpinski.Line2D;
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

        double LEN = 1.0;
        double HEIGHT = height(LEN);

        final Point2D ORIGIN = new Point2D(0.0,0.0);
        Point2D END = new Point2D(LEN, 0.0);
        Point2D TOP = new Point2D(LEN/2, HEIGHT);
        ArrayList<Point2D> vert = new ArrayList<Point2D>();

        vert.add(ORIGIN);
        vert.add(END);
        vert.add(TOP);
        
        Point2D midPoint = new Point2D(0.0, 0.0);
        Random random = new Random();
        int i = 0;
        int v1 = 0;
        int v2 = 0;
        int range = 3;
        while(i < Integer.parseInt(args[0])){
            
            range = 3+i;
            random = new Random();
            v1 = random.nextInt(range);
            random = new Random();
            v2 = random.nextInt(range);
            while(v2 == v1) {
                v2 = random.nextInt(range);
            }
            if(vert.get(v1).getDistance(vert.get(v2)) > 1/1024) {
                midPoint = vert.get(v1).mediumPoint(vert.get(v2));
                vert.add(midPoint);
                StdDraw.line(midPoint.getX(), midPoint.getY(), midPoint.getX(), midPoint.getY());
                System.out.println("("+ i + ") v1 is: " +v1 + " v2 is: " + v2);
                LEN = LEN/2;
                HEIGHT = HEIGHT/2;
                END.setCoordinates(LEN, 0.0);
                TOP.setCoordinates(LEN/2, HEIGHT);
                i++;
            }
            
        }
            
    }
        
        /* base triangle points coordinates */
        //Line2D l = new Line2D(ORIGIN, new Point2D());
        //Line2D l1 = new Line2D(ORIGIN, END);


        //int n = Integer.parseInt(args[0]);
        //double t = Math.sqrt(3.0) / 2.0;
       /* StdDraw.line(ORIGIN.getX(), ORIGIN.getY(), END.getX(), END.getY());
        StdDraw.line(ORIGIN.getX(), ORIGIN.getY(), LEN/2, HEIGHT);
        StdDraw.line(END.getX(), END.getY(), LEN/2, HEIGHT);
        */
}
