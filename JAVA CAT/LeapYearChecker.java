import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }
}
