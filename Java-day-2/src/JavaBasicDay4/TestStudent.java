package JavaBasicDay4;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args)throws Exception {
        ClassStud ClassStud1 = new  ClassStud(1, "T2109M");
        Date DoB1 = new Date(1999, 7, 11);

        Student student1 = new Student(1, "Quang Anh", DoB1, ClassStud1, 2);

        System.out.println(student1);

        student1.setName("Quanh");

        student1.setRollNo(2);

        Date DoB2 = new Date(1999, 8, 11);
        student1.setDoB(DoB2);

        ClassStud ClassStud2 = new ClassStud(2, "T2009M");
        student1.setClassCurent(ClassStud2);

        student1.setStatus(3);

        System.out.println("Name of student is: "+student1.getName());
        System.out.println("Class of student is: "+student1.getClassCurent());
        System.out.println("Class name of student is: "+student1.getClassCurent().getClassName());
        System.out.println("Class ID of the student is:"+student1.getClassCurent().getClassID());
        System.out.println("DOB of student is: "+student1.getDoB());
        System.out.println(student1.getStatus());
        System.out.println("Roll No of students is: "+student1.getRollNo());
    }
}
