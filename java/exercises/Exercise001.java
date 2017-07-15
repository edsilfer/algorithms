package br.com.edsilfer.algorithms.exercises;

import br.com.edsilfer.algorithms.util.Utils;

/**
 * Build an algorithm to shift left a given array of integers
 */
public class Exercise001 {
    private static final int[] INPUT = {1, 2, 3, 4, 5};
    private static final int NUMBER_ROTATIONS = 1;

    public static void main(String argv[]) {
        System.out.print("Array before rotation(s): ");
        Utils.print(INPUT);

        System.out.print("Array after rotation(s): ");
        Utils.print(rotate(INPUT, NUMBER_ROTATIONS));
    }

    private static int[] rotate(int[] input, int times) {
        int[] result = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            int pos = i + times;
            if (pos > input.length - 1) {
                pos -= input.length;
            }
            result[i] = input[pos];
        }

        return result;
    }
}
