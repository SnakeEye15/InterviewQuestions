package Practice;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("For what you want to check the Palindrome 'String' or 'Number': ");
        Scanner scan = new Scanner(System.in);
        String check=scan.next();

        if(check.equalsIgnoreCase("Number")){
            System.out.println("Please enter the value for Number you want to check: ");
            int num=scan.nextInt();
            isPalindrome(num);

        }
        else if (check.equalsIgnoreCase("String")){
            System.out.println("Please enter the string you want to check: ");
            String str= scan.next();
            isPalindrome(str);
        }else{
            System.out.println("Invalid choice. Please enter either 'String' or 'Number'.");
        }

    }
    static void isPalindrome(int num){
        int original=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(original==rev){
            System.out.println("Great\nIt's a palindrome number");
        }else{
            System.out.println("Sorry\nIt's not a palindrome number");;
        }
    }
    static void isPalindrome( String str){
        String test=str.toLowerCase();
        String last= new StringBuilder(test).reverse().toString();
        if(test.equals(last)){
            System.out.println("Great\nIt's a Palindrome String.");
        }else{
            System.out.println("Sorry\nIt's not a Palindrome String.");
        }
    }



}
