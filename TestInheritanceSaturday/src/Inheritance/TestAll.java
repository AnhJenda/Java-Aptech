package Inheritance;

import java.lang.String;
/*
    @author: Dinh Quang Anh
    Date   : 4/16/2022
    Project: TestInheritanceSaturday
*/
public class TestAll {
    public static void main(String[] args) {
        Animal a1 = new Animal("Hihi");
        Mammal m1 = new Mammal("haha");
        Dog d1 = new Dog("hoho");
        Cat c1 = new Cat("hehe");
        Dog d2 = new Dog("hahaha");

        System.out.println(a1);
        System.out.println(m1);
        System.out.println(d1);
        System.out.println(c1);

        d1.greets();
        d1.greets(d2);
    }
}
