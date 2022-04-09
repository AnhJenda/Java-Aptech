package JavaBasicDay4;

import JavaBasicDay4.ClassStud;

public class TestClassStud {
    public static void main(String[] args) {
        ClassStud Class1 = new ClassStud(1, "T2109M");

        System.out.println(Class1);
        System.out.println(Class1.getClassID());
        System.out.println(Class1.getClassName());

        Class1.setClassID(2);
        Class1.setClassName("T2109A");
        System.out.println(Class1);
    }
}
