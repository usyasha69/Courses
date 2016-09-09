//2. Написать программу "Библиотека". Программа должна позволять хранить информацию о книгах
// (название, автор, издательство, год издания), о журналах (название, тематика, дата выхода в печать),
// о ежегодниках (название, тематика, издательство, год издания).
// И иметь функционал вывода в консоль списка литературы (всю доступную информацию)
// с фильтрацией по дате (за этот год, за последние 3 года, 5 лет и пр.).
package com.company.collections.library;

public class Main {
    public static void main(String[] args) {
        //filling library literature
        Library library = new Library();

        //generate literature for library
        library.setBooks(LiteratureGenerator.generateBooks());
        library.setJournals(LiteratureGenerator.generateJournals());
        library.setYearbooks(LiteratureGenerator.generateYearbooks());

        //print all literature in library
        System.out.println("All literature in library:");
        library.printLiterature();

        //print all literature in library for last year
        System.out.println("\n\nAll literature in library for last year:");
        library.printYearLiterature(1);

        //print all literature in library for last three years
        System.out.println("\n\nAll literature in library for last three years:");
        library.printYearLiterature(3);

        //print all literature in library for last five years
        System.out.println("\n\nAll literature in library for last five years");
        library.printYearLiterature(5);
    }
}
