package br.com.edsilfer.algorithms.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Stack;

/**
 * A queue is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.
 * <p>
 * A basic queue has the following operations:
 * <p>
 * Enqueue: add a new element to the end of the queue.
 * Dequeue: remove the element from the front of the queue and return it.
 * In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:
 * <p>
 * 1 x: Enqueue element  into the end of the queue.
 * 2: Dequeue the element at the front of the queue.
 * 3: Print the element at the front of the queue.
 * Input Format
 * <p>
 * The first line contains a single integer, , denoting the number of queries.
 * Each line  of the  subsequent lines contains a single query in the form described in the problem statement above. All three queries start with an integer denoting the query , but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.
 * <p>
 * Constraints
 * <p>
 * It is guaranteed that a valid answer always exists for each query of type .
 * Output Format
 * <p>
 * For each query of type , print the value of the element at the front of the queue on a new line.
 * <p>
 * Sample Input
 */
public class Exercise008 {


    public static void main(String[] args) throws IOException {
    }

    private static void parseCommand(String command) {
        String[] parts = command.split(" ");
        String decoded = parts.length > 1 ? parts[0] : command;

        switch (decoded) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            default:
        }

    }


}

