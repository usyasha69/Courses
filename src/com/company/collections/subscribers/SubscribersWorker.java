package com.company.collections.subscribers;


import java.util.ArrayList;

public class SubscribersWorker {

    /**
     * This method ordered subscribers by address, surname & name and print subscribers.
     *
     * @param subscribers - list with subscribers
     */
    public void printSubscribers(ArrayList<Subscriber> subscribers) {
        //print subscribers
        System.out.println("All subscribers: \n");
        printSortedSubscribers(subscribers);

        //print subscribers ordered by address
        System.out.println("\nSubscribers ordered by address: \n");
        printSortedSubscribers(orderByAddress(subscribers));

        //print subscribers ordered by surname
        System.out.println("\nSubscribers ordered by surname: \n");
        printSortedSubscribers(orderBySurname(subscribers));

        //print subscribers ordered by name
        System.out.println("\nSubscribers ordered by name: \n");
        printSortedSubscribers(orderByName(subscribers));
    }

    /**
     * This method ordered subscribers by address.
     *
     * @param subscribers - list with subscribers
     * @return - ordered list with subscribers
     */
    private ArrayList<Subscriber> orderByAddress(ArrayList<Subscriber> subscribers) {
        //sorted array list with subscribers by address
        for (int i = 0; i < subscribers.size(); i++) {
            for (int j = 0; j < subscribers.size() - 1; j++) {
                if (subscribers.get(j).getAddress().compareToIgnoreCase(subscribers.get(j + 1).getAddress()) > 0) {

                    Subscriber temp = subscribers.get(j);
                    subscribers.set(j, subscribers.get(j + 1));
                    subscribers.set(j + 1, temp);
                }
            }
        }

        return subscribers;
    }

    /**
     * This method ordered subscribers by surname.
     *
     * @param subscribers - list with subscribers
     * @return - ordered list with subscribers
     */
    private ArrayList<Subscriber> orderBySurname(ArrayList<Subscriber> subscribers) {
        //sorted array list with placeholders by surname
        for (int i = 0; i < subscribers.size(); i++) {
            for (int j = 0; j < subscribers.size() - 1; j++) {
                if (getSurname(subscribers.get(j).getFullName())
                        .compareToIgnoreCase(getSurname(subscribers.get(j + 1).getFullName())) > 0) {

                    Subscriber temp = subscribers.get(j);
                    subscribers.set(j, subscribers.get(j + 1));
                    subscribers.set(j + 1, temp);
                }
            }
        }

        return subscribers;
    }

    /**
     * This method get surname in full name of subscriber.
     *
     * @param fullName - full name of subscriber
     * @return - surname of subscriber
     */
    private String getSurname(String fullName) {
        String[] array = fullName.split(" ");

        return array[0];
    }

    /**
     * This method ordered subscribers by name.
     *
     * @param subscribers - list with subscribers
     * @return - ordered list with subscribers
     */
    private ArrayList<Subscriber> orderByName(ArrayList<Subscriber> subscribers) {
        //sorted array list with placeholders by surname
        for (int i = 0; i < subscribers.size(); i++) {
            for (int j = 0; j < subscribers.size() - 1; j++) {
                if (getName(subscribers.get(j).getFullName())
                        .compareToIgnoreCase(getName(subscribers.get(j + 1).getFullName())) > 0) {

                    Subscriber temp = subscribers.get(j);
                    subscribers.set(j, subscribers.get(j + 1));
                    subscribers.set(j + 1, temp);
                }
            }
        }

        return subscribers;
    }

    /**
     * This method get name in full name of subscriber.
     *
     * @param fullName - full name of subscriber
     * @return - name of subscriber
     */
    private String getName(String fullName) {
        String[] array = fullName.split(" ");

        return array[1];
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
