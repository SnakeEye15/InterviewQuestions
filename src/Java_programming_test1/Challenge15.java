package Java_programming_test1;

import java.util.Scanner;

/***
 * Prime Number Finder
 * Write a program to find and print all prime numbers between 1 and 100 using loops.
 *
 * **Requirements:**
 * - Use nested loops to check for prime numbers
 * - A prime number is divisible only by 1 and itself
 * - Print all prime numbers in the range 1-100
 * - Optimize the algorithm for better performance
 *
 * Examples:
 * Input:
 * No input
 * Output:
 * Prime numbers between 1 and 100: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 */
public class Challenge15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range=scan.nextInt();
        System.out.println("Prime numbers between 1 and "+range);
        for(int i=1;i<=range;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int n){
        if (n<2) return false;
        if (n==2) return true;

        if(n%2==0) return false;

        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
