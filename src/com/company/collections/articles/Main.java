package com.company.collections.articles;

public class Main {
    public static void main(String[] args) {
        ArticleListModel articleListModel = new ArticlesPlaceholder().fillingListArticles();

        new ArticlesWorker().foundArticles(articleListModel);
    }
}
