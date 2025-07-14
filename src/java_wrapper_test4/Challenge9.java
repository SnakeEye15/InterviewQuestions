package java_wrapper_test4;

/**
 * Exception Propagation Example
 * Show how an exception propagates through method calls.
 *
 * Examples:
 * Input:
 * Chain of method calls with division by zero
 * Output:
 * Exception caught in main method
 * 💡 Explanation:Exception propagates up the call stack until caught
 */
public class Challenge9 {
    public static void main(String[] args) {
        try{
            method1();
        }catch (ArithmeticException e){
            System.out.println("Exception caught in main method");
        }
    }

    static void method1(){
        method2();
    }
    static void method2(){
        method3();
    }

    static void method3(){
        int results=10/0;
        System.out.println("Resutls: "+results );
    }


}
