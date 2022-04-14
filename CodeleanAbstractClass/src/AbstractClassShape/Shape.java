package AbstractClassShape;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/14
    Project Name: abstract class
*/

public abstract class Shape {
    private String color;

   public Shape(String color) {
       this.color = color;
   }

   @Override
    public String toString() {
        return "Shape[color=" + color + "]";
   }

   abstract public double getArea();
}
