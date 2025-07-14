package Practice;
//Count vowels and consonants in a String.
import java.util.Scanner;

public class CountAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.next().toLowerCase();
        char[] ch = str.toCharArray();
        int countVowel=0;
        int countConsonants=0;

        for(int i=0;i<ch.length;i++){
            switch (ch[i]){
                case 97,101,105,111,117:
                    countVowel++;
                    break;
                default:
                    if(ch[i]>97 && ch[i]<123)
                    {countConsonants++;}
            }
        }
        System.out.println("In this string total vowles are: "+ countVowel+" and Consonants are "+countConsonants );

    }

}
