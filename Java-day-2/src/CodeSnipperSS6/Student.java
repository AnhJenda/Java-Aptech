package CodeSnipperSS6;

public class Student {
    String studName;
    int studAge;
    void initialize(){
        studName = "James Anderson";
        studAge = 26;
    }
    void display(){
        System.out.println("CodeSnipperSS6.Student Name: " + studName);
        System.out.println("CodeSnipperSS6.Student Age: " + studAge);
    }

    public static void main(String[] args) {
        Student objStudent = new Student();
        objStudent.initialize();
        objStudent.display();
    }
}
