package homeworks.hw3;

public class CustomArrayList<T> {
    private Object[] data;
    private int index;

    public CustomArrayList() {
        data = new Object[10];
    }

    public CustomArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Cannot construct CustomArrayList with negative capacity!");
        }

        data = new Object[capacity];
    }

    public void add(T value) {
        ensureCapacity(index + 1);
        this.data[index] = value;
        index++;
    }

    private void ensureCapacity(int futureCapacity) {
        if (data.length <= futureCapacity) {
            Object[] tmpData = new Object[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                tmpData[i] = data[i];
            }

            data = tmpData;
        }
    }

    public int size() {
        return index;
    }
}