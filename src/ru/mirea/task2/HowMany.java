package ru.mirea.task2;

import java.util.Scanner;

public class HowMany {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String string = sc.nextLine();
    int words = 0;
    for (int i = 1; i < string.length(); i++) {
      if(string.charAt(i-1) == ' ' & string.charAt(i) != ' ') {
        words++;
      }
    }
    words++;
    System.out.println(words + " слов");
  }
}
