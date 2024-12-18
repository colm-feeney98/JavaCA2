/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//https://github.com/colm-feeney98/JavaCA2.git
package javaca2;
import java.util.Scanner;

/**
 *
 * @author colmj
 */

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the array before sorting
        System.out.print("Array before sorting: ");
        printArray(array);

        // Sort the array using Bubble Sort and count swaps
        int swapCount = bubbleSort(array);

        // Display the array after sorting
        System.out.print("Array after sorting: ");
        printArray(array);

        // Display the total number of swaps
        System.out.println("Total number of swaps: " + swapCount);
    }
//printArray method iterates through the array and prints each element:
    private static int bubbleSort(int[] array) {
        int swapCount = 0;
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }

        return swapCount;
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


 
    
    

