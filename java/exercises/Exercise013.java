package br.com.edsilfer.algorithms.exercises;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by ferna on 5/18/2017.
 */
public class Exercise013 {

    private static int lonelyInteger(int[] a) {
        if (a.length == 1) return a[0];

        a = IntStream.of(a)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .mapToInt(i -> i)
                .toArray();

        for (int i = 0; i < a.length; i++) {
            if (i == 0 && a[i] != a[i + 1]) {
                return a[i];
            }

            if (i == a.length - 1 && a[a.length - 2] != a[i]) {
                return a[i];
            }

            if ((i - 1) > 0 && (i + 1) < a.length - 1 && a[i] > a[i - 1] && a[i] < a[i + 1]) {
                return a[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}
