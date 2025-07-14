package java_oops_exception_test2;

import java.util.Scanner;

/***
 * Multi-Exception Handling
 * Implement exception handling for a program that divides two numbers and catches ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.
 *
 * Examples:
 * Input:
 * Division by zero, invalid number format, array index out of bounds
 * Output:
 * ArithmeticException: Cannot divide by zero NumberFormatException: Invalid number format ArrayIndexOutOfBoundsException: Array index out of bounds
 */
public class Challenge14 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter number 1st: ");
            String input1 = scan.nextLine();
            System.out.println("Enter number 2nd: ");
            String input2 = scan.nextLine();

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            double results = (double) num1 / num2;
            System.out.println("result: " + results);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
    }
}
