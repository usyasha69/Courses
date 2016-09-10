package com.company.collections.TasksSix.library;

public class Book extends Literature {
    private String author;
    private String publishingHouse;
    private int publishingYear;

    public Book(String name, String author, String publishingHouse, int publishingYear) {
        super(name);
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
