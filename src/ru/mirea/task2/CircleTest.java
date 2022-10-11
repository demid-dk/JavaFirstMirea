package ru.mirea.task2;

import java.util.Scanner;

public class CircleTest {
  public static void main(String[] args) {
    double r;
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите радиус окружности: ");
    r = sc.nextDouble();
    Circle circle1 = new Circle(r);
    System.out.println(circle1);

    System.out.print("Введите радиус второй окружности: ");
    r = sc.nextDouble();
    Circle circle2 = new Circle(r);
    if (circle1.compare(circle2).equals("equals")){
      System.out.println(circle1 + " is " + circle1.compare(circle2) + " to " + circle2);
    } else {
      System.out.println(circle1 + " is " + circle1.compare(circle2) + " than " + circle2);
    }
  }
}
