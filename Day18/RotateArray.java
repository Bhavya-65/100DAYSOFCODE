package Day18;
import java.util.Scanner;

public class RotateArray {

    static void rotate(int[] arr, int k) {

        int n = arr.length;

        int[] ans = new int[n];


        k = k % n;  // handles k greater than n


        for(int i = 0; i < n; i++) {

            ans[(i + k) % n] = arr[i];

        }


        for(int i = 0; i < n; i++) {

            arr[i] = ans[i];

        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }


        int k = sc.nextInt();


        rotate(arr, k);


        for(int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");

        }


        sc.close();
    }
}