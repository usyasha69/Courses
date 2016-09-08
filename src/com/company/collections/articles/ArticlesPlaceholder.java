package com.company.collections.articles;

import java.util.ArrayList;

public class ArticlesPlaceholder {

    public ArticleListModel fillingListArticles() {
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

        //filling lists with keywords
        firstKeywords.add("one");
        firstKeywords.add("two");
        firstKeywords.add("three");
        secondKeywords.add("four");
        secondKeywords.add("five");
        secondKeywords.add("six");
        thirdKeywords.add("seven");
        thirdKeywords.add("eight");
        thirdKeywords.add("nine");
        fourthKeywords.add("ten");
        fourthKeywords.add("eleven");
        fourthKeywords.add("twelve");

        //articles
        Article firstArticle = new Article("firstHeader", "21-02-2010", firstKeywords);
        Article secondArticle = new Article("secondHeader", "18-10-2016", secondKeywords);
        Article thirdArticle = new Article("thirdHeader", "14-12-2001", thirdKeywords);
        Article fourthArticle = new Article("fourthHeader", "22-09-2014", fourthKeywords);
        Article fivesArticle = new Article("firstHeader", "21-02-2010", secondKeywords);
        Article sixthArticle = new Article("secondHeader", "18-10-2016", firstKeywords);
        Article seventhArticle = new Article("thirdHeader", "14-12-2001", fourthKeywords);
        Article eighthArticle = new Article("fourthHeader", "22-09-2014", thirdKeywords);

        //filling lists articles
        firstList.add(firstArticle);
        firstList.add(secondArticle);
        firstList.add(thirdArticle);
        firstList.add(sixthArticle);
        firstList.add(seventhArticle);
        firstList.add(eighthArticle);
        secondList.add(firstArticle);
        secondList.add(fourthArticle);
        secondList.add(fivesArticle);
        secondList.add(secondArticle);
        secondList.add(thirdArticle);

        //set lists in model
        articleListModel.setFirstList(firstList);
        articleListModel.setSecondList(secondList);

        return articleListModel;
    }
}
