package Practice;

import java.util.Scanner;

//Check if a number is a perfect number
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the positive number only.");
        int num = scan.nextInt();
        if(num<=0) System.out.println("Please enter positive number only..");
        int sum=0;

        for (int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println("It's a perfect number.");
        }
        else{
            System.out.println("It's not a perfect number.");
        }
        scan.close();
    }

}
