package Arrays.SortingAlgorithms;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = creatematrix() ;
        int[][] matrix2 = creatematrix() ;
        int[][] result = AddMatrices(matrix1,matrix2);
        printMatrix(result);

    }



    public static int[][] AddMatrices(int[][] matrix1, int[][] matrix2) {
        int matrix1row = matrix1.length;
        int matrix2row = matrix2.length;
        int[][] result = new int[matrix1row][matrix1[0].length];
        for (int i = 0; i < matrix1row; i++) {
            int col = matrix1[i].length;
            for (int j = 0; j < col ; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result ;
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

    static void printMatrix(int[][] matrix){
        int row = matrix.length;
        System.out.println("The array is :");
        for (int i = 0; i < row; i++) {
            int col = matrix[row].length;
            for (int j = 0; j < col; j++) {
                System.out.print( matrix[i][j] +"  ");
            }
            System.out.println();
        }

    }

}
