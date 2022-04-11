package ss7;/*Welcome to my show !

@author: NgKhanh
Date: 4/11/2022
Time: 9:43 PM

ProjectName: JavaBasic1*/

class PartTimeEmployee extends Employee{
    String shift;

    public PartTimeEmployee(String id, String name, int sal, String shift){
        super(id, name, sal);
        this.shift = shift;
    }

    @Override
    public void displayDetails(){
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift:"+shift);
    }
}

class EmployeeDetails1 {
    public static void main(String[] args) {
        Employee objEmp = new Employee("E001", "Maria Nemeth", 40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
        System.out.println("-------------------");
        Employee objEmp1 = new PartTimeEmployee("E002", "Rob Smith", 30000, "Day");
        objEmp1.displayDetails();
    }
}
