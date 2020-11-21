public class AverageArray {
    public static void main(String[] args) {
        System.out.println("Task 3: ");
        Integer[] averageArray = {1, 2, 4, 1};
        int sum = 0;

        for (int i = 0; i < averageArray.length; i++)
            sum = sum + averageArray[i];
        int average = sum / averageArray.length;
        System.out.println("The average value from the list of numbers in this array: " + "\n " + average);
    }
}
