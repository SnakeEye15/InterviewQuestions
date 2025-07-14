package Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the year you want to check.");
        int inputNum=scanner.nextInt();
        if(inputNum<=0){
            System.out.println("Please enter the valid year.");
            return;
        }
        boolean isLeap= (inputNum%4==0 && inputNum%100!=0) || (inputNum%400==0);
        if(isLeap){
            System.out.println("It's a leap year");
        }else{
            System.out.println("It's not a leap year");
        }
}}
