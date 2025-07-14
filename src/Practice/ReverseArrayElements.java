package Practice;

import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int length= scanner.nextInt();
        int array[]= new int[length];
        takeArrayInput(array, scanner);
        System.out.println("Printing Elements in reverse order: ");
        printArrayelementInReverse(array);
    }

    public static void takeArrayInput(int [] arrary, Scanner scanner){
        for(int i = 0; i< arrary.length; i++){
            System.out.println("Please enter the element number ---> "+(i+1));
            arrary[i]= scanner.nextInt();
        }
    }
    public static void printArrayelementInReverse(int [] arrary){
        for(int i = arrary.length-1; i>=0; i--){
            System.out.println(arrary[i]);
        }
    }


}
