package Day10;
import java.util.Scanner;
public class CheckPalindrome {
    
    static void isPalindrome(String s){

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)){
                System.out.println("NO");
                return;
            }

            left++;
            right--;
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isPalindrome(s);
        sc.close();
    }
}
