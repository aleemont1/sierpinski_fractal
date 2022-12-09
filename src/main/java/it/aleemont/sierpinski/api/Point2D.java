public interface Point2D {
    private float x;
    private float y;

    public float getX();
    public float getY();

    public void setX(float x);
    public void setY(float y);

    public double getDistance(Point2D p);
    public double getDistanceSquared(Point2D p);
}
