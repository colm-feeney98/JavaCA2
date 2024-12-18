package javaca2;
//https://github.com/colm-feeney98/JavaCA2.git
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the multiplication table
        System.out.print("Enter size of multiplication table: ");
        int n = scanner.nextInt();

        // Create and populate the 2D array
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1); // Populate with multiplication values
            }
        }

        // Display the table in matrix form
        System.out.println("Multiplication Table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", table[i][j]); // Format output for better alignment
            }
            System.out.println(); // Move to the next row
        }
    }
}

