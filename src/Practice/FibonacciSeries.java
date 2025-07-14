package Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        int a=0;
        int b=1;

        for(int i=0;i<num-1;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
