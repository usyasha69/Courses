package com.company.collections.subscribers;


import java.util.ArrayList;

public class SubscribersWorker {

    /**
     * This method ordered subscribers by address, surname & name and print.
     *
     * @param subscribers - list with subscribers
     */
    public void printSubscribers(ArrayList<Subscriber> subscribers) {
        //print subscribers
        printSortedSubscribers(subscribers);

        //print subscribers ordered by address
        printSortedSubscribers(orderByAddress(subscribers));

        //print subscribers ordered by surname
        printSortedSubscribers(orderBySurname(subscribers));

        //print subscribers ordered by name
        printSortedSubscribers(orderByName(subscribers));
    }

    /**
     * This method ordered subscribers by address.
     *
     * @param subscribers - list with subscribers
     * @return - ordered list with subscribers
     */
    private ArrayList<Subscriber> orderByAddress(ArrayList<Subscriber> subscribers) {

        return null;
    }

    /**
     * This method ordered subscribers by surname.
     *
     * @param subscribers - list with subscribers
     * @return - ordered list with subscribers
     */
    private ArrayList<Subscriber> orderBySurname(ArrayList<Subscriber> subscribers) {

        return null;
    }

    /**
     * This method ordered subscribers by name.
     *
     * @param subscribers - list with subscribers
     * @return - ordered list with subscribers
     */
    private ArrayList<Subscriber> orderByName(ArrayList<Subscriber> subscribers) {

        return null;
    }

    /**
     * This method print subscribers.
     *
     * @param subscribers - list with subscribers
     */
    private void printSortedSubscribers(ArrayList<Subscriber> subscribers) {
        for (Subscriber s : subscribers) {
            System.out.println("Telephone number: " + s.getTelephoneNumber() + " , full name: "
                    + s.getFullName() + " , address: " + s.getAddress());
        }
    }
}
