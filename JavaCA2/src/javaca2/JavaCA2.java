/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaca2;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author colmj
 */
public class JavaCA2{

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Handle edge cases for invalid sizes
        if (size <= 0) {
            System.out.println("Invalid array size.");
            return;
        }

        int[] array = new int[size];

        // Take the elements of the array as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the first repeated element
        int firstRepeated = findFirstRepeated(array);

        // Output the result
        if (firstRepeated != -1) {
            System.out.println("First repeated element: " + firstRepeated);
        } else {
            System.out.println("No repeated elements found.");
        }

        scanner.close();
    }

    private static int findFirstRepeated(int[] array) {
        // Use a HashSet to track seen elements
        HashSet<Integer> seen = new HashSet<>();

        for (int num : array) {
            // If the element is already in the set, it's the first repeated
            if (seen.contains(num)) {
                return num;
            }
            // Otherwise, add the element to the set
            seen.add(num);
        }

        // Return -1 if no repeated elements are found
        return -1;
    }
}


     

