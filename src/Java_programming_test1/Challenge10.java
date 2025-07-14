package Java_programming_test1;

import java.util.Scanner;

/***
 * Simple Calculator (Switch Statement)
 * Write a program to create a simple calculator using switch statement.
 *
 * **Requirements:**
 * - Read two numbers and an operator (+, -, *, /)
 * - Use switch statement to perform the operation
 * - Handle division by zero
 * - Display the result
 *
 * Examples:
 * Input:
 * 15.5 4.5 +
 * Output:
 */
public class Challenge10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        char operator=scan.next().charAt(0);

        switch (operator){
            case 43:
                System.out.println("Results: "+(num1+num2));
                break;
            case 45:
                System.out.println("Results: "+(num1-num2));
                break;
            case 42:
                System.out.println("Results: "+(num1*num2));
                break;
            case 47:
                if(num2>0){
                    System.out.println("Results: "+(num1/num2));
                }else{
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
