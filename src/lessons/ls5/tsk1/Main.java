package lessons.ls5.tsk1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<Integer>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_00_000; i++) {
            linkedList.add(i/2, i);
        }

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 1_00_000; i++) {
            arrayList.add(0, i);
        }

        long finish = System.currentTimeMillis();

        System.out.println("lINKEDlIST:" + (start1 - start));
        System.out.println("FrrayList:" + (finish - start1));
    }
}
