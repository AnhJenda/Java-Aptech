package JavaBasicDay4;

public class ClassStud {
    private int ClassID;
    private String ClassName;

    public ClassStud(int ClassID, String ClassName) {
        this.ClassID = ClassID;
        this.ClassName = ClassName;
    }

    // Getter
    public int getClassID() {
        return ClassID;
    }
    public String getClassName() {
        return ClassName;
    }
    // Setter
    public void setClassID(int ClassID) {
        this.ClassID = ClassID;
    }
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    @Override
    public String toString() {
        return "ClassStud{" +
                "ClassID=" + ClassID +
                ", ClassName='" + ClassName + '\'' +
                '}';
    }
}
