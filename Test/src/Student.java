/*
    @author: Dinh Quang Anh
    Date   : 4/17/2022
    Project: Test
*/
import java.util.Scanner;
public class Student {
    private int xy;

    String name;
    void input(){
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = ip.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" +
                "xy=" + xy +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        System.out.println(s1);
    }
}
