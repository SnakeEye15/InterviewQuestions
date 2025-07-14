package Practice;

import java.util.Scanner;

//Palidrome of String (chatAt())
public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string input: ");
        String str= scan.next();
        char ch[]=str.toCharArray();
        StringBuilder rev= new StringBuilder();
        for(int i=0;i<str.length();i++){
            rev.append(ch[i]);
        }
        String reverse=rev.toString();
        if(reverse.equals(str)){
            System.out.println("It's a palindrome String");
        }else{
            System.out.println("It's not a palindrome");
        }
    }
}
