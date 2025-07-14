package Practice;

import java.util.Scanner;

//Reverse the number using for loop. (In - 12345, Out - 54321)
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int num=scan.nextInt();
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10 +rem;
            num=num/10;
        }
        System.out.println("Reverse of entered number is: "+rev);
    }
}
