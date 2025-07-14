package Practice;
//Find the First Non-Repeating Character in a String
import java.util.Scanner;
public class FirstNonOcuuringCharInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String str=scan.next();
        char result=FirstNonOcuuring(str);
        if(result!=0){
            System.out.println("First non-occuring char in stirng is "+result);
        }else{
            System.out.println("String don't have any non-occuring char..");
        }
    }

    private static char FirstNonOcuuring(String str) {
        int freq[] = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }

        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                return str.charAt(i);
            }
        }

        return 0;
    }


}
