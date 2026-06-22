import java.util.*;

public class Q5_PrimesAfterNthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input: N must be a valid integer.");
            return;
        }
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input: N must be a positive integer.");
            return;
        }

        // Find the nth prime number
        int nthPrime = findNthPrime(n);
        System.out.println(ordinal(n) + " Prime number is " + nthPrime);

        // Find n prime numbers after the nth prime
        List<Integer> nextPrimes = new ArrayList<>();
        int candidate = nthPrime + 1;
        while (nextPrimes.size() < n) {
            if (isPrime(candidate)) {
                nextPrimes.add(candidate);
            }
            candidate++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nextPrimes.size(); i++) {
            sb.append(nextPrimes.get(i));
            if (i != nextPrimes.size() - 1) sb.append(", ");
        }

        System.out.println(n + " prime numbers after " + nthPrime + " are: " + sb.toString());
    }

    static int findNthPrime(int n) {
        int count = 0;
        int num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) count++;
        }
        return num;
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static String ordinal(int n) {
        if (n % 100 >= 11 && n % 100 <= 13) {
            return n + "th";
        }
        switch (n % 10) {
            case 1: return n + "st";
            case 2: return n + "nd";
            case 3: return n + "rd";
            default: return n + "th";
        }
    }
}
