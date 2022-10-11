package ru.mirea.task2;

import java.util.Arrays;

public class PokerPlayer {

  String[] cards;

  public PokerPlayer(String[] cards) {
    this.cards = cards;
  }

  public void setCards(String[] cards) {
    this.cards = cards;
  }

  public String[] getCards() {
    return cards;
  }

  @Override
  public String toString() {
    return "PokerPlayer{" +
        "cards=" + Arrays.toString(cards) +
        '}';
  }
}
