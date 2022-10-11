package ru.mirea.task2;

public class Computer {

  String CPU, GPU;

  public Computer(String CPU, String GPU) {
    this.CPU = CPU;
    this.GPU = GPU;
  }

  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  public String getGPU() {
    return GPU;
  }

  public void setGPU(String GPU) {
    this.GPU = GPU;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "CPU='" + CPU + '\'' +
        ", GPU='" + GPU + '\'' +
        '}';
  }
}
