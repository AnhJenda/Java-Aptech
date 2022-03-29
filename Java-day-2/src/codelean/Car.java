package codelean;

public class Car {
    private String plateNumber;
    private double x, y;
    private double speed;

    public Car(String plN, double cx, double cy, double csp){
        plateNumber = plN;
        x = cx;
        y = cy;
        speed = csp;
    }
    public void move(){
        // định nghĩa hàm và return
    };
    public void park(){
        // định nghĩa hàm và return
    };
    public void accelerate(){
        // định nghĩa hàm và return
    }

    public static void main(String[] args) {
        Car c1 = new Car("35N1 00327", 12, 18, 150);
    }
}
