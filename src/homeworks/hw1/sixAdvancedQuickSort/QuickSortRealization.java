package homeworks.hw1.sixAdvancedQuickSort;

public class QuickSortRealization {
    public static int[] doQuickSort(int[] tmpArray, int first, int last) {

        if(first >= last) {
            return tmpArray;
        }

        int start = first, end = last;

        int opora = ((start + end) / 2);

        while (start < end) {
            while ((start < opora) && (tmpArray[start] <= tmpArray[opora])) {
                start++;
            }

            while ((end > opora) && (tmpArray[end] >= tmpArray[opora])) {
                end--;
            }

            if(start < end) {
                int tmp = tmpArray[start];
                tmpArray[start] = tmpArray[end];
                tmpArray[end] = tmp;

                if(start == opora) {
                    opora = end;
                } else if(end == opora) {
                    opora = start;
                }
            }
        }

        doQuickSort(tmpArray, first, opora);
        doQuickSort(tmpArray, (opora + 1), last);

        return tmpArray;
    }
}