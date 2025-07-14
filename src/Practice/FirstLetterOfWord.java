package Practice;
import java.util.Scanner;

//First Letter of Each Word in a String
public class FirstLetterOfWord {
    public static void main(String[] args) {
        System.out.println("Please enter the String: ");
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine().trim();
        if(!str.isEmpty()){
            String words[]=str.split("\\s+");
            for(String word :  words){
                System.out.println(word.charAt(0));
            }

        }
    }
}
