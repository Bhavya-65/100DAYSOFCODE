package Day03;
import java.util.Scanner;

public class LinearSearch {
    
    static void linearSearch(int[] arr, int key) {

        int comparisons = 0;

        for (int i = 0; i < arr.length; i++) {

            comparisons++;

            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                System.out.println("Comparisons = " + comparisons);
                return;
            }
        }

        System.out.println("Not Found");
        System.out.println("Comparisons = " + comparisons);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        linearSearch(arr, key);

        sc.close();
    }
}

