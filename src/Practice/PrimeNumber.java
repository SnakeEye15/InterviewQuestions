package Practice;

import java.util.Scanner;
/**
 * This class checks if a given number is prime or not.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the input number
        int inputNumber = scanner.nextInt();

        // Check if the input number is prime
        if (isPrime(inputNumber)) {
            System.out.println(inputNumber + " is a prime number.");
        } else {
            System.out.println(inputNumber + " is not a prime number.");
        }
    }

    /**
     * Checks if a given number is prime or not.
     *
     * @param num the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        // Edge case: numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }

        // Edge case: 2 is the only even prime number
        if (num == 2) {
            return true;
        }

        // All other even numbers are not prime
        if (num % 2 == 0) {
            return false;
        }

        // Only need to check up to the square root of the number
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        // If we reach this point, the number is prime
        return true;
    }
}