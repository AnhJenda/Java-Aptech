package Interface;

/*
    @author: Dinh Quang Anh
    Date   : 4/16/2022
    Project: TestInheritanceSaturday
*/
public class TestAll {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,1,1,1);
        movablePoint.moveUp();
        System.out.println(movablePoint); // {x=1, y=2, xSpeed=1, ySpeed=1}
        movablePoint.moveDown();
        System.out.println(movablePoint); // {x=1, y=1, xSpeed=1, ySpeed=1}
        movablePoint.moveRight();
        System.out.println(movablePoint); // {x=2, y=1, xSpeed=1, ySpeed=1}
        movablePoint.moveLeft();
        System.out.println(movablePoint); // {x=1, y=1, xSpeed=1, ySpeed=1}

        MovableCircle movableCircle = new MovableCircle(1,1,2,2,5);
        movableCircle.moveLeft();
        System.out.println(movableCircle); // {radius=5, center=MovablePoint{x=-1, y=1, xSpeed=2, ySpeed=2}, x=-1, y=1, xSpeed=2, ySpeed=2}
        movableCircle.moveRight();
        System.out.println(movableCircle); // {radius=5, center=MovablePoint{x=1, y=1, xSpeed=2, ySpeed=2}, x=1, y=1, xSpeed=2, ySpeed=2}
        movableCircle.moveUp();
        System.out.println(movableCircle); // {radius=5, center=MovablePoint{x=1, y=3, xSpeed=2, ySpeed=2}, x=1, y=3, xSpeed=2, ySpeed=2}
        movableCircle.moveDown();
        System.out.println(movableCircle); // {radius=5, center=MovablePoint{x=1, y=1, xSpeed=2, ySpeed=2}, x=1, y=1, xSpeed=2, ySpeed=2}
    }
}
