package Person;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/12
    Project Name: 
*/

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Quang Anh", "Ha Dong");
        s1.addCourseGrade("IM101", 100);
        s1.addCourseGrade("IM102", 50);
        s1.printGrades();

        System.out.println("Average is " + s1.getAverageGrade());
        System.out.println(s1);
        System.out.println(s1.getAddress());
        System.out.println(s1.getName());
    }
}
