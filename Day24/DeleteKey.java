package Day24;

import java.util.Scanner;

public class DeleteKey {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Delete first occurrence of key
    static Node deleteKey(Node head, int key) {

        if (head == null) {
            return null;
        }

        // If key is at head
        if (head.data == key) {
            return head.next;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        // Key found
        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    // Print Linked List
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;

        // Input linked list
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insert(head, data);
        }

        int key = sc.nextInt();

        head = deleteKey(head, key);

        printList(head);

        sc.close();
    }
}