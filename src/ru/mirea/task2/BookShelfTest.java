package ru.mirea.task2;

import java.util.Scanner;

public class BookShelfTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите вместимость полки: ");
    int n = sc.nextInt();
    BookShelf bookShelf = new BookShelf(n);

    Book[] books = bookShelf.getBooks();
    for (int i = 0; i < n; i++) {
      System.out.print("Введите название книги: ");
      String title = sc.next();
      System.out.print("Введите автора книги: ");
      String author = sc.next();
      System.out.print("Введите год издательства книги: ");
      int year = sc.nextInt();
      books[i] = new Book(title, author, year);
      System.out.println(books[i]);
    }
    bookShelf.setBooks(books);
    System.out.println();
    System.out.println(bookShelf.getLatest());
    System.out.println(bookShelf.getEarliest());
    System.out.println();
    System.out.println(bookShelf);
    System.out.println();
    bookShelf.sortBooksByYear(0, books.length - 1);
    System.out.println(bookShelf);
  }
}
