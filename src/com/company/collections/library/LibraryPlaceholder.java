package com.company.collections.library;

import java.util.ArrayList;

public class LibraryPlaceholder {

    /**
     * This method create literature and return literature model.
     *
     * @return - literature model
     */
    public LiteratureModel fillingLibrary() {
        //array lists for literature model
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Journal> journals = new ArrayList<>();
        ArrayList<Yearbook> yearbooks = new ArrayList<>();

        LiteratureModel literatureModel = new LiteratureModel();

        //filling array list with books
        books.add(new Book("firstBook", "firstBookAuthor", "firstPublishingHouse", 1995));
        books.add(new Book("secondBook", "secondBookAuthor", "secondPublishingHouse", 2005));
        books.add(new Book("thirdBook", "thirdBookAuthor", "thirdPublishingHouse", 2011));
        books.add(new Book("fourthBook", "fourthBookAuthor", "fourthPublishingHouse", 2014));
        books.add(new Book("fivesBook", "fivesBookAuthor", "fivesPublishingHouse", 2016));

        //filling array list with journals
        journals.add(new Journal("firstJournal", "firstSubjects", "14-08-2005"));
        journals.add(new Journal("secondJournal", "secondSubjects", "14-08-2013"));
        journals.add(new Journal("thirdJournal", "thirdSubjects", "14-08-2012"));
        journals.add(new Journal("fourthJournal", "fourthSubjects", "14-08-2016"));
        journals.add(new Journal("fivesJournal", "fivesSubjects", "14-08-2015"));

        //filling array list with yearbooks
        yearbooks.add(new Yearbook("firstYearbook", "firstSubjects", "firstPublishingHouse", 2005));
        yearbooks.add(new Yearbook("secondYearbook", "secondSubjects", "secondPublishingHouse", 2011));
        yearbooks.add(new Yearbook("thirdYearbook", "thirdSubjects", "thirdPublishingHouse", 2010));
        yearbooks.add(new Yearbook("fourthYearbook", "fourthSubjects", "fourthPublishingHouse", 2012));
        yearbooks.add(new Yearbook("fivesYearbook", "fivesSubjects", "fivesPublishingHouse", 2016));
        yearbooks.add(new Yearbook("sixthYearbook", "sixthSubjects", "sixthPublishingHouse", 2016));

        //filling literature model
        literatureModel.setBooks(books);
        literatureModel.setJournals(journals);
        literatureModel.setYearbooks(yearbooks);

        return literatureModel;
    }
}
