package Day1;

// Problem: Write a C program to insert an element x at a given 1-based position pos in an array of n integers. Shift existing elements to the right to make space.

// Input:
// - First line: integer n
// - Second line: n space-separated integers (the array)
// - Third line: integer pos (1-based position)
// - Fourth line: integer x (element to insert)

// Output:
// - Print the updated array (n+1 integers) in a single line, space-separated

// Example:
// Input:
// 5
// 1 2 4 5 6
// 3
// 3

// Output:
// 1 2 3 4 5 6

// Explanation: Insert 3 at position 3, elements [4,5,6] shift right

import java.util.Scanner;

public class Insert{

    static int[] insertElement(int[] arr, int pos, int x){

        int n = arr.length;
        int[] ans = new int[n + 1];

        //copy elements before insertion position

        for (int i = 0; i < pos - 1; i++){
            ans[i] = arr[i];
        }

        // insert new element

        ans[pos - 1] = x;

        //copy remaining elements

        for (int i = pos - 1; i < n; i++){
            ans[i + 1] = arr[i];
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();
        int x = sc.nextInt();

        int[] result = insertElement(arr, pos, x);

        for (int i = 0;i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}