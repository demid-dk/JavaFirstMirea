package ru.mirea.task2;

import java.util.Scanner;

public class BookTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите название книги: ");
    String title = sc.nextLine();
    System.out.print("Введите автора книги: ");
    String author = sc.nextLine();
    System.out.print("Введите год издательства книги: ");
    int year = sc.nextInt();
    Book book = new Book(title, author, year);
    System.out.println(book);
  }
}
