package java_wrapper_test4;

/**
 * Write a generic method to swap two elements in an array.
 *
 * Examples:
 * Input:
 * [1, 2, 3], swap indices 0 and 2
 * Output:
 * [3, 2, 1]
 * 💡 Explanation:Elements at index 0 and 2 are swapped
 * Input:
 * ["A", "B", "C"], swap indices 0 and 1
 * Output:
 * ["B", "A", "C"]
 */
public class Challenge3 {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {1, 2, 3};
        swap(intArray, 0, 2);
        System.out.println(java.util.Arrays.toString(intArray)); // Output: [3, 2, 1]

        // Example 2: String array
        String[] strArray = {"A", "B", "C"};
        swap(strArray, 0, 1);
        System.out.println(java.util.Arrays.toString(strArray)); // Output: [B, A, C]

    }
    public static <T> void swap(T[] array, int index1, int index2) throws Exception {
            if(array ==null || index1<0 || index2<0 || index1>=array.length || index2>=array.length){
                throw new Exception("Either array is empty or indexes are not corect ");
            }

            T temp= array[index1];
            array[index1]=array[index2];
            array[index2]=temp;
    }
}
