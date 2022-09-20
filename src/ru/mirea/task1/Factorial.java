package ru.mirea.task1;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = sc.nextInt();
    System.out.print("Факториал числа: " + factorial(n));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int s = 1;
    for (int i = 1; i <= n; i++) {
      s *= i;
    }
    return s;
  }
}