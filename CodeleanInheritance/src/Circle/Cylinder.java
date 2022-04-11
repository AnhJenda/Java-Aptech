package Circle;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/10
    Project Name: 
*/

public class Cylinder extends Circle {
    // private instance variable
    private double height;

    // Constructor
    public Cylinder() {
        super(); // invoke supperclass' constructor Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()"); // for debugging
    }
    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)"); // for debugging
    }
    public Cylinder(double height, double radius) {
        super(radius); // invoke supperclass' constructor Circle(radius)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)"); // for debugging
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)"); // for debugging
    }

    // getters and setters
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    /* Returns the volume of this Cylinder*/
    public double getVolume() {
        return getArea()*height; // Use Circle's getArea()
    }
    /* Returns a self-descriptive String*/
    public String toString() {
        return "This is a Cylinder"; // to be refined later
    }
}
