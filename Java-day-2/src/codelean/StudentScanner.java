package codelean;
import java.util.Scanner; // Khai báo thư viện chứa lớp Scanner

public class StudentScanner {
    String studName; // Khai báo biến
    int studAge;

    void input() { // Hàm nhập vào từ bàn phím
        Scanner ip = new Scanner(System.in);

        System.out.println("nhap vao ten cua ban: ");
        studName = ip.nextLine();

        System.out.println("nhap vao tuoi cua ban: ");
        studAge = ip.nextInt();

    }
    void output(){ // Hàm xuất ra dữ liệu vừa nhập
        System.out.println("thong tin vua nhap:");
        System.out.println("ten:" + studName + "\n tuoi:" + studAge);
    }

    public static void main(String[] args) {
        int i = 0;
        for (;;i++){
            StudentScanner a = new StudentScanner();
            a.input();
            a.output();
        }
    }
}


