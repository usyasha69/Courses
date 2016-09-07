package com.company.collections.library;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Journal> journals;
    private ArrayList<Yearbook> yearbooks;

    private LiteratureModel literatureModel;

    public Library(ArrayList<Book> books, ArrayList<Journal> journals, ArrayList<Yearbook> yearbooks) {
        this.books = books;
        this.journals = journals;
        this.yearbooks = yearbooks;
    }

    public Library(LiteratureModel literatureModel) {
        this.literatureModel = literatureModel;

        books = literatureModel.getBooks();
        journals = literatureModel.getJournals();
        yearbooks = literatureModel.getYearbooks();
    }

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

    /**
     * This method print all literature in library.
     */
    public void printLiterature() {
        //print all books in library
        if (books.size() != 0) {
            System.out.println("Books: ");
            for (Book b : books) {
                System.out.print("\nName: " + b.getName() + ", Author: " + b.getAuthor()
                        + ", Publishing House: " + b.getPublishingHouse() + ", Publishing Year: "
                        + b.getPublishingYear());
            }
        } else {
            System.out.println("0 books in library!");
        }

        //print all journals in library
        if (journals.size() != 0) {
            System.out.println("\n\nJournals: ");
            for (Journal j : journals) {
                System.out.print("\nName: " + j.getName() + ", Subjects: " + j.getSubjects()
                        + ", Publishing date: " + j.getPublishingDate());
            }
        } else {
            System.out.println("0 journals in library!");
        }

        //print all yearbooks in library
        if (yearbooks.size() != 0) {
            System.out.println("\n\nYearbooks: ");
            for (Yearbook y : yearbooks) {
                System.out.print("\nName: " + y.getName() + ", Subjects: " + y.getSubjects()
                        + ", Publishing House: " + y.getPublishingHouse() + ", Publishing Year: "
                        + y.getPublishingYear());
            }
        } else {
            System.out.println("0 yearbooks in library!");
        }
    }

    public void printYearLiterature(int years) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(System.currentTimeMillis()));

        //set current year
        int currentYear = calendar.get(Calendar.YEAR);

        //print all books in library for the last years
        if (books.size() != 0) {
            System.out.println("Books: ");
            for (Book b : books) {
                if (b.getPublishingYear() <= currentYear && b.getPublishingYear() > (currentYear - years)) {
                    System.out.print("\nName: " + b.getName() + ", Author: " + b.getAuthor()
                            + ", Publishing House: " + b.getPublishingHouse() + ", Publishing Year: "
                            + b.getPublishingYear());
                }
            }
        } else {
            System.out.println("0 books in library!");
        }

        //print all journals in library for the last years
        if (journals.size() != 0) {
            System.out.println("\n\nJournals: ");
            for (Journal j : journals) {
                if (getPublishingYear(j.getPublishingDate()) <= currentYear
                        && getPublishingYear(j.getPublishingDate()) > (currentYear - years)) {
                    System.out.print("\nName: " + j.getName() + ", Subjects: " + j.getSubjects()
                            + ", Publishing date: " + j.getPublishingDate());
                }
            }
        } else {
            System.out.println("0 journals in library!");
        }

        //print all yearbooks in library for the last years
        if (yearbooks.size() != 0) {
            System.out.println("\n\nYearbooks: ");
            for (Yearbook y : yearbooks) {
                if (y.getPublishingYear() <= currentYear && y.getPublishingYear() > (currentYear - years))
                    System.out.print("\nName: " + y.getName() + ", Subjects: " + y.getSubjects()
                            + ", Publishing House: " + y.getPublishingHouse() + ", Publishing Year: "
                            + y.getPublishingYear());
            }
        } else {
            System.out.println("0 yearbooks in library!");
        }
    }

    /**
     * This method takes to entry date in String format and return year in Integer format.
     *
     * @param date - text date
     * @return - year in Integer format
     */
    private int getPublishingYear(String date) {
        String[] splitArray = date.split("-");

        return Integer.parseInt(splitArray[splitArray.length - 1]);
    }
}
