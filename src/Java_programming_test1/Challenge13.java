package Java_programming_test1;

import java.util.Scanner;

/***
 * Multiplication Table (Nested Loops)
 * Write a program to print multiplication tables using nested loops.
 *
 * **Requirements:**
 * - Print multiplication tables for numbers 1 to 5
 * - Each table should show multiplications from 1 to 10
 * - Use nested for loops
 * - Format output clearly
 *
 * Examples:
 * Input:
 * No input
 * Output:
 * Table of 1: 1 x 1 = 1 1 x 2 = 2 ... Table of 2: 2 x 1 = 2 2 x 2 = 4 ...
 */
public class Challenge13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range=scan.nextInt();

        for(int i=1;i<=range;i++){
            System.out.println("Table of "+i);
            for(int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
