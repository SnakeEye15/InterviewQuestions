package Practice;// Count how many times each character appears in a given string.
import java.util.Scanner;
public class Frequency_of_each_character_in_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str= scan.next();
        str=str.toLowerCase();
        boolean[] counted= new boolean[str.length()];

        for (int i=0;i<str.length();i++){
            if( counted[i]) continue;
            char ch= str.charAt(i);
            int count=1;
            for(int j=i+1;j< str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                    counted[j]=true;
                }
            }
            System.out.printf("Number of %s presnet in String is: %d",ch,count);
            System.out.println();
        }

    }
}
