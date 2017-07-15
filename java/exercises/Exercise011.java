package br.com.edsilfer.algorithms.exercises;

import java.util.Scanner;

/**
 * In an array, , the elements at indices  and  (where ) form an inversion if . In other words, inverted elements  and  are considered to be "out of order". To correct an inversion, we can swap adjacent elements.
 * <p>
 * For example, consider . It has two inversions:  and . To sort the array, we must perform the following two swaps to correct the inversions:
 * <p>
 * Given  datasets, print the number of inversions that must be swapped to sort each dataset on a new line.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of datasets.
 * The  subsequent lines describe each respective dataset over two lines:
 * <p>
 * The first line contains an integer, , denoting the number of elements in the dataset.
 * The second line contains  space-separated integers describing the respective values of .
 * <p>
 *
 * SOLUTION IS CORRECT BUT I DID NOT UNDERSTAND
 */
public class Exercise011 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
        }
    }
}
