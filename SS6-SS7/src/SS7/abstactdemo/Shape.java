package ss7.abstactdemo;/*Welcome to my show !

@author: NgKhanh
Date: 4/11/2022
Time: 9:50 PM

ProjectName: JavaBasic1*/

abstract class Shape {
    private final float PI = 3.14F;
    public float getPI(){
        return PI;
    }
    abstract void caculate(float val);
}

class Circle extends Shape{
    float area;

    @Override
    void caculate(float rad){
        area = getPI() * rad * rad;
        System.out.println("Area of circle is:"+area);
    }
}

class Rectangle extends Shape{
    float perimeter;
    float length = 10;

    void caculate(float width){
        perimeter = 2*(length+width);
        System.out.println("Perimeter of the Rectangle is:"+perimeter);
    }
}