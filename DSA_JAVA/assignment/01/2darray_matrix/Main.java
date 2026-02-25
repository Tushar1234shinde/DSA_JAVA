import java.util.Scanner;

class MatrixOperation {

    // Method to accept elements
    public void acceptMatrix(int[][] matrix, int rows, int cols, Scanner sc) {
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    public void displayMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public int[][] addMatrix(int[][] a, int[][] b, int rows, int cols) {
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to transpose matrix
    public int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        MatrixOperation obj = new MatrixOperation();

        System.out.println("Matrix 1:");
        obj.acceptMatrix(matrix1, rows, cols, sc);

        System.out.println("Matrix 2:");
        obj.acceptMatrix(matrix2, rows, cols, sc);

        System.out.println("\nMatrix 1:");
        obj.displayMatrix(matrix1, rows, cols);

        System.out.println("\nMatrix 2:");
        obj.displayMatrix(matrix2, rows, cols);

        // Addition
        int[][] sum = obj.addMatrix(matrix1, matrix2, rows, cols);
        System.out.println("\nAddition of Matrices:");
        obj.displayMatrix(sum, rows, cols);

        // Transpose of first matrix
        int[][] transpose = obj.transposeMatrix(sum, rows, cols);
        System.out.println("\nTranspose of Matrix Sum:");
        obj.displayMatrix(transpose, cols, rows);

        sc.close();
    }
}