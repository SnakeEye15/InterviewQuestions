package java_wrapper_test4;

import java.util.Scanner;

/**
 * Custom Exception Example
 * Write a custom exception called `InvalidAgeException` and throw it if age is less than 18.
 *
 * Examples:
 * Input:
 * 20
 * Output:
 * Valid age: 20
 * 💡 Explanation:Age 20 is valid (>= 18)
 * Input:
 * 15
 * Output:
 * InvalidAgeException: Age must be 18 or older
 */
public class Challenge1 {
    public static void main(String[] args) throws InvalidExpection {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please verify your age:" );
        int age=scan.nextInt();
        validAgeCheck(age);


    }
    public static void validAgeCheck(int age)throws InvalidExpection{
        if(age>18){
            System.out.println("You are allowed to do that..");
        }else{
            throw new InvalidExpection("You are under age so not allowed to do that...");
        }
    }


}

class InvalidExpection extends Exception{
    public InvalidExpection(String message){
        super(message);
    }

}



