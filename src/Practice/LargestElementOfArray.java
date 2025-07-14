package Practice;

import java.util.Scanner;

//Print the Largest Element in an Array
public class LargestElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        int length=scanner.nextInt();
        int array[]= new int[length];
        ReverseArrayElements.takeArrayInput(array,scanner);
        System.out.println("Largest Element of given array is:" +LargestElement(array));
        scanner.close();
    }
    public static int LargestElement(int array[]){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

}
