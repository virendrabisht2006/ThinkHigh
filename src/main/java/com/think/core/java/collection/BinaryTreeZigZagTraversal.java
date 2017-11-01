package com.think.core.java.collection;

/**
 * Created by esha on 25/01/17.
 *
 */

/* to print the nodes in spiral order, nodes at different levels should be printed in alternating order.
        An additional Boolean variable ltr is used to change printing order of levels. If ltr is 1
        then printGivenLevel() prints nodes from left to right else from right to left.
        Value of ltr is flipped in each iteration to change the order.*/

public class BinaryTreeZigZagTraversal {

    public static Node root;

    class Node
    {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }



        // Function to print the spiral traversal of tree
        void printSpiral(Node node)
        {
            int h = height(node);
            int i;

        /* ltr -> left to right. If this variable is setto true then the
           given label is transversed from left to right */
            boolean ltr = false;
            for (i = 1; i <= h; i++)
            {
                printGivenLevel(node, i, ltr);

            /*Revert ltr to traverse next level in opposite order*/
                ltr = !ltr;
            }

        }

        /* Compute the "height" of a tree -- the number of
        nodes along the longest path from the root node
        down to the farthest leaf node.*/
        int height(Node node)
        {
            if (node == null)
                return 0;
            else
            {

            /* compute the height of each subtree */
                int lheight = height(node.left);
                int rheight = height(node.right);

            /* use the larger one */
                if (lheight > rheight)
                    return (lheight + 1);
                else
                    return (rheight + 1);
            }
        }

        /* Print nodes at a given level */
        void printGivenLevel(Node node, int level, boolean ltr)
        {
            if (node == null)
                return;
            if (level == 1)
                System.out.print(node.data + " ");
            else if (level > 1)
            {
                if (ltr != false)
                {
                    printGivenLevel(node.left, level - 1, ltr);
                    printGivenLevel(node.right, level - 1, ltr);
                }
                else
                {
                    printGivenLevel(node.right, level - 1, ltr);
                    printGivenLevel(node.left, level - 1, ltr);
                }
            }
        }
        /* Driver program to test the above functions */
        public static void main(String[] args)
        {
            BinaryTreeZigZagTraversal tree = new BinaryTreeZigZagTraversal();
            tree.root = tree.new Node(1);
            tree.root.left = tree.new Node(2);
            tree.root.right = tree.new Node(3);
            tree.root.left.left = tree.new Node(7);
            tree.root.left.right = tree.new Node(6);
            tree.root.right.left = tree.new Node(5);
            tree.root.right.right = tree.new Node(4);
            System.out.println("Spiral order traversal of Binary Tree is ");
            tree.printSpiral(tree.root);
        }
}
