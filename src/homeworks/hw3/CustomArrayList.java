package homeworks.hw3;

import java.util.*;

/**
 * My method customArrayList that overrides some functions in ArrayList
 *
 * @param <T>
 */
public class CustomArrayList<T> implements List<T> {
    private Object[] data;
    private int size;

    public CustomArrayList() {
        data = new Object[10];
    }

    public CustomArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Cannot construct CustomArrayList with negative capacity!");
        }

        data = new Object[capacity];
    }

    public boolean add(T value) {
        ensureCapacity(size + 1);

        this.data[size] = value;
        size++;
        return true;
    }

    public void add(int index, T value) {
        if (index < 0 || index >= size) {
            callException(index);
        }

        ensureCapacity(size + 1);

        int replace = (size - index);
        Object[] tmpArray = new Object[replace];
        int index1 = index;

        for (int i = 0; i < replace; i++) {
            tmpArray[i] = data[index1++];
        }

        data[index] = value;
        int tmpIndex = index + 1;

        for (int i = 0; i < replace; i++) {
            data[tmpIndex++] = tmpArray[i];
        }

        size++;
    }

    private void ensureCapacity(int futureCapacity) {
        if (data.length <= futureCapacity) {
            Object[] tmpData = new Object[size * 2];

            for (int i = 0; i < data.length; i++) {
                tmpData[i] = data[i];
            }

            data = tmpData;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }

    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if ((value == null) ? (data[i].equals(value)) : (data[i] == value)) {
                return true;
            }
        }

        return false;
    }

    public T get(int index) {
        if ((index < 0) || (index >= size)) {
            callException(index);
        }

        return (T) data[index];
    }

    public T remove(int index) {
        if (index < 0 && index >= size) {
            callException(index);
        }

        Object tmp = data[index];

        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;
        return (T) tmp;
    }

    public void clear() {
        for (int i = size; i >= 0; i--) {
            data[i] = null;
            size--;
        }
        size = 0;
    }

    private void callException(int index) {
        throw new IllegalArgumentException("Cannot construct CustomArrayList with wrong parameter!" +
                "\nindex must be biggest than 0 and less than size" +
                "\nsize: " + size + ", index: " + index + ".");
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }
}