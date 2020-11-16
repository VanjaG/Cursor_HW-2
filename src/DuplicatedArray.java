import java.util.Arrays;

public class DuplicatedArray {
    public static void main(String[] args) {
        System.out.println("Task 4: ");

        Integer[] duplicatedArray = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < duplicatedArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (duplicatedArray[i].equals(duplicatedArray[j])) {
                    duplicatedArray[i] = 0;
                    break;
                }
            }
        }
        System.out.println("The result of the check after duplication \n" + Arrays.toString(duplicatedArray));
    }
}
