package Day15;

import java.util.Scanner;

public class TraceMatrix {
    static int diagonalSum(int[][] matrix, int m, int n) {

        int sum = 0;

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                if(i == j) {
                    sum += matrix[i][j];
                }

            }
        }

        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];


        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();

            }
        }


        System.out.println(diagonalSum(matrix, m, n));

        sc.close();
    }
}

