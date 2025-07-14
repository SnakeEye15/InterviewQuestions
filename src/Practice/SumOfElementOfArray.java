package Practice;

import java.util.Scanner;

public class SumOfElementOfArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int length=scanner.nextInt();
        int array[] = new int[length];
        ReverseArrayElements.takeArrayInput(array,scanner);
        System.out.println("\nTotal Sum of Array is: "+SumOfElement(array));
    }

    public static int SumOfElement(int array[]){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

}
