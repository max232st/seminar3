package org.example.seminar3.hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Batman", 150, 1998, 25);
        Book book2 = new Book("Book2", "Robin", 75, 2001, 47);
        Book book3 = new Book("Book3", "Madam", 320, 2015, 71);
        Book book4 = new Book("Book4", "Pinki", 68, 2021, 80);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        List<String> listFind = FindBooks(bookList, "a", 2010);
        if (listFind.isEmpty()) {
            System.out.println("Книги не найдены. Измените параметры поиска.");
        } else {
            System.out.println(listFind);
        }
    }

    public static List<String> FindBooks(List<Book> bookList, String authorNameChars, Integer minYear) {
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (checkPrimeNumber(bookList.get(i).getPages()) &&
                    bookList.get(i).getFamily().toLowerCase().contains(authorNameChars) &&
                    bookList.get(i).getYear() >= minYear) {
                ls.add(bookList.get(i).getName());
            }
        }
        return ls;
    }

    public static boolean checkPrimeNumber(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
