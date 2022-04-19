package Excercise2;

/*
    @author: Dinh Quang Anh
    Date   : 4/19/2022
    Project: PracticeExercies
*/
public class Flight {
    private int number;
    private String destination;

    public Flight() {
        number = 0;
        destination = "";
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public void display() {
        System.out.println(number + ", " + destination);
    }

    public String getDestination() {
        return destination;
    }
    public  int getNumber() {
        return number;
    }
}
