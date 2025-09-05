import java.util.*;

public class Prime1 {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false; // 0 and 1 are not prime

        // check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // divisible by i, so not prime
            }
        }
        return true; // no divisors found, so prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
