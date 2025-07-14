package Practice;

import java.util.Scanner;

public class ReverseOfStringInBuildFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String you want to check: ");
        String str=scan.next();
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());

    }
}
