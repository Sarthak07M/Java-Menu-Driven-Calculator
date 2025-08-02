import java.util.*;

public class calculator {
    public static void main(String[] args) {
        double x, y; 
        String option, choice;
        Scanner sc = new Scanner(System.in);

        do {
            // Display Menu
            System.out.println("Menu");
            System.out.println("====");
            System.out.println("ADD");
            System.out.println("SUB");
            System.out.println("MUL");
            System.out.println("DIV");

            // Input numbers
            System.out.println("Enter two numbers:");
            x = sc.nextDouble(); 
            y = sc.nextDouble();

            // Input operation
            System.out.println("Enter option in words:");
            option = sc.next();
            option = option.toUpperCase();

            // Perform operation
            switch(option) {
                case "ADD":
                    System.out.println("Sum: " + (x + y));
                    break;
                case "SUB":
                    System.out.println("Difference: " + (x - y));
                    break;
                case "MUL":
                    System.out.println("Product: " + (x * y));
                    break;
                case "DIV":
                    if (y != 0) {
                        System.out.println("Division: " + (x / y));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }

            // Ask user if they want to continue
            System.out.println("Do you want to perform another operation? (yes/no)");
            choice = sc.next();
            choice = choice.toLowerCase();

        } while(choice.equals("yes"));

        System.out.println("Thank you for using the calculator!");
    }
}
