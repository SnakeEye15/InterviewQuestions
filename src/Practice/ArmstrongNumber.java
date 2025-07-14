package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        try{
        int num=scanner.nextInt();
        if(num>0){
            if(isArmstrongNumber(num)) System.out.println("It's a Armstrong Number.");
            else System.out.println("It's not a Armstrong Number.");
        }else{
            System.out.println("Please enter the value greater than 0..");
        }
    }catch(
    InputMismatchException e){
            System.out.println("Invalid input. Please enter an integer.");
    }
    scanner.close();
    }


    public static int digitCount(int num){
        int counter=0;
        while(num>0){
            num=num/10;
            counter++;
        }
        return counter;
    }

    public static boolean isArmstrongNumber(int num){
        int power=digitCount(num);
        int original =num;
        int sum =0;
        while(num>0){
            int digit =num%10;
            num=num/10;
            sum = (int) (sum +Math.pow(digit,power));
        }
        return original == sum;
    }
}
