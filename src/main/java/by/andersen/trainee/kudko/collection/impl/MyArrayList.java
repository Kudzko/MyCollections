package by.andersen.trainee.kudko.collection.impl;

import by.andersen.trainee.kudko.collection.collinterface.MyList;
import by.andersen.trainee.kudko.collection.exception.IllegalSizeExcetion;
import by.andersen.trainee.kudko.collection.exception.OutOfBoundException;
import by.andersen.trainee.kudko.collection.exception.OutOfMemoryError;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public class MyArrayList<E> extends MyAbstractCollection implements MyList, RandomAccess {
    private static final int DEF_CAPACITY = 10;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE;
    private static final Object[] EMPTY_ARRAY = {};
    private int size;
    private Object[] array;


    public MyArrayList() {
        this.array = EMPTY_ARRAY;
    }

    public MyArrayList(int size) {
        if (size > 0) {
            array = new Object[size];
        } else if (size == 0) {
            array = EMPTY_ARRAY;
        } else {
            throw new IllegalSizeExcetion("Illegal size value: " + size);
        }
    }

    public MyArrayList(Object[] array) {
        this.array = array;
    }


    @Override
    public boolean add(int index, Object o) {
        Object temp;
        boundCheck(index);
        ensureCapacity(size + 1);
        temp = array[index];
        array[index] = o;
        for (int i = index + 1; i < size - 1; i++) {
            array[i] = temp;
            temp = array[i + 1];
        }
        return true;
    }

    @Override
    public E get(int index) {
        boundCheck(index);
        return (E) array[index];
    }

    @Override
    public Object remove(int index) {
        Object removing = null;
        boundCheck(index);
        removing = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removing;
    }

    private void boundCheck(int index) {
        if ((index < 0) || index >= size) {
            throw new OutOfBoundException("Index has to be in bound 0 ... ");
        }
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity(size + 1);
        array[size++] = o;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError("Illegal array capacity");
        }
        int ensureCapacity = checkCapacity(array, minCapacity);
        if (array.length - ensureCapacity < 0) {
            growArray(minCapacity);
        }
    }

    private int checkCapacity(Object[] array, int requiredCapacity) {
        if (array == EMPTY_ARRAY) {
            return (Math.max(DEF_CAPACITY, requiredCapacity));
        }
        return requiredCapacity;
    }

    private void growArray(int minRequiredCapacity) {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity * 2;
        if (newCapacity - minRequiredCapacity < 0) {
            newCapacity = minRequiredCapacity;
        }
        if (MAX_ARRAY_SIZE - newCapacity < 0) {
            newCapacity = MAX_ARRAY_SIZE;
        }
        array = Arrays.copyOf(array, newCapacity);
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator {
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such

        @Override
        public boolean hasNext() {
            return cursor != size ? true : false;
        }

        @Override
        public Object next() {
            if (cursor >= size) {
                throw new NoSuchElementException();
            }
            boundCheck(cursor);
            Object o = array[cursor];
            lastRet = cursor;
            cursor++;
            return o;
        }

    }

}
