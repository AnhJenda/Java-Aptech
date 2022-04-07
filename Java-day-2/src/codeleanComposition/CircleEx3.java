package codeleanComposition;

public class CircleEx3 {
    private PointEx2 center;
    private double radius;

    public CircleEx3() {
        this.center = new PointEx2();
        this.radius = 1.0;
    }

    public CircleEx3(int xCenter, int yCenter, double radius) {
        center = new PointEx2(xCenter, yCenter);
        this.radius = radius;
    }

    public CircleEx3(PointEx2 center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public PointEx2 getCenter() {
        return this.center;
    }
    public void setCenter(PointEx2 center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        center.setX(x);
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y) {
        center.setY(y);
    }
    public int[] getCenterXY() {
        return center.getXY();
    }
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public String toString() {
        return "Circle[center=" + center + ",radius=" + radius + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }

    public double distance(CircleEx3 another) {
        return center.distance(another.center);
    }
}
