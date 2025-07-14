package Practice;
// Swap two integers, say a = 10, b = 20, without using a temp variable.
import java.util.Scanner;
public class Swap_two_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the num1:");
        int a=scan.nextInt();
        System.out.println("Please enter the num2:");
        int b=scan.nextInt();

        System.out.println("Before swapping:");
        System.out.printf("a is: %d\n b is : %d ",a,b);
        System.out.println();
        //Swapping login
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping:");
        System.out.printf("a is: %d\n b is : %d ",a,b);
        System.out.println();
    }
}
