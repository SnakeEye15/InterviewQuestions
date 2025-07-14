package Practice;
// Write a Java program to reverse a string without using built-in reverse methods.
import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str= scan.nextLine();

        String new_str="";

        for(int i=str.length()-1 ;i>=0;i--){
            new_str+= str.charAt(i);

        }
        System.out.println("New String after reversing is: ");
        System.out.println(new_str);

    }
}
