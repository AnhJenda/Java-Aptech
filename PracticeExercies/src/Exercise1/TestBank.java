package Exercise1;

/*
    @author: Dinh Quang Anh
    Date   : 4/19/2022
    Project: PracticeExercies
*/
public class TestBank {
    public static void main(String[] args) {
        Bank VietinBank = new Bank(2000, 12);

        System.out.println("Interest is: " + VietinBank.calculateInterest());
    }
}
