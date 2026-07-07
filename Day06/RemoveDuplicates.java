package Day06;

import java.util.Scanner;

public class RemoveDuplicates {
    
    static void removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return;
        }

        int j = 0;

        for (int i = 1; i<arr.length; i++){
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i<=j; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        removeDuplicates(arr);

        sc.close();
    }
}
