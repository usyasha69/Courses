package com.company.collections.custom_collection;

public class Tester {

    public void testCustomCollection() {
        CustomCollection<Integer> customCollection = new CustomCollection<>();

        customCollection.add(0);
        customCollection.add(1);
        customCollection.add(2);
        customCollection.add(3);
        customCollection.add(4);

        customCollection.remove(0);
        System.out.println(customCollection.size());

//        System.out.println(customCollection.size());
//
//        customCollection.remove(0);
//
//        customCollection.clear();
//
//        if (customCollection.isEmpty()) {
//            System.out.println("Empty");
//        }
//
        for (int i = 0; i < customCollection.size(); i++) {
            System.out.println(customCollection.get(i));
        }


    }
}
