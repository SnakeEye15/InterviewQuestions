package Java_programming_test1;

import java.sql.SQLOutput;
import java.util.Scanner;

/***
 * Find Largest of Three Numbers
 * Create a program to find the largest among three numbers using if-else statements.
 *
 * **Requirements:**
 * - Read three integers from user input
 * - Use nested if-else or if-else if statements
 * - Handle cases where numbers might be equal
 *
 * Examples:
 * Input:
 * 15 27 19
 * Output:
 * Largest number is: 27
 */
public class challenge7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        System.out.println("Largest is: "+max(num1,num2,num3));


    }
    public static int max(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }

}
