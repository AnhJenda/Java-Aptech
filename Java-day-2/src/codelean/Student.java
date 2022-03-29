package codelean;

public class Student {
    private String name;
    private double gpa;

    public Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public double setGpa(){
        return gpa;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Paul Lee",3.5);
        System.out.println("The student name is: " + student1.name);
        System.out.printf("The student GPA is: %.1f%n", student1.gpa);

        Student student2 = new Student("Peter Tan", 3.9);
        System.out.println("The student name is: " + student2.name);
        System.out.printf("The student GPA is: %.1f%n", student2.gpa);
    }
}
