package Day14;

import java.util.Scanner;

public class IdentityMatrix {

    static boolean isIdentityMatrix(int[][] matrix, int rows, int cols) {

        // Identity matrix must be square
        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                // Diagonal elements should be 1
                if (i == j && matrix[i][j] != 1) {
                    return false;
                }

                // Non-diagonal elements should be 0
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];


        // Input matrix elements
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();

            }
        }


        if (isIdentityMatrix(matrix, rows, cols)) {
            System.out.println("Identity Matrix");
        } 
        else {
            System.out.println("Not an Identity Matrix");
        }


        sc.close();
    }
}