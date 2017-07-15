package br.com.edsilfer.algorithms.exercises;

import java.util.Scanner;

/**
 * Consider the following version of Bubble Sort:
 * <p>
 * for (int i = 0; i < n; i++) {
 * // Track number of elements swapped during a single array traversal
 * int numberOfSwaps = 0;
 * <p>
 * for (int j = 0; j < n - 1; j++) {
 * // Swap adjacent elements if they are in decreasing order
 * if (a[j] > a[j + 1]) {
 * swap(a[j], a[j + 1]);
 * numberOfSwaps++;
 * }
 * }
 * <p>
 * // If no elements were swapped during a traversal, array is sorted
 * if (numberOfSwaps == 0) {
 * break;
 * }
 * }
 * Task
 * Given an -element array, , of distinct elements, sort array  in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:
 * <p>
 * Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 * First Element: firstElement, where  is the first element in the sorted array.
 * Last Element: lastElement, where  is the last element in the sorted array.
 * Hint: To complete this challenge, you must add a variable that keeps a running tally of all swaps that occur during execution.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of elements in array .
 * The second line contains  space-separated integers describing the respective values of .
 * <p>
 * Constraints
 * <p>
 * ,
 * Output Format
 * <p>
 * You must print the following three lines of output:
 * <p>
 * Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 * First Element: firstElement, where  is the first element in the sorted array.
 * Last Element: lastElement, where  is the last element in the sorted array.
 * Sample Input 0
 * <p>
 * 3
 * 1 2 3
 * Sample Output 0
 * <p>
 * Array is sorted in 0 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 0
 * The array is already sorted, so  swaps take place and we print the necessary three lines of output shown above.
 * <p>
 * Sample Input 1
 * <p>
 * 3
 * 3 2 1
 * Sample Output 1
 * <p>
 * Array is sorted in 3 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 1
 * The array is not sorted, and its initial values are: . The following  swaps take place:
 * <p>
 * At this point the array is sorted and we print the necessary three lines of output shown above.
 */
public class Exercise009 {
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

    private static void printResult(int[] input) {
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + input[0]);
        System.out.println("Last Element: " + input[input.length - 1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        sort(a);
        printResult(a);
    }
}
