package br.com.edsilfer.algorithms.exercises;

import br.com.edsilfer.algorithms.util.datastructure.Trie;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.
 * <p>
 * Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 * <p>
 * Input Format
 * <p>
 * The first line contains two space-separated integers describing the respective values of  (the number of words in the magazine) and  (the number of words in the ransom note).
 * The second line contains  space-separated strings denoting the words present in the magazine.
 * The third line contains  space-separated strings denoting the words present in the ransom note.
 * <p>
 * Constraints
 * <p>
 * .
 * Each word consists of English alphabetic letters (i.e.,  to  and  to ).
 * The words in the note and magazine are case-sensitive.
 * Output Format
 * <p>
 * Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.
 */
public class Exercise005 {

    private static final String[] ARG_RANSOM_NOTE = {"give", "one", "grand", "today"};
    private static final String[] ARG_MAGAZINE = {"give", "me", "one", "grand", "today", "night"};

    private static final Hashtable<String, Integer> availableWords = new Hashtable<>();

    public static void main(String argv[]) {
        addAvailableWords(availableWords, ARG_MAGAZINE);
        System.out.println(hasMatch(availableWords, ARG_RANSOM_NOTE) ? "Yes" : "No");
    }

    private static boolean hasMatch (Map<String, Integer> source, String[] text) {
        for (String word : text) {
            int count = source.getOrDefault(word, -1);
            if (count != -1) {
                source.put(word, count - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    private static void addAvailableWords(Map<String, Integer> target, String[] source) {
        for (String curr : source) {
            if (!target.containsKey(curr)) {
                target.put(curr, 0);
            } else {
                target.put(curr, target.get(curr) + 1);
            }
        }
    }
}
