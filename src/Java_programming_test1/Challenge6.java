package Java_programming_test1;

import java.sql.SQLOutput;
import java.util.Scanner;

/***
 * Number Classification
 * Write a program to check if a number is positive, negative, or zero.
 *
 * **Requirements:**
 * - Read an integer from user input
 * - Use if-else statements to classify the number
 * - Print appropriate message for each case
 *
 * Examples:
 * Input:
 * 15
 * Output:
 * 15 is positive
 */
public class Challenge6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();

        if(num>0){
            System.out.println(num+" is positive.");
        }else if(num<0){
            System.out.println(num+" is negative.");
        }else{
            System.out.println(num+" is zero.");
        }
    }
}
