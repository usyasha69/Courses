package com.company.collections.TasksSix.custom_collection;

public class CustomCollection<E> implements com.company.collections.TasksSix.custom_collection.List<E> {
    /**
     * Data of custom collection.
     */
    private Object[] data;
    /**
     * Size of custom collection.
     */
    private int size;

    /**
     * Default constructor create new data in custom collection if initial capacity not defined.
     */
    public CustomCollection() {
        data = new Object[0];
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

        this.data = new Object[0];
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

        if (data.length == 0) {
            Object[] newData = new Object[1];

            newData[0] = element;
            data = newData;

            size = 1;
        } else {
            Object[] newData = new Object[data.length + 1];
            System.arraycopy(data, 0, newData, 0, data.length);

            newData[newData.length - 1] = element;
            data = newData;
            size = data.length;
        }

        return true;
    }

    /**
     * This method add element to custom collection for a given index.
     *
     * @param index   - index of position where it is necessary to add
     * @param element - element want to add
     */
    @Override
    public void add(int index, E element) {
        if (index >= 0 && index < size) {
            if (data.length == 0) {
                Object[] newData = new Object[1];

                newData[0] = element;
                data = newData;

                size = 1;
            } else {
                Object[] newData = new Object[data.length + 1];
                System.arraycopy(data, 0, newData, 0, index);

                newData[index] = element;

                System.arraycopy(data, index + 1 - 1, newData, index + 1, data.length + 1 - (index + 1));

                data = newData;

                size = data.length;
            }
        }
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
        if (data.length == 0) {
            return null;
        }

        //result
        E element = (E) data[index];

        if (index >= 0 && index < size) {
            Object[] newData = new Object[data.length - 1];
            System.arraycopy(data, 0, newData, 0, index);

            System.arraycopy(data, index + 1, newData, index, data.length - 1 - index);

            data = newData;

            size = data.length;
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
        data = new Object[0];
        size = 0;
    }
}
