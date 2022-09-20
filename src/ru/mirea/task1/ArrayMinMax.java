package ru.mirea.task1;

import java.util.Scanner;

public class ArrayMinMax {

  public static void main(String[] args) {
    int[] array;
    Scanner in = new Scanner(System.in);
    System.out.print("Введите кол-во чисел в массиве: ");
    int n = in.nextInt();

    array = new int[n];
    System.out.printf("Введите %d чисел: ", n);
    int sum = 0;
    int i = 0;
    int min = 999999999;
    int max = 0;
    while (i < n) {
      array[i] = in.nextInt();
      if (array[i] < min) {
        min = array[i];
      }
      if (array[i] > max) {
        max = array[i];
      }
      sum += array[i];
      i++;
    }
    System.out.println("Сумма: " + sum);
    System.out.println("Минимальное число: " + min);
    System.out.println("Максимальное число: " + max);
  }
}
