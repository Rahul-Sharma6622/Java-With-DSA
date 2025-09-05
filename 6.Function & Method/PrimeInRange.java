import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range from user
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Loop through the range
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    // Function to check prime number
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // check till sqrt(num)
            if (num % i == 0) {
                return false; // divisible → not prime
            }
        }
        return true;
    }
}
