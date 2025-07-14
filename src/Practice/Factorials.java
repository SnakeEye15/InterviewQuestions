package Practice;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num=scanner.nextInt();
        if(num<0){
            System.out.println("Please enter the positive values only");
        }else if(num==0){
            System.out.println("Factorial of 0 is 1.");
        }else if(num>0){
            int fact=1;
            for(int i=1;i<=num;i++) {
                fact=fact*i;
            }
            System.out.println("Factorial of given number is: "+fact);
        }
    }
}
