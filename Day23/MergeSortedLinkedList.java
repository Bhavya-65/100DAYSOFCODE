package Day23;
import java.util.Scanner;

public class MergeSortedLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Merge two sorted linked lists
    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (head1 != null) {
            tail.next = head1;
        }

        if (head2 != null) {
            tail.next = head2;
        }

        return dummy.next;
    }

    // Print linked list
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First list
        int n = sc.nextInt();

        Node head1 = null, tail1 = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());

            if (head1 == null) {
                head1 = tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        // Second list
        int m = sc.nextInt();

        Node head2 = null, tail2 = null;

        for (int i = 0; i < m; i++) {
            Node newNode = new Node(sc.nextInt());

            if (head2 == null) {
                head2 = tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        Node mergedHead = merge(head1, head2);

        print(mergedHead);

        sc.close();
    }
}