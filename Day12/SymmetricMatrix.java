package Day12;
import java.util.Scanner;

public class SymmetricMatrix {
    static boolean isSymmetric(int[][] matrix, int rows, int cols) {
        // Matrix should be square
        if (rows != cols) {
            return false;
        }
        // Check transpose condition
        for (int i = 0; i < rows; i++) {

            for (int j = i + 1; j < cols; j++) {

                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];


        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }


        if (isSymmetric(matrix, m, n)) {
            System.out.println("Symmetric Matrix");
        }
        else {
            System.out.println("Not a Symmetric Matrix");
        }
        sc.close();
    }
}