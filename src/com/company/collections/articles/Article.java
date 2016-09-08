package com.company.collections.articles;

import java.util.ArrayList;

public class Article {
    private String header;
    private String publishingDate;
    private ArrayList<String> keywords;

    public Article(String header, String publishingDate, ArrayList<String> keywords) {
        this.header = header;
        this.publishingDate = publishingDate;
        this.keywords = keywords;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public void setPublisihingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }
}
