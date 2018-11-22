package lessons.ls1.task1Sort;

public class InsertSort {

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int copyNumber = arr[i];
            int j = i;
            while (j > 0 && copyNumber < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = copyNumber;
        }
        return arr;
    }
}
