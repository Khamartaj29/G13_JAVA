import java.util.Scanner;

public class Simple_Program {

	public static void main(String[] args) {
		        // Example usage of methods, loops, conditional statements, and operators
		        Scanner scanner = new Scanner(System.in);

		        // Get user input
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        // Check if the number is positive, negative, or zero
		        checkNumberType(number);

		        // Print the multiplication table of the entered number
		        printMultiplicationTable(number);

		        // Sum of numbers from 1 to the entered number
		        int sum = calculateSum(number);
		        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
		        scanner.close();
		    }

		    // Method to check if a number is positive, negative, or zero
		   public static void checkNumberType(int number) {
		        if (number > 0) {
		            System.out.println(number + " is a positive number.");
		        } else if (number < 0) {
		            System.out.println(number + " is a negative number.");
		        } else {
		            System.out.println(number + " is zero.");
		        }
		    }
		   

		    // Method to print the multiplication table of a number
		    public static void printMultiplicationTable(int number) {
		        System.out.println("Multiplication table of " + number + ":");
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(number + " * " + i + " = " + (number * i));
		        }
		    }

		    // Method to calculate the sum of numbers from 1 to a given number
		   public static int calculateSum(int number) {
		        int sum = 0;
		        for (int i = 1; i <= number; i++) {
		            sum += i;//sum=sum+i
		        }
		        return sum;             
		    }
	}
