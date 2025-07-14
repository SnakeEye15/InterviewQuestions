package Practice;

import java.util.Scanner;

/***
 * ✅ Pyramid pattern in Java
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */

/***
 * logic for this:
 * Decide how many rows (lines) you want. Example: 5 rows.
 *
 * For each row:
 *
 * First, print some spaces to move stars to the center.
 *
 * The number of spaces = total rows - current row number
 *
 * Then, print some stars (*).
 *
 * The number of stars = (2 × current row number) - 1
 *
 * Go to the next line and repeat
 *
 *
 */
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the digit/...");
        int row =scan.nextInt();

        for(int i=1;i<= row;i++){
            //Print spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //Print stars
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print("*");
            }
            // To change line
            System.out.println();
        }

    }
}
