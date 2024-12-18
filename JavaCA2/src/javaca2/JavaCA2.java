/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//https://github.com/colm-feeney98/JavaCA2.git
package javaca2;
//This imports the HashSet class, which is used to store unique elements and allows quick checks for existence.
import java.util.HashSet;
//This imports the Scanner class, used to take user input from the console.
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
        //Creates a Scanner object to read user input.
         Scanner scanner = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the size of the array: ");
        //Reads the input from the user and stores it in the variable size.
        int size = scanner.nextInt();

        //Checks if the user entered an invalid size (e.g., zero or negative).
//If the size is invalid, the program outputs a message and exits using return.
        if (size <= 0) {
            System.out.println("Invalid array size.");
            return;
        }
        //Initializes an integer array of the specified size.
        int[] array = new int[size];

        // Take the elements of the array as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the first repeated element
        int firstRepeated = findFirstRepeated(array);

        // Output the result
        //If findFirstRepeated returned -1, it means there are no repeated elements in the array.
 //Prints the first repeated element if found, or a message indicating no repeated elements.
        if (firstRepeated != -1) {
            System.out.println("First repeated element: " + firstRepeated);
        } else {
            System.out.println("No repeated elements found.");
        }

        scanner.close();
    }

    private static int findFirstRepeated(int[] array) {
        // Use a HashSet to track seen elements
        //It ensures quick lookups to check whether an element exists in the set.
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


     

