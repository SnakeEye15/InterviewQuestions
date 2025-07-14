package Practice;

import java.util.Scanner;

public class OddEvenElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of Array: ");
        int length=scanner.nextInt();
        int array[]= new int[length];
        ReverseArrayElements.takeArrayInput(array,scanner);

        System.out.println("--------------\nEven Elements in given array are: ");
        printEvenNumbers(array);
        System.out.println("\n--------------\nOdd Elements in given array are: ");
        printOddNumbers(array);


    }
    public static void printEvenNumbers(int [] array) {
        for(int element :array ){
            if(element%2==0){
                System.out.print(element+ " ");
            }
        }
    }

    public static void printOddNumbers(int [] array) {
        for(int element :array ){
            if(element%2!=0){
                System.out.print(element +" ");
            }
        }
    }
}

