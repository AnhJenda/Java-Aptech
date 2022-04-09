package JavaBasicDay4;

import java.util.Date;

public class Student {
    private int rollNo;
    private String name;
    private Date DoB;
    private ClassStud classCurent;
    private int status;    // 0, 1, 2

    public Student(int rollNo, String name, Date DoB, ClassStud classCurrent, int status) {
        this.rollNo = rollNo;
        this.name = name;
        this.DoB = DoB;
        this.classCurent = classCurrent;
        this.status = status;
    }

    // getter
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public Date getDoB() {
        return DoB;
    }
    public ClassStud getClassCurent() {
        return classCurent;
    }
    public int getStatus() {
        return status;
    }
    // setter
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }
    public void setClassCurent(ClassStud anotherClass) {
        this.classCurent = anotherClass;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", DoB=" + DoB +
                ", classCurent=" + classCurent +
                ", status=" + status +
                '}';
    }
}
