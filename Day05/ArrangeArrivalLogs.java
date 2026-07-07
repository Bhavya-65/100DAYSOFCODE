package Day05;
import java.util.Scanner;

public class ArrangeArrivalLogs {
    
    static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int[] arr1 = new int[p];

        for (int i = 0; i < p; i++) {
            arr1[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] arr2 = new int[q];

        for (int i = 0; i < q; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = mergeArrays(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}

