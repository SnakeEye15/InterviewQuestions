package Java_programming_test1;

import java.util.Scanner;

/***
 * Print Numbers Using For Loop
 * Write a program to print numbers from 1 to N using a for loop.
 *
 * **Requirements:**
 * - Read the value of N from user input
 * - Use for loop to print numbers from 1 to N
 * - Print numbers in a single line separated by spaces
 *
 * Examples:
 * Input:
 * 5
 * Output:
 * 1 2 3 4 5
 */
public class Challenge11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();

        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}
