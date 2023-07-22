package org.romkov.linkedlist;

public class LinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList list1 = new MySinglyLinkedList();

        for(int i=1;i<11;i++) list1.add(i);

        list1.printNodes();
        list1.reversedNodes();
        list1.printNodes();


    }
}
