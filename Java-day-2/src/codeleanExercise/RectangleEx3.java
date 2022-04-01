package codeleanExercise;

public class RectangleEx3 {
    private float length;
    private float width;

    public RectangleEx3(){
        length = 5.2f;
        width = 3.1f;
    }
    public RectangleEx3(float l, float w) {
        length = l;
        width = w;
    }

    public float getLength(){
        return length;
    }
    public void setLength(float l) {
        this.length = l;
    }

    public float getWidth(){
        return width;
    }
    public  void setWidth(float w){
        this.width = w;
    }

    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
    public String toString(){
        return "Rectangle[width="+ width +", length= "+ length+"]";
    }
}
