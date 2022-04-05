package codeleanExercise;

public class AccountEx6 {
    private String id;
    private String name;
    private int balance;

    public AccountEx6(String id, String name) {
        this.id = id;
        this.name = name;
        balance=0;
    }

    public AccountEx6(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance+=amount;
        return balance;
    }

    public int debit(int amount){
        if(amount <= balance){
            this.balance-=amount;
            System.out.println("Withdraw successfully!");
        } else {
            System.out.println("Your Balance is not enough!");
        }
        return balance;
    }

    public int transferTo(AccountEx6 another, int amount ){
        if(amount <= balance){
            this.balance -= amount;
            another.balance += amount;
            System.out.println("Success!");

        } else {
            System.out.println("Your balance is not enough!");
        }
        return balance;
    }

    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        AccountEx6 acc1 = new AccountEx6("acc1", "Duy Linh", 100000000);
        AccountEx6 acc2 = new AccountEx6("acc2", "Quy Vu", 10000000);

        acc1.transferTo(acc2, 55555);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}