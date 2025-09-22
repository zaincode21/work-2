import java.util.Scanner;

public class Advancedcalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
       
        int sum = firstNumber + secondNumber;
        
        
        if (sum > 100) {
            System.out.println("The result is " + sum + " → Big number!");
        } else {
            System.out.println("The result is " + sum + " → Small number!");
        }
        
        
        if (age >= 18) {
            System.out.println("You are adult!");
        } else {
            System.out.println("You are minor!");
        }
        
        
        scanner.close();
    }
}