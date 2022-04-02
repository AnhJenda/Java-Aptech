package codeleanExercise;

public class TestRectangleEx3 {
    public static void main(String[] args) {
        RectangleEx3 Rct1 = new RectangleEx3(3.2f, 1.8f);
        System.out.println("The length of Rectangle 1 is: " + Rct1.getLength());
        System.out.println("The width of the Rectangle 1 is: " + Rct1.getWidth());
        System.out.println("The area of the Rectangle 1 is: " + Rct1.getArea());
        System.out.println("The perimeter of the Rectangle 1 is: " + Rct1.getPerimeter());
        System.out.println(Rct1.toString()); // In ra thông tin Rectangle 1 bằng cách gọi phương thức toString()

        // Đặt chiều dài, chiều rộng sử dụng phương thức setLength() và setWidth()
        RectangleEx3 Rct2 = new RectangleEx3();
        System.out.println(Rct2);
//        System.out.println(Rct2.toString());
//        Rct2.setLength(5.3f);
//        Rct2.setWidth(4.1f);
//        System.out.println(Rct2.toString());
    }
}
