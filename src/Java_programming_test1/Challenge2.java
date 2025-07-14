package Java_programming_test1;

import java.util.Scanner;

/***
 * Arithmetic and Assignment Operators
 * Create a Java program that demonstrates various arithmetic and assignment operators.
 *
 * **Requirements:**
 * - Use +, -, *, /, % operators
 * - Demonstrate assignment operators (=, +=, -=, *=, /=)
 * - Show the results of each operation
 *
 * Input:
 * 10 5
 * Output:
 * Addition: 15 Subtraction: 5 Multiplication: 50 Division: 2 Modulus: 0
 */
public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication : "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println("Modulus: "+(num1%num2));
    }
}
