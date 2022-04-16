package Abstract;

/*
    @author: Dinh Quang Anh
    Date   : 4/16/2022
    Project: TestInheritanceSaturday
*/
public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woow");
    }
    public void greets(Dog anotherdog) {
        System.out.println("Woooow");
    }
    public void greets(BigDog anotherdog) {
        System.out.println("Wooooooow");
    }
}
