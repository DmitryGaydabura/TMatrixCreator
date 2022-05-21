import java.util.Scanner;

public class AppLogic {

    public static void start(){
        while (true) {

            System.out.println("To create transposition matrix from your matrix,Type in \"CreateTMatrix\"");
            Scanner in = new Scanner(System.in);
            if (in.nextLine().equalsIgnoreCase("CreateTMatrix")) {
                AppLogic.startTransposition();
                break;
            }
        }
    }

    public static void startTransposition(){
        System.out.println("Please enter Matrix Size (N x M)");
        int m = Utility.getM();
        int n = Utility.getN();
        int[][] matrix = Matrix.createMatrix(n,m);
        int[][] tMatrix = Matrix.createTMatrix(matrix,n,m);


        System.out.println("------------------------------");
        System.out.println("Your Matrix is: ");
        Matrix.printMatrix(matrix,n,m);
        System.out.println("------------------------------");
        System.out.println("Your Transposition Matrix is: ");
        Matrix.printMatrix(tMatrix,m,n);
        System.out.println("------------------------------");
    }


}
