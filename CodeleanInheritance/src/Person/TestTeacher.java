package Person;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/12
    Project Name: 
*/

public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher1  = new Teacher("Thi DK", "8 Ton That Thuyet");

        System.out.println(teacher1);
        System.out.println(teacher1.getName());
        System.out.println(teacher1.getAddress());
        teacher1.setAddress("Ha Noi");
        System.out.println(teacher1);
    }
}
