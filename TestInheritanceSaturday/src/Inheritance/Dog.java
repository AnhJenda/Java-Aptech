package Inheritance;

/*
    @author: Dinh Quang Anh
    Date   : 4/16/2022
    Project: TestInheritanceSaturday
*/
public class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog anotherDog) {
        System.out.println("Wooof");
    }

    public String toString() {
        return "Inheritance.Dog[" + super.toString() +"]";
    }
}
