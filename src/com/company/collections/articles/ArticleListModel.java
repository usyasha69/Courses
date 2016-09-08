package com.company.collections.articles;

import java.util.ArrayList;

public class ArticleListModel {
    private ArrayList<Article> firstList;
    private ArrayList<Article> secondList;

    public ArrayList<Article> getFirstList() {
        return firstList;
    }

    public void setFirstList(ArrayList<Article> firstList) {
        this.firstList = firstList;
    }

    public ArrayList<Article> getSecondList() {
        return secondList;
    }

    public void setSecondList(ArrayList<Article> secondList) {
        this.secondList = secondList;
    }
}
