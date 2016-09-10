package com.company.collections.TasksSeven.articles;

import java.util.ArrayList;

public class ArticlesPlaceholder {

    /**
     * This method create article list model with two lists.
     *
     * @return - article list model
     */
    public static ArticleListModel fillingListArticles() {
        //result
        ArticleListModel articleListModel = new ArticleListModel();

        //lists with article
        ArrayList<Article> firstList = new ArrayList<>();
        ArrayList<Article> secondList = new ArrayList<>();

        //create lists with keywords
        ArrayList<String> firstKeywords = new ArrayList<>();
        ArrayList<String> secondKeywords = new ArrayList<>();
        ArrayList<String> thirdKeywords = new ArrayList<>();
        ArrayList<String> fourthKeywords = new ArrayList<>();

        //filling first lists with keywords
        firstKeywords.add("one");
        firstKeywords.add("two");
        firstKeywords.add("three");

        //filling second lists with keywords
        secondKeywords.add("four");
        secondKeywords.add("five");
        secondKeywords.add("six");

        //filling third lists with keywords
        thirdKeywords.add("seven");
        thirdKeywords.add("eight");
        thirdKeywords.add("nine");

        //filling fourth lists with keywords
        fourthKeywords.add("ten");
        fourthKeywords.add("eleven");
        fourthKeywords.add("twelve");

        //filling first list articles
        firstList.add(new Article("firstHeader", "21-02-2010", firstKeywords));
        firstList.add(new Article("secondHeader", "18-10-2016", secondKeywords));
        firstList.add(new Article("thirdHeader", "14-12-2001", thirdKeywords));
        firstList.add(new Article("secondHeader", "18-10-2016", firstKeywords));
        firstList.add(new Article("thirdHeader", "14-12-2001", fourthKeywords));
        firstList.add(new Article("fourthHeader", "22-09-2014", thirdKeywords));

        //filling second list articles
        secondList.add(new Article("firstHeader", "21-02-2010", firstKeywords));
        secondList.add(new Article("fourthHeader", "22-09-2014", fourthKeywords));
        secondList.add(new Article("firstHeader", "21-02-2010", secondKeywords));
        secondList.add(new Article("secondHeader", "18-10-2016", secondKeywords));
        secondList.add(new Article("thirdHeader", "14-12-2001", thirdKeywords));

        //set lists in model
        articleListModel.setFirstList(firstList);
        articleListModel.setSecondList(secondList);

        return articleListModel;
    }
}
