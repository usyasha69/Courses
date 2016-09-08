//4. Дан список абонентов. Каждый элемент хранит номер телефона, ФИО (ФИО - одна строка) и адрес.
// Упорядочить и вывести элементы по: адресу, по фамилии (фамилия, имя, отчество) и по имени (имя, отчество, фамилия).
package com.company.collections.subscribers;

public class Main {
    public static void main(String[] args) {
        new SubscribersWorker().printSubscribers(new SubscribersPlaceholder().fillingSubscribers());
    }
}
