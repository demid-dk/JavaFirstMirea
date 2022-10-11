package ru.mirea.task2;

import java.util.Scanner;

public class BallTest {
  public static void main(String[] args) {
    double x, y;
    Ball b1 = new Ball();
    System.out.println(b1.getX());
    System.out.println(b1.getY());
    System.out.println(b1);

    Scanner sc = new Scanner(System.in);
    x = sc.nextDouble();
    y = sc.nextDouble();
    Ball b2 = new Ball(x, y);
    System.out.println(b2.getX());
    System.out.println(b2.getY());
    x = sc.nextDouble();
    y = sc.nextDouble();
    System.out.println(b2);
    b2.setX(x);
    System.out.println(b2);
    b2.setXY(x, y);
    System.out.println(b2);
    b2.move(2, 3.4);
    System.out.println(b2);

  }
}
