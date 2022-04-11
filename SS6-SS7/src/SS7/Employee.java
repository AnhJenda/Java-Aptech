package ss7;/*Welcome to my show !

@author: NgKhanh
Date: 4/11/2022
Time: 9:38 PM

ProjectName: JavaBasic1*/

public class Employee {
    String empId;
    String empName;
    int salary;
    float commission;

    public Employee(String id, String name, int sal){
        this.empId = id;
        this.empName = name;
        this.salary = sal;
    }

    public void calcCommission(float sales){
        if (sales>10000)
            commission = salary*20/100;
        else
            commission = 0;
    }

    public void calcCommission(int overtime){
        if(overtime>8)
            commission = salary/30;
        else
            commission = 0;
    }

    public void displayDetails(){
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+empName);
        System.out.println("Salary:"+salary);
        System.out.println("Commission:"+commission);
    }
}

    class EmployeeDetails{
    public static void main(String[] args) {
        Employee objEmp = new Employee("E001", "Maria Nemeth", 40000);
        objEmp.calcCommission(2000F);
        objEmp.displayDetails();
    }
}
