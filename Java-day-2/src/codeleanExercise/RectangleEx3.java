package codeleanExercise;

public class RectangleEx3 { // Khai báo class có tên là RectangleEx3
    private float length; // Khởi tạo các biến chiều dài và chiều rộng
    private float width;

    public RectangleEx3(){ // đây là constructor mặc định hay default constructor
        length = 5.2f;
        width = 3.1f;
    }
    public RectangleEx3(float l, float w) {  // Đây là constructor tham số hay parameterized constructor
        length = l;
        width = w;
    }

    // Phía dưới là các phương thức hay method.
    public float getLength(){
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth(){
        return width;
    }
    public  void setWidth(float width){
        this.width = width;
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
