package homeworks.hw1.sixAdvancedQuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] actualArray = new int[1_000_000];

        for (int i = 0; i < actualArray.length; i++) {
            actualArray[i] = (int) ((Math.random()*101)-50);
        }
        long start = System.currentTimeMillis();

        actualArray = QuickSortRealization.doQuickSort(actualArray, 0, actualArray.length - 1);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;


        // output sorted array
//        for (int i = 0; i < actualArray.length; i++) {
//            System.out.print(actualArray[i] + " ");
//        }

        System.out.println(timeConsumedMillis);
    }
}
