import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        Integer []arrays = {2,3,1,7,11};
        Arrays.sort(arrays, Collections.reverseOrder());
        System.out.println("Array after the use of Collection.reverseOrder() " + " and Arrays.sort(): " + "\n " + Arrays.toString(arrays));
    }
}
