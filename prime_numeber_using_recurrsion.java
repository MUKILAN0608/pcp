import java.util.Scanner;

public class PrimeRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        printPrimes(2, n);
    }

    static void printPrimes(int current, int limit) {
        if (current > limit) return;
        if (isPrime(current, 2)) System.out.print(current + " ");
        printPrimes(current + 1, limit);
    }

    static boolean isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor * divisor > num) return true;
        return num % divisor != 0 && isPrime(num, divisor + 1);
    }
}
