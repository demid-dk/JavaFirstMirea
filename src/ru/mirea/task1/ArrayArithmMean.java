package ru.mirea.task1;

import java.util.Scanner;

public class ArrayArithmMean {

  public static void main(String[] args) {
    int[] array;
    Scanner in = new Scanner(System.in);
    System.out.print("Введите кол-во чисел в массиве: ");
    int n = in.nextInt();

    array = new int[n];
    System.out.printf("Введите %d чисел: ", n);
    int sum = 0;
    for (int i = 0; i < n; i++) {
      array[i] = in.nextInt();
      sum += array[i];
    }
    System.out.println("Сумма: " + sum);
    System.out.print("Среднее арифметическое: " + sum / n);
  }
}
