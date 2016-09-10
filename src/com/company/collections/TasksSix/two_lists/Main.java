//1. Даны два списка целочисленных значений. Один содержит N элементов, второй N-1 элементов.
// Первый список содержит те же элементы, что и второй +1 элемент.
// Найти значение элемента, который входит в первый список, но отсутствует во втором.
//1.1* Найти решения, которое требует меньше всего системных ресурсов.
package com.company.collections.TasksSix.two_lists;

public class Main {
    public static void main(String[] args) {
        ListsWorker listsWorker = new ListsWorker();

        listsWorker.foundDifferentElement(110, 109);
        listsWorker.foundDifferentElement(148, 147);
    }
}
