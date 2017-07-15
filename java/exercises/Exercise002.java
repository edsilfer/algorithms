package br.com.edsilfer.algorithms.exercises;

import br.com.edsilfer.algorithms.util.Builder;
import br.com.edsilfer.algorithms.util.Samples;
import br.com.edsilfer.algorithms.util.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * For the purposes of this challenge, we define a binary search tree to be a binary tree with the following ordering properties:
 * <p>
 * The  value of every node in a node's left subtree is less than the data value of that node.
 * The  value of every node in a node's right subtree is greater than the data value of that node.
 * Given the root node of a binary tree, can you determine if it's also a binary search tree?
 * <p>
 * Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must return a boolean denoting whether or not the binary tree is a binary search tree. You may have to write one or more helper functions to complete this challenge.
 * <p>
 * Note: We do not consider a binary tree to be a binary search tree if it contains duplicate values.
 * <p>
 * Input Format
 * <p>
 * You are not responsible for reading any input from stdin. Hidden code stubs will assemble a binary tree and pass its root node to your function as an argument.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * You are not responsible for printing any output to stdout. Your function must return true if the tree is a binary search tree; otherwise, it must return false. Hidden code stubs will print this result as a Yes or No answer on a new line.
 */
public class Exercise002 {

    public static void main(String argv[]) {
        TreeNode rootSample1 = Builder.buildTree(Samples.SAMPLE_INT_ARRAY_WITH_REPETITIONS, 5);
        System.out.println(checkBST(rootSample1));
    }

    private static boolean checkBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        treeToList(root, list);
        return isListOrdered(list);
    }

    private static boolean isListOrdered(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size() && list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static void treeToList(TreeNode root, List<Integer> list) {
        if (root == null) return;
        treeToList(root.left, list);
        list.add(root.data);
        treeToList(root.right, list);
    }
}
