package Day13;

import java.util.Scanner;

public class SpiralMatrix {
    static void spiralTraversal(int[][] matrix, int r, int c) {

        int top = 0;
        int bottom = r - 1;

        int left = 0;
        int right = c - 1;


        while (top <= bottom && left <= right) {


            // Top row: left -> right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;


            // Right column: top -> bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;


            // Bottom row: right -> left
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }

                bottom--;
            }


            // Left column: bottom -> top
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }

                left++;
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];


        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }


        spiralTraversal(matrix, r, c);

        sc.close();
    }
}
