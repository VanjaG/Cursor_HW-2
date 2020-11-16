public class AverageArray {
    public static void main(String[] args) {
        System.out.println("Task 3: ");
        Integer []averageArray = {1,2,4,1};
        int sum = 0;
        for (int i : averageArray) {
            sum += i;
            int avg = sum / averageArray.length;
        }
        System.out.println("The average value from the list of numbers in this array: " + "\n "  + sum / averageArray.length);
    }
}
