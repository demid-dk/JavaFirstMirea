package ru.mirea.task2;
import java.util.Scanner;


public class AuthorTest {
  public static void main(String[] args) {
    String email1;
    Author a1 = new Author("name", "mail@gmail.com", 'm');
    System.out.println("Имя автора: " + a1.getName());
    System.out.println("Почта автора: " + a1.getEmail());
    System.out.println("Пол автора: " + a1.getGender());

    Scanner sc = new Scanner(System.in);
    System.out.print("Введите новую почту: ");
    email1 = sc.next();
    a1.setEmail(email1);

    System.out.print(a1);
  }
}
