package br.com.edsilfer.algorithms.util.datastructure;

/**
 * Created by edgar on 15/05/17.
 */
public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(TreeNode left, TreeNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

}

