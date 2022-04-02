package codeleanExercise;

public class EmployeeEx4 {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public EmployeeEx4(int EmId, String EmFirstName, String EmLastName, int EmSalary){
        id = EmId;
        firstName = EmFirstName;
        lastName = EmLastName;
        salary = EmSalary;
    };
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int Salary){
        this.salary = Salary;
    }
    public int getAnnualSalary(){
        int annualSalary;
        annualSalary = salary * 12;
        return annualSalary;
    }
    public int raiseSalary(int percent){
        int raiseSalary;
        raiseSalary = salary + salary * percent / 100;
        return raiseSalary;
    }
    public String toString(){
        return "employee[ID:"+ id + ", Name: "+ firstName + lastName + ", Salary: "+ salary +"]";
    }
}
