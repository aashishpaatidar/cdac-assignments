import java.util.Scanner;
class Asgnm1 {
    
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choice = 0, num1 = 0, num2 = 0;

        System.out.println("Enter num1 and num2 or press 0 to exit");

        while(choice != 0) {

            System.out.println("enter choice - 1. Add, 2. Subtract, 3. Multiply, 4. Divide");

            choice = scan.nextInt();
            switch(choice) {

                case 1: System.out.println("Enter two numbers");
                        System.out.println("Addition = " + (num1 + num2)); break;

                case 2: System.out.println("Enter two numbers");
                        System.out.println("Subtraction = " + (num1 - num2)); break;
                
                case 3: System.out.println("Enter two numbers");
                        System.out.println("Multiplication = " + (num1 * num2)); break;
                
                case 4: System.out.println("Enter two numbers");
                        System.out.println("Division = " + (num1 / num2)); break;

                default: System.out.println("Enter correct choice only");
            }
        }
        System.exit(0); 
    }
}