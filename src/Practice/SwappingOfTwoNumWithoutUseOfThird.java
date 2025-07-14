package Practice;
//Swap two numbers without using a third variable
import java.util.Scanner;

public class SwappingOfTwoNumWithoutUseOfThird {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the value of first number: ");
        int a=scan.nextInt();
        System.out.println("Please enter the value of Second number: ");
        int b=scan.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        scan.close();
    }
}
