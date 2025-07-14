package bankApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ATM atm = null;

        try {

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter data in the correct format.");
            return; // Exit the program
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
            return;
        }

        // Menu-driven interaction
        int choice = 0;
        do {
            try {
                System.out.println("\nSelect your operation:");
                System.out.println("1. Get account details");
                System.out.println("2. Withdraw");
                System.out.println("3. Check account balance");
                System.out.println("4. Deposit amount");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        atm.showDetails(); // Assuming renamed from getDetails()
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        int withdrawAmt = scan.nextInt();
                        if (withdrawAmt <= 0) {
                            throw new IllegalArgumentException("Withdraw amount must be positive.");
                        }
                        atm.withdraw(withdrawAmt);
                        break;

                    case 3:
                        System.out.println("Current Balance: ₹" + atm.getBalance());
                        break;

                    case 4:
                        System.out.println("Enter amount to deposit:");
                        int depositAmt = scan.nextInt();
                        if (depositAmt <= 0) {
                            throw new IllegalArgumentException("Deposit amount must be positive.");
                        }
                        atm.deposite(depositAmt); // Assuming renamed from deposite()
                        break;

                    case 5:
                        System.out.println("Thank you for using the bank system.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select between 1-5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input type mismatch! Please enter valid numeric values.");
                scan.nextLine(); // clear the buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }

        } while (choice != 5);

        scan.close();
    }
}
