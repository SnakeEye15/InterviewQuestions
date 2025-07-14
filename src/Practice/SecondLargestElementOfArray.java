package Practice;
//Find Second Largest Number in an Array

import java.util.Scanner;
public class SecondLargestElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int length=scanner.nextInt();
        int array[]= new int[length];
        ReverseArrayElements.takeArrayInput(array,scanner);
        System.out.println("Second Largest Element of given array is: "+SecondLargest(array));
    }
    public static int SecondLargest(int [] array){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num:array){
            if(num>max){
                secondMax=max;
                max=num;
            }
            else if(num>secondMax && num!=max){
                secondMax=num;
            }
        }

        return secondMax;
    }

}
