package com.company.hometask.TasksSeven.articles;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (!header.equals(article.header)) return false;
        if (!publishingDate.equals(article.publishingDate)) return false;
        return keywords.equals(article.keywords);

    }

    /**
     * This method compare 2 articles by header and publishing date.
     *
     * @param o - article
     * @return - articles equal by header and publishing date.
     */
    public boolean equalsByHeaderAndDate(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (!header.equals(article.header)) return false;
        return publishingDate.equals(article.publishingDate);
    }

    @Override
    public String toString() {
        return "Article{" +
                "header='" + header + '\'' +
                ", publishingDate='" + publishingDate + '\'' +
                ", keywords=" + keywords.toString() +
                '}';
    }
}
