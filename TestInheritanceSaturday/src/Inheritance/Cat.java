package Inheritance;

/*
    @author: Dinh Quang Anh
    Date   : 4/16/2022
    Project: TestInheritanceSaturday
*/
public class Cat extends Mammal{

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Inheritance.Cat["+ super.toString() + "]";
    }
}
