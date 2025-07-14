package Practice;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicates_from_Array {
    public static void takeInput(int n,Scanner scan, int [] arr){
        for(int i=1;i<=n;i++){
            System.out.printf("Please enter the value for %dth element of array: ",i);
            int element=scan.nextInt();
            arr[i-1]=element;
        }
    }

    public static int[] remove_duplicate(int arr[] ){
        Set<Integer> set = new LinkedHashSet<>();
        for (int num:arr){
            set.add(num);
        }

        int [] new_arr = new int[set.size()];
        int i=0;
        for(int num:set){
            new_arr[i++]=num;
        }

        return new_arr;
    }

    public  static void printElement(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }




    public static void main(String[] args) {
        System.out.println("Pleaes enter the lenght of array:");
        Scanner scan = new Scanner(System.in);
        int len=scan.nextInt();
        int [] arr=new int[len];
        takeInput(len,scan,arr);

        System.out.println("New array after removing all repeated elements is: ");
        int [] arr_new= remove_duplicate(arr);

        printElement(arr_new);
    }
}
