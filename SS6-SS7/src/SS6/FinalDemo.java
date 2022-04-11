package SS6;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/09
*/

public class FinalDemo {
    // Declare and initialize a final variable
    final float PI = 3.14F;   // variable to store the value of PI

    public void display(float pi) {
        PI = pi;        // Lỗi không thế gán lại giá trị cho biến final
        System.out.println("The value of PI is:" + PI);
    }

    public static void main(String[] args) {
        final FinalDemo objFinalDemo = new FinalDemo();
        objFinalDemo.display(22.7F);
    }
}
