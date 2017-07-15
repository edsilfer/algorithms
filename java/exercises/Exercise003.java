package br.com.edsilfer.algorithms.exercises;

/**
 * Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * <p>
 * Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?
 * <p>
 * Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
 * <p>
 * This challenge is also available in the following translations:
 * <p>
 * Chinese
 * Russian
 * Input Format
 * <p>
 * The first line contains a single string, .
 * The second line contains a single string, .
 * <p>
 * Constraints
 * <p>
 * It is guaranteed that  and  consist of lowercase English alphabetic letters (i.e.,  through ).
 * Output Format
 * <p>
 * Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
 * <p>
 * Sample Input
 * <p>
 * cde
 * abc
 * Sample Output
 * <p>
 * 4
 */
public class Exercise003 {

    private static final String ARG_WORD_A = "cde";
    private static final String ARG_WORD_B = "abc";

    public static void main(String argv[]) {
        System.out.println(numberNeeded(ARG_WORD_A, ARG_WORD_B));
    }

    private static int numberNeeded(String first, String second) {
        char[] firstArray = first.toCharArray();
        int count = 0;
        String newSecond = second;

        for (int i = 0; i < first.length(); i++) {
            if (newSecond.contains(String.valueOf(firstArray[i]))) {
                count++;
                newSecond = newSecond.replaceFirst(String.valueOf(firstArray[i]), "");
            }
        }

        return (second.length() - count) + (first.length() - count);
    }
}
