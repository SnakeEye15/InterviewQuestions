package java_wrapper_test4;

import java.util.*;
import java.util.Scanner;

/**
 * Write a program that catches both `ArithmeticException` and `ArrayIndexOutOfBoundsException`.
 *
 * Examples:
 * Input:
 * Division by zero in array operation
 * Output:
 * Exception caught: ArithmeticException or ArrayIndexOutOfBoundsException
 * 💡 Explanation:Multi-catch block handles both exception types
 */
public class Challenge4 {
    public static void main(String[] args) {
        try {
            int num[] = {23, 3, 54, 2, 532, 34};
            int results=num[5]/0;
            System.out.println(results);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
