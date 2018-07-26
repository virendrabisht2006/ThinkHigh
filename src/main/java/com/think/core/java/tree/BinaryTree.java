package com.think.core.java.tree;

/**
 * Created by esha on 03/05/18.
 */

public class BinaryTree {
    //Root of the Binary Tree
    Node root;

    /* Driver program to test above functions */
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        // tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(6);

        if (tree.isBinarySearchTree())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");

        if (tree.isTreeBalanced(tree.root)) {
            System.out.println("Tree is balanced tree");
        } else
            System.out.println("Given tree is not height balanced");
    }

    boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
    boolean isBinarySearchTree(Node node, int min, int max) {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBinarySearchTree(node.left, min, node.data - 1) &&
                isBinarySearchTree(node.right, node.data + 1, max));
    }

    boolean isTreeBalanced(Node node) {

        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        int lh = height(node.left);
        int rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
                && isTreeBalanced(node.left)
                && isTreeBalanced(node.right))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }

    /* UTILITY FUNCTIONS TO TEST isTreeBalanced() FUNCTION */
    /*  The function Compute the "height" of a tree. Height is the
        number of nodes along the longest path from the root node
        down to the farthest leaf node.*/
    int height(Node node) {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(
                height(node.left), height(node.right)
        );
    }

}

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        this.data = item;
        this.left = this.right = null;
    }
}