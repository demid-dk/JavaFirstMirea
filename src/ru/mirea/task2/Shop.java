package ru.mirea.task2;

import java.util.ArrayList;

public class Shop {

  ArrayList<Computer> computers;

  public Shop() {
    this.computers = new ArrayList<Computer>(10);
  }

  public Shop(ArrayList<Computer> computers) {
    this.computers = computers;
  }

  public void deleteComputer(int index) {
    this.computers.remove(index);
  }

  public void deleteComputer(Computer computer) {
    this.computers.remove(computer);
  }

  public void addComputer(int index, Computer computer) {
    this.computers.add(index, computer);
  }

  public Computer searchComputer(String GPU, String CPU) {
    Computer computer = null;
    for (int i = 0; i < this.computers.size(); i++) {
      if (computers.get(i).getCPU().equals(CPU) && computers.get(i).getGPU().equals(GPU)) {
        computer = computers.get(i);
      }
    }
    return computer;
  }
}
