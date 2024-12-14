/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaca2;

import java.util.Scanner;

/**
 *
 * @author colmj
 */
public class JavaCA2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //sc is object of scanner class
        Scanner sc=new Scanner(System.in);
        
        //Input size of the square matrix
         System.out.print("Enter size of the coloum matrix: ");
        int row=sc.nextInt();
        
        System.out.print("Enter size of the coloum matrix: ");
        int col=sc.nextInt();
        
        //intilaze the square matrix
        int[][] matrix = new int[row][col];
    }
    
}
