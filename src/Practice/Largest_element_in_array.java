package Practice;

import java.util.Scanner;
// Find the maximum element in an array of integers.
public class Largest_element_in_array {
    public static void takeInput(int [] arr, Scanner scan){
        for(int i=0;i<arr.length;i++){
            System.out.printf("Please enter the %dth element of array: ",i);
            arr[i]=scan.nextInt();
            System.out.println();
        }
    }

    public static int findLargest(int [] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
       return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the length of array:");
        int length= scan.nextInt();
        int [] arr= new int[length];
        takeInput(arr, scan);

        System.out.println("Largest element of given array is: "+findLargest(arr));

    }
}
