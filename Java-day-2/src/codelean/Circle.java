package codelean;

import com.company.Main;

public class Circle {   // class name
    private double radius; // variable
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius(){     // method
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
