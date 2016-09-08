package com.company.collections.custom_collection;

public class CustomCollection<E> implements com.company.collections.custom_collection.List<E> {

    private Object[] data;
    private int size;

    public CustomCollection() {
        this.data = new Object[16];
    }

    public CustomCollection(int initialCapacity) {

        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        }

        this.data = new Object[initialCapacity];

        this.size = initialCapacity;
    }

    @Override
    public boolean add(E element) {
        int freeElementIndex = 0;
        boolean result = false;

        if (data[data.length - 1] == null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    freeElementIndex = i;
                    break;
                }
            }
            data[freeElementIndex] = element;
            size = freeElementIndex + 1;
            result = true;
        } else {
            Object[] newData = new Object[data.length + 1];

            System.arraycopy(data, 0, newData, 0, data.length);

            newData[newData.length - 1] = element;

            data = newData;
            size = data.length;
            result = true;
        }

        return result;
    }

    @Override
    public void add(int index, E element) {
        Object[] newData = new Object[data.length + 1];

        for (int i = 0; i < index; i++) {
            newData[i] = data;
        }

        newData[index] = element;

        for (int i = index + 1; i <= data.length; i++) {
            newData[i] = data[i - 1];
        }

        data = newData;
        size = data.length;
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E) data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Output abroad collection!");
        }
    }

    @Override
    public E remove(int index) {
        //result
        E element = (E) data[index];

        //size of collection
        int dataLength = 0;

        //return if size of collection equal zero
        if (size == 0) {
            return element;
        }

        //calculate size of collection
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                dataLength++;
            }
        }

        //throw new exception if index of remove more size of collection
        if (index >= dataLength) {
            throw new ArrayIndexOutOfBoundsException("Output the bounds of collection");
        }

        //if index of remove equal zero
        if (index == 0 && dataLength != 0) {
            Object[] newData = new Object[dataLength - 1];

            for (int i = 0; i < dataLength; i++) {
                if (i != dataLength - 1) {
                    newData[i] = data[i + 1];
                }
            }

            data = newData;
            size = newData.length;

            return element;
        }

        //if index of remove not equal zero and less size of collection
        if (index > 0 && index < dataLength) {
            Object[] newData = new Object[dataLength - 1];

            System.arraycopy(data, 0, newData, 0, index);
            System.arraycopy(data, index, newData, index - 1, dataLength - index);

            data = newData;
            size = newData.length;
        }

        return element;
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
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }

        size = 0;
    }
}
