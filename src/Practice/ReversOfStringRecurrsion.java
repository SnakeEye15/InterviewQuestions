package Practice;
//Write a program to reverse a string without using a loop without using an inbuilt function. -> recursive functions

import java.util.Scanner;

public class ReversOfStringRecurrsion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str= scan.next();
        String rev=reverse(str);
        System.out.println(rev);

    }

    public static String reverse(String str){
        if(str == null || str.length() <=1){
            return str;
        }else{
            return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
        }

    }

}
