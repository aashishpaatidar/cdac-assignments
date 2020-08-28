import java.util.*;

import javax.print.event.PrintJobListener;

class Customer {

    private String name, email;
    private int age;
    private double creditLimit;

    Customer(String name, String email, int age, double creditLimit) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.creditLimit = creditLimit;
    }

    Customer() {
        this("Riya", "riya@gmail.com", 25, 10000.0);   
    }

    Customer(String name, String email, int age) {
        this(name, email, age, 15000.0);
    }

    double getCreditLimit() {
        return creditLimit;
    }
    
    void setCreditLimit(double d) {
        creditLimit = d;
    }

    String getDetails() {
        return ("hello, " + name + " credit limit = " + creditLimit);
    }
}

class TestCustomer {
    
    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("enter name, email, age and credit limit");
        Customer c1 = new Customer(scan.next(), scan.next(), scan.nextInt(), scan.nextDouble());
        
        Customer c2 = new Customer();

        System.out.println("enter name, email and age only");
        Customer c3 = new Customer("Alex", "alex@gmail.com", 25);


    }
} 