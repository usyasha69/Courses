package com.company.collections.TasksSeven.articles;

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

        if (header != null ? !header.equals(article.header) : article.header != null) return false;
        if (publishingDate != null ? !publishingDate.equals(article.publishingDate) : article.publishingDate != null)
            return false;
        return keywords != null ? keywords.equals(article.keywords) : article.keywords == null;

    }
}
