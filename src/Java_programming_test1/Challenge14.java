package Java_programming_test1;

import java.util.Scanner;

/***
 * Star Pattern Printing
 * Create a program to print various star patterns using nested loops.
 *
 * **Requirements:**
 * - Print a right triangle pattern of stars
 * - Print a pyramid pattern of stars
 * - Use nested loops for pattern generation
 * - Make patterns scalable based on input size
 *
 * Examples:
 * Input:
 * 4
 * Output:
 * Right Triangle: * ** *** **** Pyramid: * *** ***** *******
 */
public class Challenge14 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println("Start pattern for input is: ");
        starPattern(input);
        System.out.println("Pyramid pattern for input is: ");
        pyramidPattern(input);


    }
    public static void starPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramidPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
