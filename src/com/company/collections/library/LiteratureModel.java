package com.company.collections.library;

import java.util.ArrayList;

public class LiteratureModel {
    private ArrayList<Book> books;
    private ArrayList<Journal> journals;
    private ArrayList<Yearbook> yearbooks;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Journal> getJournals() {
        return journals;
    }

    public void setJournals(ArrayList<Journal> journals) {
        this.journals = journals;
    }

    public ArrayList<Yearbook> getYearbooks() {
        return yearbooks;
    }

    public void setYearbooks(ArrayList<Yearbook> yearbooks) {
        this.yearbooks = yearbooks;
    }
}
