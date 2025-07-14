package Java_programming_test1;

import java.util.Scanner;

/***
 * Factorial Calculator (While Loop)
 * Create a program to calculate factorial of a number using while loop.
 *
 * **Requirements:**
 * - Read a positive integer from user input
 * - Use while loop to calculate factorial
 * - Handle edge case for 0! = 1
 * - Use appropriate data type to handle large results
 *
 * Examples:
 * Input:
 * 5
 * Output:
 * Factorial of 5 is: 120
 */
public class Challenge12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input=scan.nextInt();
        if(input>0){
            System.out.println("Factorial of "+input+" is: "+factorial(input));
        }else{
            System.out.println("Factorial of "+input+" is: 1");
        }

    }
    public static double factorial(int n){
        double fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }
}
