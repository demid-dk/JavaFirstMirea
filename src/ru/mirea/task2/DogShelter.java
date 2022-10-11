package ru.mirea.task2;

import java.util.Scanner;

public class DogShelter {

  public static void main(String[] args) {
    System.out.print("Введите кол-во собак: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Dog[] dogs = new Dog[n];
    String name;
    int age;
    for (int i = 0; i < dogs.length; i++) {
      System.out.print("Введите имя " + String.valueOf(i+1) + "-й собаки: ");
      name = scanner.next();
      System.out.print("Введите возраст " + String.valueOf(i+1) + "-й собаки: ");
      age = scanner.nextInt();
      dogs[i] = new Dog(name, age);
    }

    for (int i = 0; i < dogs.length; i++) {
      System.out.println(dogs[i]);
    }
  }
}
