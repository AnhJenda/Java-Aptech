package codelean;

public class SoccerPlayer {
    private int number;
    private String name;
    private int x, y;

    public SoccerPlayer(int pnum, String pname, int px, int py) {
        number = pnum;
        name = pname;
        x = px;
        y = py;
    }

    void run() {

    }
    void jump() {

    }
    void kickBall() {

    }

    public static void main(String[] args) {
        SoccerPlayer p1 = new SoccerPlayer(7, "Cristiano Ronaldo", 25, 80);
    }
}
