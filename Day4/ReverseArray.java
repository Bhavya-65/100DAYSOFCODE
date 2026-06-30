package Day4;
import java.util.Scanner;

public class ReverseArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int n = sc.nextInt();
            int[] arr = new int[n];
    
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
    
            int left = 0;
            int right = n - 1;
    
            while (left < right) {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
    
                left++;
                right--;
            }
    
            // print reversed array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
    
            sc.close();
        }
    }

