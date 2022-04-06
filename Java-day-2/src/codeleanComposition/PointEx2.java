package codeleanComposition;

import java.util.Arrays;

public class PointEx2 {
    private int x = 0;
    private int y = 0;

    public PointEx2(){}
    public PointEx2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getXY() {
        return new int[]{x,y};
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY (int y) {
        this.y = y;
    }
    public  void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }

    public double distance(PointEx2 otherPoint) {
        return Math.sqrt((this.x - otherPoint.x)*(this.x - otherPoint.x) + (this.y - otherPoint.y)*(this.y - otherPoint.y));
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }
    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        PointEx2 O = new PointEx2(0, 0); // Điểm gốc tọa độ O(0,0)
        PointEx2 A = new PointEx2(3, 4);

        System.out.println(A);
        System.out.println(O);
        System.out.println(A.getX());
        System.out.println(A.getY());
        System.out.println(Arrays.toString(A.getXY()));
    }
}
