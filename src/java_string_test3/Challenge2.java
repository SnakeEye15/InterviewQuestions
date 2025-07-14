package java_string_test3;

/**
 * String Comparison and Equality
 * Create a program that demonstrates different ways to compare strings in Java, including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
 *
 * Examples:
 * Input:
 * String1: "Hello", String2: "hello", String3: "Hello"
 * Output:
 * equals(): false, equalsIgnoreCase(): true, compareTo(): -32
 */
public class Challenge2 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="HELLO";

        System.out.println("equals(): "+str1.equals(str2));
        System.out.println("ComapareTo(): "+str1.compareTo(str2));
        System.out.println("==: "+(str1==str2));
        System.out.println("equalIgnoreCase(): "+ str1.equalsIgnoreCase(str2));
    }
}
