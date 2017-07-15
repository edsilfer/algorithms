package br.com.edsilfer.algorithms.util.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ferna on 5/16/2017.
 */
public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        HashMap<Character, Node> children = root.children;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            Node t;
            if (children.containsKey(c)) {
                t = children.get(c);
            } else {
                t = new Node(c);
                children.put(c, t);
            }

            children = t.children;

            if (i == word.length() - 1)
                t.isLeaf = true;
        }
    }

    public int count(String word) {
        Node t = searchNode(word);
        return t != null ? countRecursively(t) + 1 : 0;
    }

    private int countRecursively(Node root) {
        if (root == null || root.children.size() == 0) return 0;

        for (Node curr : root.children.values()) {
            countRecursively(curr);
        }

        return root.children.size();
    }

    public boolean search(String word) {
        Node t = searchNode(word);
        return t != null && t.isLeaf;
    }

    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    public Node searchNode(String str) {
        Map<Character, Node> children = root.children;
        Node t = null;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (children.containsKey(c)) {
                t = children.get(c);
                children = t.children;
            } else {
                return null;
            }
        }

        return t;
    }


    public class Node {
        char c;
        HashMap<Character, Node> children = new HashMap<>();
        boolean isLeaf;

        private Node() {
        }

        private Node(char c) {
            this.c = c;
        }
    }
}
