package Arrays.SortingAlgorithms;

import java.util.Scanner;

public class MultiDimensionalArray
{
    public static void main(String[] args) {

    }
    static  int[][] matrix(){
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
