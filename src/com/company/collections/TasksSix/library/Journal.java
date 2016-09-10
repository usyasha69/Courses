package com.company.collections.TasksSix.library;

public class Journal extends Literature {
    private String subjects;
    private String publishingDate;

    public Journal(String name, String subjects, String publishingDate) {
        super(name);
        this.subjects = subjects;
        this.publishingDate = publishingDate;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }
}
