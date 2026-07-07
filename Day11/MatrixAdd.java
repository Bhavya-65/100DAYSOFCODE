package Day11;

import java.util.Scanner;

public class MatrixAdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];

        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i < m; i++){
            for(int j = 0;j < n;j++){
                System.out.print((matrix1[i][j] + matrix2[i][j]));

                if (j < n-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}