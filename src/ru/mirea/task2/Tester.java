package ru.mirea.task2;

import java.util.Scanner;

public class Tester {
  public static void main (String[] args) {
    Circle[] arrayOfCircles;
    System.out.print("Введите кол-во окружностей: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    arrayOfCircles = new Circle[n];
    double x, y, r;
    for (int i = 0; i < arrayOfCircles.length; i++) {
      System.out.print("Введите положение центра окружности в плоскости: ");
      x = sc.nextDouble();
      y = sc.nextDouble();
      System.out.print("Введите радиус окружности: ");
      r = sc.nextDouble();
      arrayOfCircles[i] = new Circle(r, x, y);
    }

    for (int i = 0; i < arrayOfCircles.length; i++) {
      System.out.println(arrayOfCircles[i]);
    }
  }
}
