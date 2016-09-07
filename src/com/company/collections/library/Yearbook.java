package com.company.collections.library;

public class Yearbook extends Literature {
    private String subjects;
    private String publishingHouse;
    private int publishingYear;

    public Yearbook(String name, String subjects, String publishingHouse, int publishingYear) {
        super(name);
        this.subjects = subjects;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
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
