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
        Article firstArticle = new Article("firstHeader", "firstDate", firstKeywords);
        Article secondArticle = new Article("secondHeader", "secondDate", secondKeywords);
        Article thirdArticle = new Article("thirdHeader", "thirdDate", thirdKeywords);
        Article fourthArticle = new Article("fourthHeader", "fourthDate", fourthKeywords);
        Article fivesArticle = new Article("firstHeader", "firstDate", secondKeywords);
        Article sixthArticle = new Article("secondHeader", "secondDate", firstKeywords);
        Article seventhArticle = new Article("thirdHeader", "thirdDate", fourthKeywords);
        Article eighthArticle = new Article("fourthHeader", "fourthDate", thirdKeywords);

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
