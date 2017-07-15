package br.com.edsilfer.algorithms.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
 * <p>
 * Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().
 * <p>
 * A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].
 * <p>
 * By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:
 * <p>
 * It contains no unmatched brackets.
 * The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
 * Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer, , denoting the number of strings.
 * Each line  of the  subsequent lines consists of a single string, , denoting a sequence of brackets.
 * <p>
 * Constraints
 * <p>
 * , where  is the length of the sequence.
 * Each character in the sequence will be a bracket (i.e., {, }, (, ), [, and ]).
 * Output Format
 * <p>
 * For each string, print whether or not the string of brackets is balanced on a new line. If the brackets are balanced, print YES; otherwise, print NO.
 */
public class Exercise007 {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().equals(matching(c))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size() == 0;
    }

    private static char matching(char c) {
        switch (c) {
            case '{':
                return '}';
            case '[':
                return ']';
            case '(':
                return ')';
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            default:
                return ' ';
        }
    }

    public static void main(String[] args) throws IOException {
        String input = "res/exercise007_input.txt";
        String output = "res/exercise007_output.txt";

        List<String> results = Files.readAllLines(Paths.get(input));
        List<String> answers = Files.readAllLines(Paths.get(output));

        System.out.println("results.size() == answers.size(): " + (results.size() == answers.size()));

        boolean success = true;
        for (int i = 0; i < results.size(); i++) {
            String result = isBalanced(results.get(i)) ? "YES" : "NO";
            if (!result.equals(answers.get(i))) {
                success = false;
                break;
            }
            System.out.println("pos: " + i + " result: " + result + " answer: " + answers.get(i));
        }

        if (!success) {
            System.out.println("Sorry, algorithm is wrong");
        } else {
            System.out.println("YEY, IT'S ALL RIGHT!");
        }
    }
}

