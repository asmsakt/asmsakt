package com.mycompany.arrayyy;
import java.util.Scanner;

public class symmetric_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of cols: ");
        int col = input.nextInt();
        
        // Check if it's a square matrix
        if (row != col) {
            System.out.println("Matrix is not symmetric (not a square matrix).");
            return;
        } 
        
        int[][] matrix = new int[row][col];
        
        // Input elements into the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        boolean isSymmetric = true;
        
        // Check if the matrix is symmetric
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;  // Exit the inner loop when a mismatch is found
                }
            }
            if (!isSymmetric) {
                break;  // Exit the outer loop if already determined to be non-symmetric
            }
        }
        
        // Output the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}


