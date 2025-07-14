package java_oops_exception_test2;

import java.util.Scanner;

/***
 * Custom Exception Implementation
 * Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.
 *
 * Examples:
 * Input:
 * validateAge(15) and validateAge(25)
 * Output:
 * InvalidAgeException: Age must be 18 or above. Provided age: 15 Age is valid: 25
 */
public class Challenge15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please verify your age: ");
        int age=scan.nextInt();
        try{
            validateAge(age);
        }catch (InvalidException e){
            System.out.println(e.getMessage());
        }


    }
    public static void validateAge(int age) throws InvalidException {
        if(age<18){
            throw new InvalidException("InvalidAgeException: Age must be 18 or above.");
        }else{
            System.out.println("Provided age: Age is valid: "+age);
        }
    }

}

class InvalidException extends Exception{
    public InvalidException(String message){
        super(message);
    }
}
