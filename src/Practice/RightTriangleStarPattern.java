package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

/***
 * ✅ Right Triangle Star Pattern
 * *
 * *
 * **
 * ***
 * ****
 */
public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the digit..");
        int num=scan.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
