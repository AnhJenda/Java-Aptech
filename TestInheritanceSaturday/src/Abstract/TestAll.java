package Abstract;

/*
    @author: Dinh Quang Anh
    Date   : 4/16/2022
    Project: TestInheritanceSaturday
*/
public class TestAll {
    public static void main(String[] args) {
        Cat c1 = new Cat("Hihi");
        Dog d1 = new Dog("Hehe");
        Dog d2 = new Dog("hehe2");
        BigDog bd1 = new BigDog("hoho");
        BigDog bd2 = new BigDog("hoho2");

        c1.greets();
        d1.greets();
        d1.greets(d2);
        bd1.greets();
        bd1.greets(d1);
        bd1.greets(bd2);
    }
}
