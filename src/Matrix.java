import java.util.Scanner;

public class Matrix {
    public static int[][] createMatrix(int n , int m){
        int[][] Matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Type in element ("+ i + " " + j + ")");
                Scanner a = new Scanner(System.in);
                Matrix[i][j] = a.nextInt();
            }
        }
        return Matrix;
    }

    public static int[][] createTMatrix(int[][] Matrix, int n,int m) {
        int[][] TMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                TMatrix[i][j] = Matrix[j][i];
            }
        }
        return TMatrix;
    }

    public static void printMatrix(int[][] Matrix,int n , int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
