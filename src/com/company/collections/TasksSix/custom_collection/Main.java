//0. Создать свою коллекцию имплементировав интерфейс List и реализовав все его методы.
// Коллекция должна быть масштабируемая (по аналогии с ArrayList - расширяемая и со своей кастомной реализацией - сужаемая,
// в зависимости от кол-ва данных).
//Для реализации логики работы коллекции достаточно описать 3 метода: add(), get(), remove().
//0.1* Дополнительно реализовать методы isEmpty(), size(), clear().
package com.company.collections.TasksSix.custom_collection;

public class Main {
    public static void main(String[] args) {
        new Tester().testCustomCollection();
    }
}
