package com.company.collections.TasksSix.custom_collection;

public class CustomCollection<E> implements com.company.collections.TasksSix.custom_collection.List<E> {
    /**
     * Data of custom collection.
     */
    private Object[] data;
    /**
     * Size of custom collection
     */
    private int size;

    /**
     * Default constructor create new data in custom collection if initial capacity not defined.
     */
    public CustomCollection() {
        this.data = new Object[16];
    }

    /**
     * Constructor create new data in custom collection given by initial capacity.
     *
     * @param initialCapacity - start capacity of custom collection
     */
    public CustomCollection(int initialCapacity) {
        //if initial capacity less zero throw new exception
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        }

        this.data = new Object[initialCapacity];
        this.size = initialCapacity;
    }

    /**
     * This method add new element to custom collection.
     *
     * @param element - element want to add
     * @return - added element or not
     */
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

    /**
     * This method add element to custom collection for a given index.
     *
     * @param index   - index of position where it is necessary to add
     * @param element - element want to add
     */
    @Override
    public void add(int index, E element) {
        //size of collection
        int dataLength = 0;

        //calculate size of collection
        for (Object aData : data) {
            if (aData != null) {
                dataLength++;
            }
        }

        //if size of custom collection equal zero
        if (dataLength == 0) {
            Object[] newData = new Object[dataLength + 1];
            newData[0] = element;

            data = newData;
            size = data.length;

            return;
        }

        //if length of index more size of custom collection
        if (index > dataLength - 1) {
            Object[] newData = new Object[dataLength + 1];
            for (int i = 0; i < dataLength; i++) {
                newData[i] = data[i];
            }

            newData[newData.length - 1] = element;

            data = newData;
            size = data.length;

            return;
        }

        Object[] newData = new Object[dataLength + 1];

        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }

        newData[index] = element;

        for (int i = index + 1; i < newData.length; i++) {
            newData[i] = data[i - 1];
        }

        data = newData;
        size = data.length;
    }

    /**
     * This method return to element for a given index.
     *
     * @param index - index of element
     * @return - element
     */
    @Override
    public E get(int index) {

        if (index >= 0 && index < size) {
            return (E) data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Output abroad collection!");
        }
    }

    /**
     * This method removed element for a given index.
     *
     * @param index - index of removed element
     * @return - removed element
     */
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
        for (Object aData : data) {
            if (aData != null) {
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
            System.arraycopy(data, index + 1, newData, index, dataLength - 1 - index);

            data = newData;
            size = newData.length;
        }

        return element;
    }

    /**
     * This method check is custom collection are empty or not.
     *
     * @return - collection empty or not
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * This method return size of custom collection.
     *
     * @return - size of custom collection
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * This method clear all elements in custom collection.
     */
    @Override
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }

        size = 0;
    }
}
