import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        // Create a scanner object to read input from the lecturer
        Scanner scanner = new Scanner(System.in);

        // Prompt the lecturer to enter marks for three units
        System.out.println("Enter marks for Java Programming: ");
        int javaMarks = scanner.nextInt();

        System.out.println("Enter marks for Networking: ");
        int networkingMarks = scanner.nextInt();

        System.out.println("Enter marks for Maths: ");
        int mathsMarks = scanner.nextInt();

        // Compute the average marks
        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3.0;

        // Display the results
        System.out.println("Marks for Java Programming: " + javaMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);

        // Close the scanner
        scanner.close();
    }
}
