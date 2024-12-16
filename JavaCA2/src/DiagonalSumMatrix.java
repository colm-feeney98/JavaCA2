/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author colmj
 */
public class DiagonalSumMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the matrix
        System.out.print("Enter size of matrix: ");
        int size = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[size][size];

        // Prompt user to input the matrix elements row by row
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the main diagonal and the secondary diagonal
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            mainDiagonalSum += matrix[i][i]; // Main diagonal element
            secondaryDiagonalSum += matrix[i][size - i - 1]; // Secondary diagonal element
        }

        // Print the results
        System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
    }
}
    
    

