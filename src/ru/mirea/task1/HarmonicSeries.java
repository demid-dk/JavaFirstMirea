package ru.mirea.task1;

public class HarmonicSeries {

  public static void main(String[] args) {
    double sum = 0;
    System.out.println("Первые 10 элементов гармонического ряда");
    for (int i = 1; i <= 10; i++) {
      double num = 1 / (double) i;
      sum += num;
      String num1 = String.format("%.2f", num);
      if (i < 10) {
        System.out.print(num1 + ", ");
      } else {
        System.out.println(num1);
      }
    }
    String m = String.format("%.2f", sum);
    System.out.println("Сумма: " + m);
  }
}