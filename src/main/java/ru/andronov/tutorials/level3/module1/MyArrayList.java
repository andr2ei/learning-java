package ru.andronov.tutorials.level3.module1;


public class MyArrayList {

    public static final int DEFAULT_CAPACITY = 3;
    private Object[] arr = new Object[DEFAULT_CAPACITY];
    int realSize = 0;

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return realSize == 0;
    }

    public boolean contains(Object o) {
        for (Object obj :
                arr) {
            if (obj.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == arr.length) {
            Object[] newArr = new Object[arr.length * 3/2 + 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        realSize++;
        arr[realSize-1] = o;
        return false;
    }

    public boolean remove(Object o) {
        boolean isFound = false;
        for (int i = 0; i < realSize; i++) {
            if (arr[i].equals(o)) {
                isFound = true;
            }
            if (isFound && i != realSize - 1) {
                arr[i] = arr[i + 1];
            }
        }
        if (isFound) {
            arr[realSize - 1] = null;
            realSize--;
        }
        return isFound;
    }

    public void clear() {
        for (int i = 0; i < realSize; i++) {
            arr[i] = null;
        }
        realSize = 0;
    }

    public Object get(int i) {
        if (i >= realSize) {
            throw new IndexOutOfBoundsException();
        }
        return arr[i];
    }

    public Object set(int i, Object o) {
        if (i >= realSize) {
            throw new IndexOutOfBoundsException();
        }
        arr[i] = o;
        return o;
    }

    public void add(int i, Object o) {
        if (i >= realSize) {
            throw new IndexOutOfBoundsException();
        }
        arr[i] = o;
    }

    public Object remove(int i) {
        if (i >= realSize) {
            throw new IndexOutOfBoundsException();
        }
        Object objToReturn = arr[i];
        for (int j = i; j < realSize - 1; j++) {
            arr[j] = arr[j+1];
        }
        arr[realSize - 1] = null;
        realSize--;
        return objToReturn;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (o.equals(arr[i])) return i;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < realSize; i++) {
            if (o.equals(arr[i])) lastIndex = i;
        }
        return lastIndex;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList: [");
        for (int i = 0; i < realSize; i++) {
            sb.append(arr[i].toString());
        }
        return sb.append("]").toString();
    }
}
