package com.company.hometask.TasksSix.custom_collection;

public interface List<E> {
    boolean add(E element);
    void add(int index, E element);
    E get(int index);
    E remove(int index);
    boolean isEmpty();
    int size();
    void clear();
}
