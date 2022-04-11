package ss7.abstactdemo;/*Welcome to my show !

@author: NgKhanh
Date: 4/11/2022
Time: 9:53 PM

ProjectName: JavaBasic1*/

import java.util.Locale;

public class Calculator {
    public static void main(String[] args) {
        Shape objShape;
        String shape;
        if(args.length==2){
            shape = args[0].toLowerCase();
            switch (shape){
                case "circle":objShape = new Circle();
                objShape.caculate(Float.parseFloat(args[1]));
                break;
                case"rectangle": objShape = new Rectangle();
                objShape.caculate(Float.parseFloat(args[1]));
                break;
            }
    }
    else{
        System.out.println("Usage: java Calculator <shape-name><value>");
    }
    }
}