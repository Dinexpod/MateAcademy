package lessons.ls1.task1Sort;

public class InsertSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int saveNum = arr[i];
            int j = i;

            while (j > 0 && saveNum < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = saveNum;
        }
        return arr;
    }
}
