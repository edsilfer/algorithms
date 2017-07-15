package br.com.edsilfer.algorithms.exercises;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
 * <p>
 * Complete the function provided in the editor below. It has one parameter: a pointer to a Node object named that points to the head of a linked list. Your function must return a boolean denoting whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.
 * <p>
 * Note: If the list is empty,  will be null.
 * <p>
 * Input Format
 * <p>
 * Our hidden code checker passes the appropriate argument to your function. You are not responsible for reading any input from stdin.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * If the list contains a cycle, your function must return true. If the list does not contain a cycle, it must return false. The binary integer corresponding to the boolean value returned by your function is printed to stdout by our hidden code checker.
 * <p>
 * Sample Input
 * <p>
 * The following linked lists are passed as arguments to your function:
 */
public class Exercise006 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String argv[]) {
        System.out.println(hasCycle(testCase1()));
        System.out.println(hasCycle(testCase2()));
    }

    private static Node testCase1() {
        return new Node(1);
    }

    private static Node testCase2() {
        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node1 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node2;

        return node1;
    }

    private static boolean hasCycle(Node head) {
        List<Node> lookup = new ArrayList<>();

        while (head != null) {
            if (head.next != null) {
                if (lookup.contains(head.next)) {
                    return true;
                } else {
                    lookup.add(head.next);
                }
            }
            head = head.next;
        }

        return false;
    }
}
