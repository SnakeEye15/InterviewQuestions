package java_wrapper_test4;

import java.util.Scanner;

/**
 * Write a program that demonstrates try-catch-finally block with division operation.
 *
 * Examples:
 * Input:
 * 10, 2
 * Output:
 * Result: 5 Finally block executed
 * 💡 Explanation:Normal division execution with finally block
 * Input:
 * 10, 0
 * Output:
 * Error: Cannot divide by zero Finally block executed
 * 💡 Explanation:
 */
public class Challenge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=scan.nextInt();
        System.out.println("Enter number 2:");
        int num2=scan.nextInt();
        try{
            System.out.println("Results: "+(num1/num2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally block executed..");
        }
    }
}
