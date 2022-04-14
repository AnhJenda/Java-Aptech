package AbstractClassShape;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/14
    Project Name: abstract Class
*/

import java.awt.*;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is: " + s1.getArea());

        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is: " + s2.getArea());

        // Can not create instance of abstract class
        /*
        Shape s3 = new Shape("green");
        */

    }
}
