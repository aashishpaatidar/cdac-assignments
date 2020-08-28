import java.util.*;

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
        Customer c3 = new Customer(scan.next(), scan.next(), scan.nextInt());

        System.out.println("All customer details \t");
        System.out.println(c1.getDetails() + "\n" + c2.getDetails() + "\n" + c3.getDetails());

        scan.nextLine();

        System.out.println("Do you want to change customer 3 credit limit : (Y/N)");
        String choice = scan.nextLine();

        if(choice.equalsIgnoreCase("y")) {
            System.out.println("enter new credit limit for 3rd customer");
            c3.setCreditLimit(c3.getCreditLimit() + scan.nextInt());

            System.out.println("New credit limit for " + c3.getDetails());
        }
        else {
            System.out.println("Thank You");
        }
    }
} 