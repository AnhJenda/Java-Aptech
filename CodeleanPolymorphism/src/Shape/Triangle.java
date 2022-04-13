package Shape;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/13
    Project Name: Polymorphism
*/

public class Triangle extends Shape {
    // Private member variables
    private int base, height;

    /** Constructs a Triangle instance with the given color, base and height */
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

    /** Override the inherited getArea() to provide the proper implementation for triangle */
    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
