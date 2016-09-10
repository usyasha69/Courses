package com.company.collections.TasksSeven.subscribers;


import java.util.ArrayList;
import java.util.Collections;

public class SubscribersWorker {

    public static void main(String[] args) {
        ArrayList<Subscriber> subscribers = SubscribersPlaceholder.fillingSubscribers();

        //print subscribers
        System.out.println("All subscribers: \n");
        printSubscribers(subscribers);

        //print subscribers ordered by address
        System.out.println("\nSubscribers ordered by address: \n");

        Collections.sort(subscribers, new AddressSorter());
        printSubscribers(subscribers);

        //print subscribers ordered by surname
        System.out.println("\nSubscribers ordered by surname: \n");

        Collections.sort(subscribers, new SurnameSorter());
        printSubscribers(subscribers);

        //print subscribers ordered by name
        System.out.println("\nSubscribers ordered by name: \n");

        Collections.sort(subscribers, new NameSorter());
        printSubscribers(subscribers);
    }

    /**
     * This method print subscribers.
     *
     * @param subscribers - list with subscribers
     */
    private static void printSubscribers(ArrayList<Subscriber> subscribers) {
        for (Subscriber s : subscribers) {
            System.out.println(s.toString());
        }
    }
}
