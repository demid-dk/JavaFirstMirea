package ru.mirea.task2;

import java.util.Scanner;

public class Array {

  public static void main(String[] args) {
    System.out.print("Введите длинну массива: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] array = new String[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.next();
    }
    String buff;
    for (int i = 0; i < array.length / 2; i++) {
      buff = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = buff;
    }
    System.out.println(" ");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
