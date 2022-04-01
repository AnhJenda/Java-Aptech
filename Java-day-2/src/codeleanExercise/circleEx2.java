package codeleanExercise;

public class circleEx2 {
    private double r;

    public circleEx2(){
        r = 1.0;
    }

    public circleEx2(double radius){
        r = radius;
    }

    public double getRadius(){
        return r;
    }
    public void setRadius(double radius){
        this.r = radius;
    }
    public double getArea() {
        return r * r * Math.PI;
    }
    public double getCircumFerence(){
        return 2 * r * Math.PI;
    }
    public String toString(){
        return "Circle[radius="+ r +"]";
    }
}
