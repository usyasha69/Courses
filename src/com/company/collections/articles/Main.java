//3. Даны два списка статей (статья хранит заголовок, дату публикации и список ключевых слов).
// Найти одинаковые статьи, которые входят и в первый и во второй список.
// Найти статьи, у которых совпадают заголовки и даты публикации
package com.company.collections.articles;

public class Main {
    public static void main(String[] args) {
        new ArticlesWorker().foundArticles(new ArticlesPlaceholder().fillingListArticles());
    }
}
