package com.think.core.java.collection;

/**
 * Created by esha on 09/06/16.
 */
public class BinaryTree {
    private BTreeNode root;
    private static boolean left=true;
    BinaryTree(){
        this.root = null;
    }

    class BTreeNode{
        int data;
        BTreeNode left;
        BTreeNode right;
        int level;

        BTreeNode(int data,int level){
            this.data = data;
            this.left = null;
            this.right = null;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTreeNode node = binaryTree.new BTreeNode(1,0);
        binaryTree.root = node;

        node = binaryTree.new BTreeNode(2,1);
        binaryTree.root.left=node;

        node = binaryTree.new BTreeNode(3,1);
        binaryTree.root.right=node;

        node = binaryTree.new BTreeNode(4,2);
        binaryTree.root.left.left=node;

        node = binaryTree.new BTreeNode(5,2);
        binaryTree.root.left.right=node;

        node = binaryTree.new BTreeNode(6,2);
        binaryTree.root.right.left=node;

        node = binaryTree.new BTreeNode(7,2);
        binaryTree.root.right.right=node;

        node = binaryTree.new BTreeNode(8,3);
        binaryTree.root.left.left.left=node;

        node = binaryTree.new BTreeNode(9,3);
        binaryTree.root.left.left.right=node;

        node = binaryTree.new BTreeNode(10,3);
        binaryTree.root.left.right.left=node;

        node = binaryTree.new BTreeNode(11,3);
        binaryTree.root.left.right.right=node;

        node = binaryTree.new BTreeNode(12,3);
        binaryTree.root.right.left.left=node;

        node = binaryTree.new BTreeNode(13,3);
        binaryTree.root.right.left.right=node;

        node = binaryTree.new BTreeNode(14,3);
        binaryTree.root.right.right.left=node;

        node = binaryTree.new BTreeNode(15,3);
        binaryTree.root.right.right.right=node;

      /*  System.out.println("Inorder..");
        inOrder(binaryTree.root);

        System.out.println("PreOrder");
        preOrder(binaryTree.root);

        System.out.println("Postorder");
        postOrder(binaryTree.root);*/

        //  binaryTree.asOrder(binaryTree.root);

        binaryTree.levelOrder(binaryTree.root);


    }

    public void levelOrder(BTreeNode node){
        for(int level=0;level<=3;level++) {
            if (level == 0) {
                System.out.println(node.data);
            } else {
                System.out.println(node.left.data);
                node =node.left;
                System.out.println(node.right.data);
                node = node.right;
            }
        }
    }

    public void asOrder(BTreeNode node){
        if(node==null)
            return;

        if(root==node){
            System.out.println(node.data);
            System.out.println(node.left.data);
            System.out.println(node.right.data);
        }
        else{
            if(node.left!=null || node.right!=null) {
                System.out.println(node.left.data);
                System.out.println(node.right.data);
        }
    }

            asOrder(node.left);
            asOrder(node.right);

    }


    public static void inOrder(BTreeNode node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
        }
        System.out.println();
    }

    public static void preOrder(BTreeNode node){
        if(node != null){
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void postOrder(BTreeNode node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);

        }
    }
}
