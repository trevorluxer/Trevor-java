import java.util.Scanner;

public class ArrayOperations {

    private int[] array; // Instance variable to store user input array

    // Constructor to initialize the array
    public ArrayOperations(int size) {
        array = new int[size];
    }

    // Non-static method to populate the array with user input
    public void populateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " integers:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
    }

    // Static method to print the elements of the array
    public static void printArray(int[] arr) {
        System.out.println("Elements in the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Static method to check if a number exists in the array
    public static void checkNumberInArray(int[] arr, int number) {
        boolean found = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("The number " + number + " found at index " + index);
        } else {
            System.out.println("The number " + number + " not found in this array");
        }
    }

    // Static method to create a new array with elements reversed
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    // Static method to calculate and print sum and product of elements in array
    public static void calculateSumAndProduct(int[] arr) {
        int sum = 0;
        long product = 1;

        for (int num : arr) {
            sum += num;
            product *= num;
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an instance of ArrayOperations
        ArrayOperations arrayOps = new ArrayOperations(size);

        // Populate the array using non-static method
        arrayOps.populateArray();

        // Print the array using static method
        printArray(arrayOps.array);

        // Ask user for a number to check in the array
        System.out.print("Enter a number to check in the array: ");
        int numberToCheck = scanner.nextInt();

        // Check if the number exists in the array using static method
        checkNumberInArray(arrayOps.array, numberToCheck);

        // Create a reversed array using static method
        int[] reversedArray = reverseArray(arrayOps.array);
        System.out.println("Reversed array:");
        printArray(reversedArray);

        // Calculate and print sum and product of elements using static method
        calculateSumAndProduct(arrayOps.array);

        scanner.close();
    }
}
