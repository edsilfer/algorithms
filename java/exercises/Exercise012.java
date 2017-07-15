package br.com.edsilfer.algorithms.exercises;

import java.util.Scanner;

/**
 * Fibonacci
 */
public class Exercise012 {

    public static int fibonacci(int n) {
        int prev = 1;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int temp = res;
            res = prev + res;
            prev = temp;
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }

}
