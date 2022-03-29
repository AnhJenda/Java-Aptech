package CodeSnipperSS6;// Code snippet 3

public class Customer {
    // Declare instance variables
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    /* As main() method is a member of class, so it can access other
     * members of the class
     */
    public static void main(String[] args) {
        // Declares and instantiates an object of type CodeSnipperSS6.Customer
        Customer objCustomer1 = new Customer();
        // Accesses the instance variables to store values
        objCustomer1.customerID = 100;
        objCustomer1.customerName = "John";
        objCustomer1.customerAddress = "123 Street";
        objCustomer1.customerAge = 30;

        // Displays the objCustomer1 object details
        System.out.println("CodeSnipperSS6.Customer Identification Number: " + objCustomer1.customerID);
        System.out.println("CodeSnipperSS6.Customer Name: " + objCustomer1.customerName);
        System.out.println("CodeSnipperSS6.Customer Address: " + objCustomer1.customerAddress);
        System.out.println("CodeSnipperSS6.Customer Age: " + objCustomer1.customerAge);
    }
}