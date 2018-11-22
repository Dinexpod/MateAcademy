package lessons.ls1.task1Sort;

public class TestSort {
    public static void main(String[] args) {

        int[] testMas1 = {10, 9, 10, 7, 6, 5, 4, 3, 2, 1};
        int[] testMas2 = new int[10];

        // Заповнення масиву рандомно від -50 до 50
        for (int i = 0; i < testMas2.length; i++) {
            testMas2[i] = (int) ((Math.random() * 101) - 50);
        }

        int[] copyTestMas1 = InsertSort.sort(testMas1);     //сортування вставками
        int[] copyTestMas2 = InsertSort.sort(testMas2);     //сортування бульбашкою

        System.out.println("\nСортуваний масив заповнений рандомними числами:");
        for (int i : copyTestMas2) {
            System.out.print(i + "\t");
        }

        System.out.println("\n\nСортуваний масив заповнений вручну:");
        for (int i : copyTestMas1) {
            System.out.print(i + "\t");
        }
    }
}
