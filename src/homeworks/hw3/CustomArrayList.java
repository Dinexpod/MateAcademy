package homeworks.hw3;

public class CustomArrayList<T> {
    private Object[] data;
    private int size;

    public CustomArrayList() {
        data = new Object[10];
    }

    public CustomArrayList(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException("Cannot construct CustomArrayList with negative capacity!!");
        }

        data = new Object[capacity];
    }

    public void add(T value) {
        ensureCapacity(size + 1);
        this.data[size] = value;
        size++;
    }

    private void ensureCapacity(int capacity) {

        if (data.length < capacity) {
            Object[] tmpData = new Object[data.length * 2];
        }
    }
}
