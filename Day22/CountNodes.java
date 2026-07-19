package Day22;
import java.util.Scanner;

public class CountNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Create Linked List
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Count Nodes
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.println(count);

        sc.close();
    }
}