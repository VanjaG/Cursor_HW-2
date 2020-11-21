import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorting {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        List<Integer> integerList = Arrays.asList(2, 3, 1, 7, 11);
        integerList.sort(Collections.reverseOrder());
        System.out.println("ReverseOrder: " + "\n " + integerList);
    }
}
