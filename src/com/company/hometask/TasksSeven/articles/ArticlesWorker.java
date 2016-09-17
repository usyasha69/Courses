package com.company.hometask.TasksSeven.articles;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArticlesWorker {

    /**
     * This method start the program.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ArticleListModel articleListModel = ArticlesPlaceholder.fillingListArticles();
        ArticlesWorker.foundArticles(articleListModel);
    }

    /**
     * This method found & print equal articles and found & print articles with
     * equal header and publishing date.
     *
     * @param articleListModel - model with two article lists
     */
    public static void foundArticles(ArticleListModel articleListModel) {
        //lists with articles
        ArrayList<Article> firstList = articleListModel.getFirstList();
        ArrayList<Article> secondList = articleListModel.getSecondList();

        //found equal articles and print
        System.out.println("Equal articles in first and second list: ");
        printArticle(foundEqualArticles(firstList, secondList));

        //found article with equal header and publishing date and print
        System.out.println("\n\nArticles with equal header and publishing date in first and second list: ");
        printArticle(foundEqualHeaderAndPublishingDateArticles(firstList, secondList));
    }

    /**
     * This method compare articles in two lists and return set with equal articles.
     *
     * @param firstList  - first list with articles
     * @param secondList - second list with articles
     * @return - set with equal articles
     */
    private static LinkedHashSet<Article> foundEqualArticles(ArrayList<Article> firstList, ArrayList<Article> secondList) {
        //result
        LinkedHashSet<Article> equalArticles = new LinkedHashSet<>();

        //found equal articles
        for (Article flArticle : firstList) {
            for (Article slArticle : secondList) {
                if (flArticle.equals(slArticle)) {
                    equalArticles.add(flArticle);
                }
            }
        }

        return equalArticles;
    }

    /**
     * This method found articles with equal header and publishing date.
     *
     * @param firstList  - first list with articles
     * @param secondList - second list with articles
     * @return - set with articles
     */
    private static LinkedHashSet<Article> foundEqualHeaderAndPublishingDateArticles(
            ArrayList<Article> firstList, ArrayList<Article> secondList) {

        //result
        LinkedHashSet<Article> equalHeaderAndPublishingDateArticles = new LinkedHashSet<>();

        //found articles with equal header and publishing date
        for (Article flArticle : firstList) {
            for (Article slArticle : secondList) {
                if (flArticle.equalsByHeaderAndDate(slArticle)) {
                    equalHeaderAndPublishingDateArticles.add(flArticle);
                }
            }
        }

        return equalHeaderAndPublishingDateArticles;
    }

    /**
     * This method print equal articles.
     *
     * @param articles - set with equal articles
     */
    private static void printArticle(LinkedHashSet<Article> articles) {
        //print equal articles
        for (Article a : articles) {
            System.out.println(a.toString());
        }
    }
}
