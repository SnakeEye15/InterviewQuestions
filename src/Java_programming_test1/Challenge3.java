package Java_programming_test1;

import java.util.Scanner;

/***
 * Comparison and Logical Operators
 * Write a program that demonstrates comparison and logical operators.
 *
 * **Requirements:**
 * - Use comparison operators (==, !=, <, >, <=, >=)
 * - Use logical operators (&&, ||, !)
 * - Print boolean results with explanatory messages
 *
 * Examples:
 * Input:
 * 10 5
 * Output:
 * a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
 */
public class Challenge3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println("a==b: "+(a==b));
        System.out.println("a>b: "+(a>b));
        System.out.println("a<b: "+(a<b));
        System.out.println("(a>b) && (a>0): "+((a>b)&&(a>0)));
        System.out.println("(a<b) || (a>0): "+((a<b)||(a>0)));
        System.out.println("!(a>b): "+(!(a>b)));

    }
}
