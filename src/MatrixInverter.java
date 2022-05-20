import java.util.Scanner;

public class MatrixInverter {
    public static void main(String[] args) {
        System.out.println("Please enter Matrix Size (N x M)");
        int m = getM();
        int n = getN();

        int[][] Matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Type in element ("+ i + " " + j + ")");
                Scanner a = new Scanner(System.in);
                Matrix[i][j] = a.nextInt();
            }
        }

        System.out.println("Your Matrix is:");
        printMatrix(Matrix,n,m);


        System.out.println("Your Transposition Matrix is:");
        int[][] TMatrix = getTMatrix(Matrix,n,m);
        printMatrix(TMatrix,m,n);


    }

    public static int[][] getTMatrix(int[][] Matrix, int n,int m) {
        int[][] TMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                TMatrix[i][j] = Matrix[j][i];
            }
        }
        return TMatrix;
    }

    public static int getM(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int getN(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
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