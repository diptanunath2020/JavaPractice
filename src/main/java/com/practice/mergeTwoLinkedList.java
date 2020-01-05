package com.practice;

public class mergeTwoLinkedList {


}

class Node{

    Node nextNode;
    int item;

    public Node(int d) {

        nextNode=null;
        item=d;
    }
}

class MergeLists{

    Node head;
    public void addToLast(Node node){

        if(head==null){
            head=node;
        }
        else{

            Node temp=head;
            while(temp.nextNode!=null)
                temp=temp.nextNode;
            temp.nextNode=node;
        }
    }
    public void print() {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.item + " ");
            temp = temp.nextNode;
        }
        System.out.println();

    }


    public static void main(String[] args) {
        MergeLists l1=new MergeLists();
        MergeLists l2=new MergeLists();
        l1.addToLast(new Node(2));
        l1.addToLast(new Node(3));
        l1.addToLast(new Node(4));

        l2.addToLast(new Node(5));
        l2.addToLast(new Node(10));
        l2.addToLast(new Node(15));

        l1.print();


    }

}

