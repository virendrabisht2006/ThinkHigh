package com.think.core.java.collection;

/**
 * Created by esha on 01/06/16.
 */
public class LinkedList{

    private Node head;
    private Node start;

    LinkedList(){
        this.head=null;
        this.start=null;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(20);
        linkedList.add(15);
        linkedList.add(30);
        linkedList.add(200);
        linkedList.add(40);

        linkedList.display(linkedList.start);

    /*    System.out.println("---delte first element----");
        linkedList.delete(20);
        linkedList.display();*/

      //  System.out.println("---delete some b/w element--");
      //  linkedList.delete(30);

      //  linkedList.display(linkedList.start);

        System.out.println("---Reverse List-----");
        Node start1= linkedList.reverseList(linkedList.start);
        linkedList.display(start1);
    }

    public void add(int data){
        Node node =new Node(data);
        if(start==null){
            head =node;
            start =head;
        }
        else{
            head.next =node;
            head = head.next;
        }

    }

    public void delete(int data){
        if (start.data==data){
           start = start.next;
        }
        else {
            Node temp = start;
            Node tail = temp.next;
            while (tail != null) {
                if (tail.data == data) {
                    temp.next = tail.next;
                }
                temp = temp.next;
                tail = tail.next;
            }
        }
    }

    public void display(Node start){
      for(Node temp=start;temp!=null;temp=temp.next){
          System.out.println(temp.data);
      }
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next=null;
        }
    }

    public Node reverseList(Node current){
        Node  previous=null, nextNode=null;
        while (current !=null){
           nextNode = current.next;
            current.next =previous;
            previous = current;
            current = nextNode;
        }

       return previous;
    }
}
