package lessons.ls1.task1Sort;

public class TestSort {
    public static void main(String[] args) {

       int[] test = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] copyTest = BubbleSort.sort(test);

        for (int i : copyTest) {
            System.out.print(i + " ");
        }
    }
}
