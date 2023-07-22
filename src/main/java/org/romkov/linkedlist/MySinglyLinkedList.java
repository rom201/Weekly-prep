package org.romkov.linkedlist;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty(){
        return head==null;
    }
    // Adds element into last position in the linked list
    void add(int data){
        // create a new node with data value
        Node node=new Node(data);
        // check if empty

        if(isEmpty()){head=tail=node;
        }
        else { // add element to last position
            tail.next=node;
            tail=node;
        }
        size++;
    }


    void printNodes() {
        Node current=head;
        while(current!=null){
            if(current.next==null) System.out.print(current.value + "=> null");
            else System.out.print(current.value +"=>");
            current=current.next;
        }
        System.out.println();
    };










    void reversedNodes(){

        Node prior = null;
        Node current = head;

        while (current != null){
            Node temp = current;
            current = current.next;
            temp.next = prior;
            prior = temp;
//            if(prior.next==null) System.out.println("Node - "+prior.value + " with next: null ");
//            else System.out.println("Node - "+prior.value + " with next: "+prior.next.value);
        }
        tail = head;
        head = prior;

    }




}
