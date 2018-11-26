package homeworks.hw1.sixAdvancedQuickSort;

public class QuickSortRealization {
    public static int[] doQuickSort(int[] tmpArray, int first, int last) {

        if(first >= last) {
            return tmpArray;
        }

        int i = first, j = last;
        int pivot = ((i + j) / 2);

        while (i < j) {
            while ((i < pivot) && (tmpArray[i] <= tmpArray[pivot])) {
                i++;
            }

            while ((j > pivot) && (tmpArray[j] >= tmpArray[pivot])) {
                j--;
            }

            if(i < j) {
                int tmp = tmpArray[i];
                tmpArray[i] = tmpArray[j];
                tmpArray[j] = tmp;

                if(i == pivot) {
                    pivot = j;
                } else if(j == pivot) {
                    pivot = i;
                }
            }
        }

        doQuickSort(tmpArray, first, pivot);
        doQuickSort(tmpArray, (pivot + 1), last);

        return tmpArray;
    }
}