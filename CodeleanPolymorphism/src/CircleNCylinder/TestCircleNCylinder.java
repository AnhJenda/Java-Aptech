package CircleNCylinder;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/13
    Project Name: Polymorphism
*/

public class TestCircleNCylinder {
    public static void main(String[] args) {

        // Substitute a subclass instance to a superclass reference
        Circle c1 = new Cylinder(1.1, 2.2);

        // Invoke superclass Circle's methods
        System.out.println(c1.getRadius());
        /* The result is 2.2*/

//        c1.getHeight();
//        c1.getVolume();
        /** CANNOT invoke method in Cylinder as c1 is a Circle reference
            compilation error: cannot find symbol method getVolume()
            compilation error: cannot find symbol method getHeight()
        */

        System.out.println(c1.toString());  // Run the overridden version
        //Cylinder[height=1.1,Circle[radius=2.2]]
        System.out.println(c1.getArea());   // Run the overridden version
        //15.205308443374602
    }
}
