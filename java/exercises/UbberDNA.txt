package br.com.edsilfer.algorithms.exercises;

/**
 * Created by ferna on 5/20/2017.
 */
public class Ubber {
    public static void main(String[] args) {
        runTests();
    }

    private static final String[] ARG_GENES_OF_INTEREST = {"ACT", "AGT", "CGT"};

    /**
     * Iterates (O(n^2)over the given piece of DNA in order to find the shortest piece of DNA containing the given 3 genes
     *
     * @param input an String represent a piece of DNA
     * @return the shortest piece of DNA containing the given genes
     */
    private static String findShortestSequence(String input) {
        String shortest = input;

        for (int i = 0; i < input.length(); i++) {
            String current = findSequence(input, i);
            if (!current.equals("") && current.length() < shortest.length()) {
                shortest = current;
            }
        }
        return shortest.equals(input) ? "" : shortest;
    }

    private static String findSequence(String input, int startAt) {
        String sequence = "";

        while (!contains(sequence) && startAt < input.length()) {
            sequence += String.valueOf(input.charAt(startAt++));
        }

        return contains(sequence) ? sequence : "";
    }

    private static boolean contains(String text) {
        for (String gene : ARG_GENES_OF_INTEREST) {
            if (!text.contains(gene)) {
                return false;
            }
        }
        return true;
    }

    private static void runTests() {
        String case1 = "ACTACGTTTAGTAACTCGTCT";
        String case2 = "ACTACGTACTTTAG";

        String result = findShortestSequence(case1);
        System.out.println("Test case 1: " + result);
        assert (result.equals("AGTAACTCGT"));
        result = findShortestSequence(case2);
        System.out.println("Test case 2: " + result);
        assert (result.equals(""));

        System.out.println("Test cases finished successfully");
    }
}
