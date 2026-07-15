package Day19;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestToZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        int minSum = Integer.MAX_VALUE;

        int first = 0;
        int second = 0;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                first = arr[left];
                second = arr[right];
            }

            if(sum < 0) {
                left++;
            }
            else if(sum > 0) {
                right--;
            }
            else {
                break;
            }
        }

        System.out.println(first + " " + second);

        sc.close();
    }
}