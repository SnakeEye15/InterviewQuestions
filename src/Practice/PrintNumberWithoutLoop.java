package Practice;
// Print numbers from 1 to 100 without using loop (use recursion)
public class PrintNumberWithoutLoop {
    public static void main(String[] args) {
            printNum(1);
    }
    public static void printNum(int num){
        if(num>100){
            return;
        }
        System.out.println(num);
        printNum(num+1);
    }

}
