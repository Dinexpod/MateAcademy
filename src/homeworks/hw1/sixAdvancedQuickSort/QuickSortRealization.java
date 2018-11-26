package homeworks.hw1.sixAdvancedQuickSort;

public class QuickSortRealization {
    public static int[] doQuickSort(int[] tmpArray, int first, int last) {

        if(first >= last) {
            return tmpArray;
        }

        int i = first, j = last;

        int opora = ((i + j) / 2);

        while (i < j) {
            while ((i < opora) && (tmpArray[i] <= tmpArray[opora])) {
                i++;
            }

            while ((j > opora) && (tmpArray[j] >= tmpArray[opora])) {
                j--;
            }

            if(i < j) {
                int tmp = tmpArray[i];
                tmpArray[i] = tmpArray[j];
                tmpArray[j] = tmp;

                if(i == opora) {
                    opora = j;
                } else if(j == opora) {
                    opora = i;
                }
            }
        }

        doQuickSort(tmpArray, first, opora);
        doQuickSort(tmpArray, (opora + 1), last);

        return tmpArray;
    }
}