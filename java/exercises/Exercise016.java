package br.com.edsilfer.algorithms.exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a number of dollars, , and a list of dollar values for  distinct coins, , find and print the number of different ways you can make change for  dollars if each coin is available in an infinite quantity.
 * <p>
 * Hints:
 * <p>
 * You can solve this problem recursively, but you must optimize your solution to eliminate overlapping subproblems using Dynamic Programming if you wish to pass all test cases. More specifically, think of ways to store the checked solutions and use the stored values to avoid repeatedly calculating the same values.
 * Think about the degenerate cases:
 * How many ways can you make change for  dollars?
 * How many ways can you make change for less than  dollars if you have no coins?
 * If you are having trouble defining the storage for your precomputed values, then think about it in terms of the base case .
 * Input Format
 * <p>
 * The first line contain two space-separated integers describing the respective values of  and .
 * The second line contains  space-separated integers describing the respective values of , where each integer denotes the dollar value of a distinct coin available in an infinite quantity.
 * <p>
 * Constraints
 * <p>
 * The list of coins contains  distinct integers where each integer denotes the dollar value of a coin available in an infinite quantity.
 * Output Format
 * <p>
 * Print a single integer denoting the number of ways we can make change for  dollars using an infinite supply of our  types of coins.
 * <p>
 * Sample Input 0
 * <p>
 * 4 3
 * 1 2 3
 * Sample Output 0
 * <p>
 * 4
 * Explanation 0
 * For  and  there are four solutions:
 * <p>
 * Thus, we print  on a new line.
 * <p>
 * Sample Input 1
 * <p>
 * 10 4
 * 2 5 3 6
 * Sample Output 1
 * <p>
 * 5
 * Explanation 1
 * For  and  there are five solutions:
 * <p>
 * Thus, we print  on a new line.
 */
public class Exercise016 {
    private static long countChanges(int change, int[] coins) {
        if (change == 0) return 1;
        if (coins.length == 0) return 0;

        Arrays.sort(coins);
        long[] combinations = new long[change + 1];
        combinations[0] = 1;

        for (int coin : coins) {
            for (int j = 1; j < combinations.length; j++) {
                if (j >= coin) {
                    combinations[j] += combinations[j - coin];
                }
            }
        }

        return combinations[change];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];

        for (int coins_i = 0; coins_i < m; coins_i++) {
            coins[coins_i] = in.nextInt();
        }

        System.out.println(countChanges(n, coins));
    }
}
