package Practice;

import java.util.Scanner;

public class Palindrome_Check {
    public static boolean isPalindrome(int num){
        if (num < 0) return false; //for negative numbers

        int m=num;
        int n=0;
        while(num>0 ){
            int rem=num%10;
            num=num/10;
            n=n*10+rem;
        }
        if(n==m){
            return true;
        }
        else{
        return false;}
    }


    public static void main(String[] args) {
        System.out.println("Please enter the number you want to check: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(isPalindrome(num)){
            System.out.println("It's a palindrome number");
        }else{
            System.out.println("It's not a palindrome number");
        }
    }
}
