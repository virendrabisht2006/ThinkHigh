package com.think.core.java.collection;

/**
 * Created by esha on 20/02/17.
 */
public class MergeSortedList {

    public static void main(String[] args) {

        //first list creation
        Node node = new Node(0);
        Node header1 = null, temp = node;
        header1 =node;
        node = new Node(2);
        temp.next = node;
        temp = temp.next;

        node = new Node(5);
        temp.next = node;
        temp = temp.next;

        node = new Node(7);
        temp.next = node;
        temp.next = null;

        display(header1);

        System.out.println("----------------");

        //2nd list creation
        Node node2 = new Node(3);
        Node header2 = node2, temp2 = node2;
        node2 = new Node(8);
        temp2.next = node2;
        temp2 = temp2.next;

        node2 = new Node(10);
        temp2.next = node2;
        temp2 = temp2.next;

        node2 = new Node(12);
        temp2.next = node2;
        temp2 = temp2.next;
        temp2.next =null;

        display(header2);

        Node header3 =null, temp3 = null;
        temp = header1; temp2 =header2;
        Node toAddedNode = null;
        while (temp !=null & temp2 !=null){
            if(temp.data<=temp2.data){
              toAddedNode = temp;
                temp = temp.next;
            }
            else{
                toAddedNode = temp2;
                temp2 = temp2.next;
            }

            if(header3 ==null){
                header3 = toAddedNode;
                temp3 =toAddedNode;
            }
            else{
                temp3.next = toAddedNode;
                temp3 =temp3.next;
            }
        }

        while (temp != null){
            temp3.next =temp;
            temp = temp.next;
            temp3 =temp3.next;
        }

        while (temp2 != null){
            temp3.next =temp2;
            temp2 = temp2.next;
            temp3 =temp3.next;
        }

        System.out.println("Merged List");

        display(header3);
    }

    public static void display(Node start){
        for(Node temp = start; temp!=null; temp=temp.next){
            System.out.println(temp.data);
        }
    }
}

class Node{
      int data;
        Node next;
    Node(int data){
        this.data = data;
    }
}
