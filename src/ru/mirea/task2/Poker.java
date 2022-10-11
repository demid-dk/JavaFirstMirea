package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите кол-во игроков: ");
    int n = sc.nextInt();
    String[] suit = {"♥", "♦", "♣", "♠"};
    String[] rank = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    ArrayList<String> deck = new ArrayList<>(52);
    for (int i = 0; i < suit.length; i++) {
      for (int j = 0; j < rank.length; j++) {
        deck.add(i * rank.length + j, suit[i] + rank[j]);
      }
    }

    for (int i = 0; i < deck.size(); i++) {
      System.out.print(deck.get(i) + " ");
    }
    System.out.println("");
    shuffle(deck);
    PokerPlayer[] players = new PokerPlayer[n];
    String[] playerCards;
    for (int i = 0; i < n; i++) {
      playerCards = new String[5];
      for (int j = 0; j < 5; j++) {
        playerCards[j] = deck.remove(0);
      }
      players[i] = new PokerPlayer(playerCards);
    }
    for (int i = 0; i < players.length; i++) {
      System.out.println(String.valueOf(i + 1) + " " + players[i]);
    }
  }

  public static void shuffle(ArrayList<String> deck) {
    int n;
    String buff;
    for (int i = 0; i < deck.size(); i++) {
      n = (int) (Math.random() * 36);
      buff = deck.get(i);
      deck.set(i, deck.get(n));
      deck.set(n, buff);
    }
  }
}
