package java_wrapper_test4;

/**
 * Autoboxing and Unboxing Example
 * Demonstrate autoboxing and unboxing with Integer.
 *
 * Examples:
 * Input:
 * int value = 10
 * Output:
 * Autoboxed: 10, Unboxed: 10
 * 💡 Explanation:Shows automatic conversion between int and Integer
 */
public class Challenge5 {
    public static void main(String[] args) {
        int num=10;
        //Autoboxing
        Integer NUM=num;
        System.out.println("Autoboxed: "+NUM);
        //unboxing
        //int num1=NUM.intValue();
        int num1=NUM;
        System.out.println("Unboxed: "+num1);

    }
}
