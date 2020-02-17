package collections.listPractice;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[10];
        size = 0;
    }

    public MyArrayList(int length) {
        size = 0;
        array = new Object[length];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public boolean add(Object o) {
        if (array.length == size) {
            Object[] tempArray = new Object[(3 * array.length / 2) + 1];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
        array[size] = o;
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder resStrBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < size; i++) {
            resStrBuilder.append('[').append(array[i].toString()).append("] ");
        }
        resStrBuilder.append('}');
        return resStrBuilder.toString();
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public boolean containsAll(Collection c) {
        return false;
    }
}