package Java_programming_test1;

import java.util.Scanner;

/***
 * Leap Year Checker
 * Write a program to check if a given year is a leap year.
 *
 * **Requirements:**
 * - A year is leap if it's divisible by 4
 * - Exception: if divisible by 100, it's not leap unless also divisible by 400
 * - Use logical operators in conditions
 *
 * Examples:
 * Input:
 * 2020
 * Output:
 * 2020 is a leap year
 */
public class Challenge8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year=scan.nextInt();
        if(isLeapYear(year)){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" isn't a leap year.");
        }

    }
    public static boolean isLeapYear(int year){
        return ((year%4==0) && ((year%100!=0) || (year%400==0)));
    }
}
