public class PrimeAndFibonacci {

    // Constructor
    public PrimeAndFibonacci() {
        System.out.println("Prime and Fibonacci Calculator Initialized.");
    }

    // Method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static method to display prime numbers between 1 and 500
    public static void displayPrimeNumbers() {
        PrimeAndFibonacci calculator = new PrimeAndFibonacci();
        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (calculator.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Static method to calculate the sum of even Fibonacci terms <= 4 million
    public static long sumOfEvenFibonacci() {
        int term1 = 1;
        int term2 = 2;
        long sum = 0;

        while (term2 <= 4000000) {
            if (term2 % 2 == 0) {
                sum += term2;
            }
            int nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }

        return sum;
    }

    public static void main(String[] args) {
        displayPrimeNumbers();

        long evenFibonacciSum = sumOfEvenFibonacci();
        System.out.println("Sum of even Fibonacci terms <= 4 million: " + evenFibonacciSum);
    }
}
