package Practice;
//Check if a number is even or odd without using %
import java.util.Scanner;

public class EvenOddWithoutModulo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please Enter the Number you want to check for Even or Odd: ");
        int num=scan.nextInt();
        scan.close(); //closing Scanner object
        if(num>=1){
        //Will take half of user entered number
        int half=num/2;
        if((half * 2)==num ){
            System.out.println("It's a Even number.");
        }else{
            System.out.println("It's a Odd number.");
        }}else{
            System.out.println("Please enter the positive values only.");
        }


    }
}
