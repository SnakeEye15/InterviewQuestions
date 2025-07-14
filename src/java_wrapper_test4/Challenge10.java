package java_wrapper_test4;

/**
 * Generic Bounded Type Example
 * Write a generic method that accepts only numbers and returns their sum.
 *
 * Examples:
 * Input:
 * Integer array [1, 2, 3]
 * Output:
 * Sum: 6.0
 * 💡 Explanation:Sum of integers converted to double
 * Input:
 * Double array [1.5, 2.5, 3.5]
 * Output:
 * Sum: 7.5
 * 💡 Explanation:Sum of double values
 */
public class Challenge10 {
    public static void main(String[] args) {
        Integer []arr1={23,53,24,24,25,234,13,};
        Double [] arr2={31.243,42.0,432.98};
        System.out.println("Sum of element of array is: "+sum(arr1));
        System.out.println("Sum of element of array is: "+sum(arr2));
    }

    public static <T extends Number>Double sum(T[] arr){
       double result=0;
        for(T num:arr){
            result=result +num.doubleValue();
        }
        return  result;
    }
}
