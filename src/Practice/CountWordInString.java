package Practice;
//Count the Number of Words in a String
import java.util.Scanner;

public class CountWordInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine().trim();
        int count=0;
        if (!str.isEmpty()) {
            // Split using regex to handle multiple spaces, tabs, etc.
            String[] words = str.split("\\s+");// "\\s+" matches one or more spaces
            for(String word: words){
                count++;
            }
        }else{
            count+=1;
        }
        System.out.println(count);

        scan.close();
    }
}
