package com.think.core.java.collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by esha on 01/06/16.
 */
public class BinarySearchTree {
    private BTreeNode root;
    private HashMap<Integer, Integer> sumMap;

    BinarySearchTree(){
        this.root = null;
        sumMap = new HashMap<>();
    }

    class BTreeNode{
        int data;
        BTreeNode left;
        BTreeNode right;

        BTreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(10);
        binaryTree.add(15);
        binaryTree.add(8);
        binaryTree.add(5);
        binaryTree.add(9);
        binaryTree.add(18);
        binaryTree.add(12);

        System.out.println("----Binary Tree----");
      //  binaryTree.preOrder(binaryTree.root);

        System.out.println("*********************** Inorder********************");
        //binaryTree.add(18);
        binaryTree.inOrder(binaryTree.root);

        System.out.println("*********************** PreOrder********************");
        //binaryTree.add(18);
        binaryTree.preOrder(binaryTree.root);

        System.out.println("*********************** PostOrder********************");
        binaryTree.add(18);
        binaryTree.postOrder(binaryTree.root);

      //  binaryTree.popultaeSumMap(binaryTree.root, 0);

       // System.out.println("Check Map contain sum or not");

        //System.out.println(binaryTree.sumMap.containsKey(37));

        //System.out.println(binaryTree.sumMap);


    }

    public void add(int data){
       BTreeNode node = new BTreeNode(data);
        if(root ==null){
            root =node;
            return;
        }
       BTreeNode temp = root;
        while (true) {
            if(temp.data == data){
                System.out.println("Tree already contain this node with data: "+data);
                break;
            }
            if (temp.data > data) {
                if (temp.left ==null) {
                    temp.left =node;
                    break;
                }
                temp = temp.left;

            }
            else if(temp.data < data){
                if(temp.right==null){
                    temp.right=node;
                    break;
                }
                temp = temp.right;
            }
        }
    }

    public void delete(int data){

    }

    public void inOrder(BTreeNode node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
        }
        System.out.println();
    }

    public void preOrder(BTreeNode node){
        if(node != null){
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(BTreeNode node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);

        }
    }

    public void popultaeSumMap(BTreeNode node, int sum){
        if(node != null){
            sum = sum + node.data;
            if(node.left==null && node.right ==null){
                sumMap.put(sum, sum);
            }
            popultaeSumMap(node.left, sum);
            popultaeSumMap(node.right, sum);
        }
    }
}
