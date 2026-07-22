package Day26;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    Node head = null;
    Node tail = null;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Display in forward direction
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        list.display();

        sc.close();
    }
}