package codeleanComposition;

    import java.util.Arrays;
    public class TestLine {
        public static void main(String[] args) {
            LineEx2 l1 = new LineEx2(1, 2, 3, 4);
            System.out.println(l1);
            LineEx2 l2 = new LineEx2(new PointEx2(5,6), new PointEx2(7,8));
            System.out.println(l2);

            l1.setBegin(new PointEx2(11, 12));
            l1.setEnd(new PointEx2(13, 14));
            System.out.println(l1);
            System.out.println("begin is: " + l1.getBegin());
            System.out.println("end is: " + l1.getEnd());

            l1.setBeginX(21);
            l1.setBeginY(22);
            l1.setEndX(23);
            l1.setEndY(24);
            System.out.println(l1);
            System.out.println("begin's x is: " + l1.getBeginX());
            System.out.println("begin's y is: " + l1.getBeginY());
            System.out.println("end's x is: " + l1.getEndX());
            System.out.println("end's y is: " + l1.getEndY());

            l1.setBeginXY(31, 32);
            l1.setEndXY(33, 34);
            System.out.println(l1);
            System.out.println("begin's x and y are: " + Arrays.toString(l1.getBeginXY()));
            System.out.println("end's x and y are: " + Arrays.toString(l1.getEndXY()));
            System.out.printf("length is: %.2f%n", l1.getLength());
        }
    }
