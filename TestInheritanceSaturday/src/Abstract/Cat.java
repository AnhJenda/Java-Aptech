package Abstract;

/*
    @author: Dinh Quang Anh
    Date   : 4/16/2022
    Project: TestInheritanceSaturday
*/
public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }
}
