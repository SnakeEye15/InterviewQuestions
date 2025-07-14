package Practice;

import java.util.Scanner;

//Write a program to reverse a string without using inbuilt functions. -> forloop
public class ReverseOfString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the String input: ");
        String inputString = scanner.nextLine();
        char[] ch = inputString.toCharArray();
        // Use a StringBuilder to efficiently print the characters
        StringBuilder reverseOfInputString = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            reverseOfInputString.append(ch[i]);

        }
        System.out.println(reverseOfInputString.toString());
    }
}

