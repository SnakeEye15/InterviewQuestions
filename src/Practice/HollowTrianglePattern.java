package Practice;
import java.util.Scanner;

public class HollowTrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            // Print leading spaces to center the triangle
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and hollow spaces
            for(int k = 1; k <= (2 * i - 1); k++) {
                if(k == 1 || k == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line after each row
            System.out.println();
        }

        scan.close(); // Always good practice to close Scanner
    }
}
