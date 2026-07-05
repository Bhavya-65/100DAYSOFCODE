package Day9;
import java.util.Scanner;

public class ReverseString {
    
    static String reverseString(String str){
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverseString(str));

        sc.close();
    }
}
