import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Initialize the smallest and largest variables
        int smallest = number1;
        int largest = number1;

        // Determine the smallest number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Determine the largest number
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Display the results
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
        
        // Close the scanner
        scanner.close();
    }
}
