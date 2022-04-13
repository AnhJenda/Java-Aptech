package Monster;
/* 
    @author : Dinh Quang Anh
    Date : 2022/04/13
    Project Name: Polymorphism
*/

public class WaterMonster extends Monster{
    /** Constructs a WaterMonster instance with the given name */
    public WaterMonster(String name) {
        super(name);
    }
    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return "Attack with water!";
    }
}
