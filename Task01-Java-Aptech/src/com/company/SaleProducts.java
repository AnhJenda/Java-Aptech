package com.company;

public class SaleProducts {
    public static void main(String[] args){
        int price1 = 10, qty1 = 2, price2 = 11, qty2 = 3, price3 = 12, qty3 = 3,
            price4 = 13, qty4 = 4, price5 = 14, qty5 = 5;
        int total1, total2, total3, total4, total5, subtotal;
        total1 = price1 * qty1;
        total2 = price2 * qty2;
        total3 = price3 * qty3;
        total4 = price4 * qty4;
        total5 = price5 * qty5;
        subtotal = total1 + total2 + total3 + total4 + total5;
        System.out.print("Price");
        System.out.print("    Quantity");
        System.out.println("    Total");
        System.out.print(price1);
        System.out.print("           " + qty1);
        System.out.println("         " + total1);
        System.out.print(price2);
        System.out.print("           " + qty2);
        System.out.println("         " + total2);
        System.out.print(price3);
        System.out.print("           " + qty3);
        System.out.println("         " + total3);
        System.out.print(price4);
        System.out.print("           " + qty4);
        System.out.println("         " + total4);
        System.out.print(price5);
        System.out.print("           " + qty5);
        System.out.println("         " + total5);
        System.out.println("The subtotal is: " + subtotal);
    }
}