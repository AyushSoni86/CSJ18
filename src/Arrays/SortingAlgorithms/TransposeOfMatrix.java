package Arrays.SortingAlgorithms;

import java.util.Scanner;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = creatematrix() ;
        int[][] result = TransposeMatrix(matrix1) ;
        printMatrix(result);
    }

    static  int[][] creatematrix(){
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row = sc.nextInt();
        System.out.println("Enter the number of columns");
        col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the matrix values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;
    }

    static int[][] TransposeMatrix(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix[col][row];
            }
        }
        return result;
    }

    static void printMatrix(int[][] matrix){
        int row = matrix.length;
        System.out.println("The array is :");
        for (int i = 0; i < row; i++) {
            int col = matrix[i].length;
            for (int j = 0; j < col; j++) {
                System.out.print( matrix[i][j] +"  ");
            }
            System.out.println();
        }

    }
}
