package java_wrapper_test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Wrapper Class: Find Max Value
 * Find the maximum value in an array of Integer objects.
 *
 * Examples:
 * Input:
 * [10, 20, 5, 30, 15]
 * Output:
 * Max: 30
 */
public class Challenge7 {
    public static void main(String[] args) {
        int[] array={12,24,42,4532,42,432,452,52,14,};
        FindMax max=new FindMax(array);
        System.out.println("Max is: "+max.getMax());
    }
}

class FindMax{
    private int[] array;

    public FindMax(int array[]){
        this.array=array;
    }

    public Integer getMax(){
        if(array==null || array.length == 0){
            return null;
        }

        Integer max=array[0];
        for(Integer num : array){
            if(num>max){
                max=num;
            }
        }
        return max;

    }


}