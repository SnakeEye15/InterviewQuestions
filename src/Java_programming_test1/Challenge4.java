package Java_programming_test1;
import java.util.*;
/***
 * Increment and Decrement Operators
 * Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
 *
 * **Requirements:**
 * - Show the difference between ++i and i++
 * - Show the difference between --i and i--
 * - Print values before and after operations
 *
 * Examples:
 * Input:
 * 5
 * Output:
 * Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)
 */
public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();

        System.out.println("Original: "+a);

        int preInc = ++a;
        System.out.println("After Pre-increment (++a): " + preInc + " (value becomes " + a + ")");

        // Post-increment
        int postInc = a++;
        System.out.println("Post-increment (a++): " + postInc + " (value becomes " + a + ")");

        // Pre-decrement
        int preDec = --a;
        System.out.println("After Pre-decrement (--a): " + preDec + " (value becomes " + a + ")");

        // Post-decrement
        int postDec = a--;
        System.out.println("Post-decrement (a--): " + postDec + " (value becomes " + a + ")");
    }
}
