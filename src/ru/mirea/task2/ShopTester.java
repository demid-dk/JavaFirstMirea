package ru.mirea.task2;

public class ShopTester {

  public static void main(String[] args) {
    Shop shop = new Shop();
    String[] CPUs = {"CPU1", "CPU2", "CPU3", "CPU4"};
    String[] GPUs = {"GPU1", "GPU2", "GPU3", "GPU4"};
    for (int i = 0; i < CPUs.length; i++) {
      for (int j = 0; j < GPUs.length; j++) {
        shop.computers.add(i * CPUs.length + j, new Computer(CPUs[i], GPUs[j]));
      }
    }
    System.out.println(shop.computers);
  }
}
