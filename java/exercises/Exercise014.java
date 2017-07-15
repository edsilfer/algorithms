package br.com.edsilfer.algorithms.exercises;

import java.util.Scanner;

/**
 * Created by ferna on 5/20/2017.
 */
public class Exercise014 {

    private static int swaps = 0;

    private static void sort(int[] input) {
        int lastSorted = input.length;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastSorted - 1; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i);
                    isSorted = false;
                }
            }
            lastSorted--;
        }
    }

    private static void swap(int[] input, int i) {
        swaps++;
        int temp = input[i];
        input[i] = input[i + 1];
        input[i + 1] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int arr[] = new int[n];

            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }

            sort(arr);

            System.out.println(swaps);
            swaps = 0;
        }
    }
}
