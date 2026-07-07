package Day02;
import java.util.Scanner;

public class Delete {
    

    static int[] deleteElement(int[] arr, int pos) {

        int n = arr.length;
        int[] ans = new int[n - 1];

        // Copy elements before the deleted position
        for (int i = 0; i < pos - 1; i++) {
            ans[i] = arr[i];
        }

        // Copy remaining elements (skip the deleted one)
        for (int i = pos; i < n; i++) {
            ans[i - 1] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();

        int[] result = deleteElement(arr, pos);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}

