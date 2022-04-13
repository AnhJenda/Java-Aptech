package Monster;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/13
    Project Name: Polymorphism
*/

public class FireMonster extends Monster {
    /** Constructs a FireMonster with the given name */
    public FireMonster(String name) {
        super(name);
    }
    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return "fire, burn them!!!";
    }
}
