package Practice;

import java.util.Scanner;

/**
 * This program takes a month number (1-12) and prints the number of days in that month.
 * It also handles February separately for leap years.
 */
public class DaysInMonth {
    // Constants for minimum and maximum month values
    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;

    // Constants for days in February (leap and non-leap years)
    private static final int DAYS_IN_FEB_LEAP = 29;
    private static final int DAYS_IN_FEB_NON_LEAP = 28;

    // Array to store days in each month (1-based index)
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Returns true if the given year is a leap year.
     * A year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.
     *
     * @param year the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a month number
        System.out.print("Enter month number (1-12): ");

        // Check if the user entered an integer
        if (scan.hasNextInt()) {
            // Get the month number from the user
            int month = scan.nextInt();

            // Check if the month number is within the valid range
            if (month >= MIN_MONTH && month <= MAX_MONTH) {
                // Prompt the user to enter a year
                System.out.print("Enter year: ");

                // Check if the user entered an integer
                if (scan.hasNextInt()) {
                    // Get the year from the user
                    int year = scan.nextInt();

                    // Use a switch statement to determine the number of days in the month
                    switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12, 4, 6, 9, 11:
                            // For months with 31/30 days, print the number of days
                            System.out.println(DAYS_IN_MONTH[month - 1] + " Days");
                            break;
                        case 2:
                            // For February, check if it's a leap year
                            if (isLeapYear(year)) {
                                // If it's a leap year, print 29 days
                                System.out.println(DAYS_IN_FEB_LEAP + " Days");
                            } else {
                                // If it's not a leap year, print 28 days
                                System.out.println(DAYS_IN_FEB_NON_LEAP + " Days");
                            }
                            break;
                        default:
                            // If the month is invalid, print an error message
                            System.out.println("Invalid month");
                            break;
                    }
                } else {
                    // If the user didn't enter an integer for the year, print an error message
                    System.out.println("Please enter a valid year");
                }
            } else {
                // If the month number is not within the valid range, print an error message
                System.out.println("Please enter a month between " + MIN_MONTH + " and " + MAX_MONTH);
            }
        } else {
            // If the user didn't enter an integer for the month, print an error message
            System.out.println("Please enter a valid month number");
        }
    }
}