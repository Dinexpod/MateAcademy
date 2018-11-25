package homeworks.hw1.sixAdvancedQuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] actualArray = {10, 9, 8, 13, 6, 5, 4, 28, 2, 1};

        actualArray = QuickSortRealization.quickSort(actualArray, 0, actualArray.length - 1);

        // output sorted array
        for (int i = 0; i < actualArray.length; i++) {
            System.out.print(actualArray[i] + " ");
        }

        System.out.println("\nTHE END");
    }
}
