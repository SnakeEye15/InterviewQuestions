package Java_programming_test1;

import java.util.Scanner;

/***
 * Operator Precedence and Type Casting
 * Write a program that demonstrates operator precedence and type casting in Java.
 *
 * **Requirements:**
 * - Show operator precedence with complex expressions
 * - Demonstrate implicit and explicit type casting
 * - Print results with explanations
 *
 * Examples:
 * Input:
 * 10 3.5
 * Output:
 * Expression result: 23 Implicit casting: 13.5 Explicit cast
 */
public class Challenge5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        double b=scanner.nextDouble();
        double test=(a*b+(a-b)/b-a+b);
        System.out.println("Expression results: "+test);
        System.out.println("Implicit casting: "+(a+b));
        System.out.println("Explicit cast: "+(a+(int)b));
    }
}
