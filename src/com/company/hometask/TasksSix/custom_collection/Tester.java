package com.company.hometask.TasksSix.custom_collection;

public class Tester {

    /**
     * This method start the program.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        Tester.testCustomCollection();
    }

    /**
     * This method tested custom collection.
     */
    public static void testCustomCollection() {
        System.out.println("Test of first default constructor: ");
        CustomCollection<Integer> firstCustomCollection = new CustomCollection<>();

        System.out.println("Size of collection: " + firstCustomCollection.size());

        System.out.println("\nTest of second constructor");
        CustomCollection<Integer> secondCustomCollection = new CustomCollection<>(5);

        System.out.println("Size of collection: " + secondCustomCollection.size());

        System.out.println("\nTest of method add(E element) and method get(index i) in first collection: ");
        for (int i = 0; i < 10; i++) {
            firstCustomCollection.add(i);
        }

        System.out.println("Size of first collection: " + firstCustomCollection.size() + "\n");
        for (int i = 0; i < firstCustomCollection.size(); i++) {
            System.out.println(i + " element in first collection: " + firstCustomCollection.get(i));
        }

        System.out.println("\nTest of method add(E element) and method get(index i) in second collection: ");
        for (int i = 0; i < 10; i++) {
            secondCustomCollection.add(i);
        }

        System.out.println("Size of second collection: " + secondCustomCollection.size() + "\n");
        for (int i = 0; i < secondCustomCollection.size(); i++) {
            System.out.println(i + " element in second collection: " + secondCustomCollection.get(i));
        }

        System.out.println("\nTest of method add(int index, E element) in first collection: ");
        firstCustomCollection.add(0, 322);
        firstCustomCollection.add(3, 322);
        firstCustomCollection.add(4, null);
        firstCustomCollection.add(5, 322);


        System.out.println("Size of first collection: " + firstCustomCollection.size() + "\n");
        for (int i = 0; i < firstCustomCollection.size(); i++) {
            System.out.println(i + " element in first collection: " + firstCustomCollection.get(i));
        }

        System.out.println("\nTest of method add(int index, E element) in second collection: ");
        secondCustomCollection.add(0, 322);
        secondCustomCollection.add(1, null);
        secondCustomCollection.add(3, 322);
        secondCustomCollection.add(5, 322);

        System.out.println("Size of second collection: " + secondCustomCollection.size() + "\n");
        for (int i = 0; i < secondCustomCollection.size(); i++) {
            System.out.println(i + " element in second collection: " + secondCustomCollection.get(i));
        }

        System.out.println("\nTest of method remove(int index) in first collection: ");
        firstCustomCollection.remove(0);
        firstCustomCollection.remove(2);
        firstCustomCollection.remove(2);
        firstCustomCollection.remove(2);

        System.out.println("Size of first collection: " + firstCustomCollection.size() + "\n");
        for (int i = 0; i < firstCustomCollection.size(); i++) {
            System.out.println(i + " element in first collection: " + firstCustomCollection.get(i));
        }

        System.out.println("\nTest of method remove(int index) in second collection: ");
        secondCustomCollection.remove(0);
        secondCustomCollection.remove(0);
        secondCustomCollection.remove(1);
        secondCustomCollection.remove(2);

        System.out.println("Size of second collection: " + secondCustomCollection.size() + "\n");
        for (int i = 0; i < secondCustomCollection.size(); i++) {
            System.out.println(i + " element in second collection: " + secondCustomCollection.get(i));
        }

        System.out.println("\nTest of method clear() and isEmpty() in first collection: ");
        firstCustomCollection.clear();
        System.out.println("Size of first collection: " + firstCustomCollection.size() + "\n");
        if (firstCustomCollection.isEmpty()) {
            System.out.println("First collection is empty");
        }

        System.out.println("\nTest of method clear() and isEmpty() in second collection: ");
        secondCustomCollection.clear();
        System.out.println("Size of second collection: " + secondCustomCollection.size() + "\n");
        if (secondCustomCollection.isEmpty()) {
            System.out.println("Second collection is empty");
        }
    }
}
