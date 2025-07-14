package java_wrapper_test4;

/**
 * Generic Method to Print Array
 * Write a generic method to print any type of array.
 *
 * Examples:
 * Input:
 * String array ["A", "B", "C"]
 * Output:
 * A B C
 * 💡 Explanation:Prints all string elements
 * Input:
 * Integer array [1, 2, 3]
 * Output:
 * 1 2 3
 * 💡 Explanation:Prints all integer elements
 */
public class Challenge8 {
    public static void main(String[] args) {
        Integer []arr1={23,24,252,63,25245,};
        String [] arr2={"4wdss","fjdlj","Dheeraj","Here"};
        Double [] arr3={432.42,893.4809,98.4543,23490.00};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }

    public static <T> void printArray(T[] arr){
        System.out.println("Element of array are: ");
        for(T element : arr){
            System.out.println(element);
        }
    }

}
