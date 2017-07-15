package br.com.edsilfer.algorithms.exercises;

import java.util.Scanner;

/**
 * A prime is a natural number greater than  that has no positive divisors other than  and itself. Given  integers, determine the primality of each integer and print whether it is Prime or Not prime on a new line.
 * <p>
 * Note: If possible, try to come up with an  primality algorithm, or see what sort of optimizations you can come up with for an  algorithm. Be sure to check out the Editorial after submitting your code!
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of integers to check for primality.
 * Each of the  subsequent lines contains an integer, , you must test for primality.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * For each integer, print whether  is Prime or Not prime on a new line.
 * <p>
 * Sample Input
 * <p>
 * 3
 * 12
 * 5
 * 7
 * Sample Output
 * <p>
 * Not prime
 * Prime
 * Prime
 */
public class Exercise015 {

    private static boolean isPrime(int n, int divisor) {
        if (divisor <= 0 || n < 2) return false;
        if (divisor == 1 || (n > 1 && n <= 3)) return true;
        return !(n % divisor == 0) && isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for (int a0 = 0; a0 < p; a0++) {
            int n = in.nextInt();
            boolean result = isPrime(n, (int) Math.sqrt(n));
            System.out.println(result ? "Prime" : "Not prime");
        }
    }

}
