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

        //create books
        Book firstBook = new Book("firstBook", "firstBookAuthor", "firstPublishingHouse", 1995);
        Book secondBook = new Book("secondBook", "secondBookAuthor", "secondPublishingHouse", 2005);
        Book thirdBook = new Book("thirdBook", "thirdBookAuthor", "thirdPublishingHouse", 2011);
        Book fourthBook = new Book("fourthBook", "fourthBookAuthor", "fourthPublishingHouse", 2014);
        Book fivesBook = new Book("fivesBook", "fivesBookAuthor", "fivesPublishingHouse", 2016);

        //filling array list with books
        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(fourthBook);
        books.add(fivesBook);

        //create journal
        Journal firstJournal = new Journal("firstJournal", "firstSubjects", "14-08-2005");
        Journal secondJournal = new Journal("secondJournal", "secondSubjects", "14-08-2013");
        Journal thirdJournal = new Journal("thirdJournal", "thirdSubjects", "14-08-2012");
        Journal fourthJournal = new Journal("fourthJournal", "fourthSubjects", "14-08-2016");
        Journal fivesJournal = new Journal("fivesJournal", "fivesSubjects", "14-08-2015");

        //filling array list with journals
        journals.add(firstJournal);
        journals.add(secondJournal);
        journals.add(thirdJournal);
        journals.add(fourthJournal);
        journals.add(fivesJournal);

        //create yearbooks
        Yearbook firstYearbook = new Yearbook("firstYearbook", "firstSubjects", "firstPublishingHouse", 2005);
        Yearbook secondYearbook = new Yearbook("secondYearbook", "secondSubjects", "secondPublishingHouse", 2011);
        Yearbook thirdYearbook = new Yearbook("thirdYearbook", "thirdSubjects", "thirdPublishingHouse", 2010);
        Yearbook fourthYearbook = new Yearbook("fourthYearbook", "fourthSubjects", "fourthPublishingHouse", 2012);
        Yearbook fivesYearbook = new Yearbook("fivesYearbook", "fivesSubjects", "fivesPublishingHouse", 2016);
        Yearbook sixthYearbook = new Yearbook("sixthYearbook", "sixthSubjects", "sixthPublishingHouse", 2016);

        //filling array list with yearbooks
        yearbooks.add(firstYearbook);
        yearbooks.add(secondYearbook);
        yearbooks.add(thirdYearbook);
        yearbooks.add(fourthYearbook);
        yearbooks.add(fivesYearbook);
        yearbooks.add(sixthYearbook);

        //filling literature model
        literatureModel.setBooks(books);
        literatureModel.setJournals(journals);
        literatureModel.setYearbooks(yearbooks);

        return literatureModel;
    }
}
