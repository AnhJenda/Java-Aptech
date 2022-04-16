package Abstract;

/*
    @author: Dinh Quang Anh
    Date   : 4/16/2022
    Project: TestInheritanceSaturday
*/
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void greets();
}
