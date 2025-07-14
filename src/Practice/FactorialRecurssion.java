package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialRecurssion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=scan.nextInt();
        Fact(num,1,1);
    }
    public static void Fact(int num, int count, int factorial){
        if(count>num){
            System.out.println(factorial);
            return;
        }
        factorial=factorial*count;
        Fact(num,++count,factorial);

    }
}
