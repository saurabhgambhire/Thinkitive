package com.thinkitive.datastructure.LinkedList;

public class LL {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add - first, last

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add - last

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("List is Null");
            return;
        }
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }


    // delete - first and last

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node lastNode = head;
        Node secondLast = null;

        while (lastNode.next != null) {
            secondLast = lastNode;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }



    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);
        ll.addFirst(15);
        ll.addLast(77);
        ll.addLast(88);
        ll.printList();
        System.out.println();
        //ll.deleteFirst();
        ll.deleteLast();
        ll.printList();


    }
}
