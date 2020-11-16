public class ArrayNumber {
    public static void main(String[] args) {
        System.out.println("Task 2: ");
        Integer[] arrayNumber = {3, 6, 1, -5, 4, 12, -2, 15, -8,};
        int sum = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > 0)
                sum += arrayNumber[i];
        }
//        for (Integer integer : arrayNumber) {
//            if (integer > 0) {
//                sum += integer;
//            }
//        }
        System.out.println("Summa positive numbers =  " + sum);
    }

}
