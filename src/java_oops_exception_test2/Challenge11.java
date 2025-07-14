package java_oops_exception_test2;

/***
 * Calculator Method Overloading
 * Write a program to demonstrate method overloading by creating multiple "add" methods with different parameters.
 *
 * Examples:
 * Input:
 * add(5, 3), add(2.5, 3.7), add(1, 2, 3)
 * Output:
 * Integer addition: 8 Double addition: 6.2 Three integers addition: 6
 */
public class Challenge11 {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.add(3,5);
        calculator.add(4,3,2);
        calculator.add(3.5,3.2);
    }
}

class Calculator{
    void add(Integer a, Integer b){
        System.out.println("Adding 2 Integers: "+(a+b));
    }
    void add(Double a, Double b){
        System.out.println("Adding 2 Doubles: "+(a+b));
    }
    void add(Integer a, Integer b,Integer c ){
        System.out.println("Adding 3 Integers: "+(a+b+c));
    }
}
