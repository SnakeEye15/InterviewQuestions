package java_string_test3;

import java.util.Scanner;

/**
 * String Manipulation Basics
 * Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.
 *
 * Examples:
 * Input:
 * Hello World
 * Output:
 * Length: 11, First char: H, Substring: World
 */
public class Challenge1 {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println("Length: "+str.length());
        System.out.println("Char: "+str.charAt(0));
        System.out.println("Substring: "+str.substring(5,11));
    }

}
