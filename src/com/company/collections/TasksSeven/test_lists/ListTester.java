package com.company.collections.TasksSeven.test_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTester {

    /**
     * This method compares ArrayList and LinkedList int the performance.
     */
    private static void testingLists() {
        //array list
        ArrayList<String> arrayList = new ArrayList<>();
        //linked list
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("TESTING FILLING TIME: \n");
        long fillingTime;

        //filling array list
        fillingTime = System.currentTimeMillis();
        for (int i = 0; i < 5.5E6; i++) {
            arrayList.add(String.valueOf(i));
        }
        System.out.println("Filling time of array list: "
                + (System.currentTimeMillis() - fillingTime) + " ms");

        //filling linked list
        fillingTime = System.currentTimeMillis();
        for (int i = 0; i < 5.5E6; i++) {
            linkedList.add(String.valueOf(i));
        }
        System.out.println("Filling time of linked list: "
                + (System.currentTimeMillis() - fillingTime) + " ms");

        //result of filling time
        System.out.println("Array list win!");

        System.out.println("\nTESTING OPERATION ADD TO START AND END LISTS: \n");
        long addTime;

        //operation add to end of array list
        addTime = System.currentTimeMillis();
        arrayList.add("25");
        System.out.println("Add time to end of array list: "
                + (System.currentTimeMillis() - addTime));
        //operation add to start of array list
        addTime = System.currentTimeMillis();
        arrayList.add(0, "25");
        System.out.println("Add time to start of array list: "
                + (System.currentTimeMillis() - addTime));

        //operation add to end of linked list
        addTime = System.currentTimeMillis();
        linkedList.add("25");
        System.out.println("Add time to end of linked list: "
                + (System.currentTimeMillis() - addTime));
        //operation add to start of linked list
        addTime = System.currentTimeMillis();
        linkedList.add(0, "25");
        System.out.println("Add time to start of linked list: "
                + (System.currentTimeMillis() - addTime));

        //result of add to start and end of lists
        System.out.println("Linked list win!");

        System.out.println("\nTESTING OPERATION GET OF START AND END LISTS: \n");
        long getTime;

        //operation get to start of array list
        getTime = System.currentTimeMillis();
        arrayList.get(0);
        System.out.println("Get time to start of array list: "
                + (System.currentTimeMillis() - getTime));
        //operation get to end of array list
        getTime = System.currentTimeMillis();
        arrayList.add(String.valueOf(arrayList.size() - 1));
        System.out.println("Get time to end of array list: "
                + (System.currentTimeMillis() - getTime));

        //operation get to start of linked list
        getTime = System.currentTimeMillis();
        linkedList.getFirst();
        System.out.println("Get time to start of linked list: "
                + (System.currentTimeMillis() - getTime));
        //operation get to end of linked list
        getTime = System.currentTimeMillis();
        linkedList.getLast();
        System.out.println("Get time to end of linked list: "
                + (System.currentTimeMillis() - getTime));

        //result of add to start and end of lists
        System.out.println("Draw!");

        System.out.println("\nTESTING OPERATION REMOVE OF START AND END ELEMENT IN LISTS: \n");
        long removeTime;

        //operation remove of start element of array list
        removeTime = System.currentTimeMillis();
        arrayList.remove(0);
        System.out.println("Remove time of start element in array list: "
                + (System.currentTimeMillis() - removeTime));
        //operation remove of end element of array list
        removeTime = System.currentTimeMillis();
        arrayList.remove(arrayList.size() - 1);
        System.out.println("Remove time of end element in array list: "
                + (System.currentTimeMillis() - removeTime));

        //operation remove of start element of linked list
        removeTime = System.currentTimeMillis();
        linkedList.remove(0);
        System.out.println("Remove time of start element in linked list: "
                + (System.currentTimeMillis() - removeTime));
        //operation remove of end element of linked list
        removeTime = System.currentTimeMillis();
        linkedList.remove(linkedList.size() - 1);
        System.out.println("Remove time of end element in linked list: "
                + (System.currentTimeMillis() - removeTime));

        //result remove of start and end element of lists
        System.out.println("Linked list win!");

        System.out.println("\nTESTING OPERATION REMOVE WITH ITERATOR OF ELEMENT IN LISTS: \n");
        long removeIteratorTime;

        //operation remove with iterator of array list
        removeIteratorTime = System.currentTimeMillis();
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            String s = arrayListIterator.next();
            if (s.equals("500000")) {
                arrayListIterator.remove();
            }
        }
        System.out.println("Remove time with iterator in array list: "
                + (System.currentTimeMillis() - removeIteratorTime));

        //operation remove with iterator of linked list
        removeIteratorTime = System.currentTimeMillis();
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            String s = linkedListIterator.next();
            if (s.equals("500500")) {
                linkedListIterator.remove();
            }
        }
        System.out.println("Remove time with iterator in linked list: "
                + (System.currentTimeMillis() - removeIteratorTime));

        //result remove with iterator
        System.out.println("Draw!");

        final int ADDITIONAL_VALUES = 150;
        for (int i = 0; i < ADDITIONAL_VALUES; i++) {
            arrayList.add(String.valueOf(i));
            linkedList.add(String.valueOf(i));
        }

        System.out.println("\nTESTING OF SORT IN LISTS: \n");
        long timeSort;
        //array list sort
        timeSort = System.currentTimeMillis();
        Collections.sort(arrayList);
        System.out.println("Time of sort in array list: " + (System.currentTimeMillis() - timeSort));

        //linked list sort
        timeSort = System.currentTimeMillis();
        Collections.sort(linkedList);
        System.out.println("Time of sort in linked list: " + (System.currentTimeMillis() - timeSort));

        //result of sort
        System.out.println("Array list win!");
    }



    public static void main(String[] args) {
        testingLists();
    }
}
