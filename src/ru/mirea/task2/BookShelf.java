package ru.mirea.task2;

import java.util.Arrays;

public class BookShelf {
  int numOfBooks;

  Book[] books;

  public BookShelf(int numOfBooks) {
    this.numOfBooks = numOfBooks;
    this.books = new Book[numOfBooks];
  }

  public int getNumOfBooks() {
    return numOfBooks;
  }

  public Book[] getBooks() {
    return books;
  }

  public void setBooks(Book[] books) {
    this.books = books;
    this.numOfBooks = books.length;
  }

  public Book getLatest() {
    int year = 0;
    Book book = null;
    for (int i = 0; i < books.length; i++) {
      int book_year = books[i].getYear();
      if (book_year > year) {
        year = book_year;
        book = books[i];
      }
    }
    return book;
  }

  public Book getEarliest() {
    int year = 999999999;
    Book book = null;
    for (int i = 0; i < books.length; i++) {
      int book_year = books[i].getYear();
      if (book_year < year) {
        year = book_year;
        book = books[i];
      }
    }
    return book;
  }

  public void sortBooksByYear(int leftBorder, int rightBorder) {
    int leftMarker = leftBorder;
    int rightMarker = rightBorder;
    int pivot = books[(leftMarker + rightMarker) / 2].getYear();
    do {
      // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
      while (books[leftMarker].getYear() < pivot) {
        leftMarker++;
      }
      // Двигаем правый маркер, пока элемент больше, чем pivot
      while (books[rightMarker].getYear() > pivot) {
        rightMarker--;
      }
      // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
      if (leftMarker <= rightMarker) {
        // Левый маркер будет меньше правого только если мы должны выполнить swap
        if (leftMarker < rightMarker) {
          Book tmp = books[leftMarker];
          books[leftMarker] = books[rightMarker];
          books[rightMarker] = tmp;
        }
        // Сдвигаем маркеры, чтобы получить новые границы
        leftMarker++;
        rightMarker--;
      }
    } while (leftMarker <= rightMarker);

    // Выполняем рекурсивно для частей
    if (leftMarker < rightBorder) {
      sortBooksByYear(leftMarker, rightBorder);
    }
    if (leftBorder < rightMarker) {
      sortBooksByYear(leftBorder, rightMarker);
    }
  }

  @Override
  public String toString() {
    return "BookShelf{" +
        "numOfBooks=" + numOfBooks +
        ", books=" + Arrays.toString(books) +
        '}';
  }
}
