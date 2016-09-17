package com.company.hometask.TasksSeven.subscribers;

import java.util.ArrayList;

public class SubscribersPlaceholder {

    /**
     * This method create subscribers and fillin list with subscribers.
     *
     * @return - list with subscribers
     */
    public static ArrayList<Subscriber> fillingSubscribers() {
        //result
        ArrayList<Subscriber> subscribers = new ArrayList<>();

        //filling list with subscribers
        subscribers.add(new Subscriber("099-02-55-132", "Avdeev Anton E.", "Soviet str."));
        subscribers.add(new Subscriber("099-03-42-121", "Kucheryaviy Maxim A.", "Tobolskaya str."));
        subscribers.add(new Subscriber("099-11-99-248", "Samochernov Dmitriy S.", "Botanicheskiy Sad str."));
        subscribers.add(new Subscriber("099-13-22-132", "Tisyachenko Sergey A", "Nauki str."));
        subscribers.add(new Subscriber("099-08-50-387", "Usic Constantin D", "Olekseevskaya str."));
        subscribers.add(new Subscriber("099-01-44-122", "Shevchenko Nikolay C.", "Shekspira str."));

        return subscribers;
    }
}
