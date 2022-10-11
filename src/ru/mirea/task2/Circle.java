package ru.mirea.task2;

public class Circle {
  double r, S, P;

  Point center;

  public Circle(double r, double x, double y) {
    this.r = r;
    this.S = Math.PI * Math.pow(this.r, 2);
    this.P = 2 * Math.PI * r;
    center = new Point(x, y);
  }

  public Circle(double r) {
    this.r = r;
    this.S = Math.PI * Math.pow(this.r, 2);
    this.P = 2 * Math.PI * r;
  }

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
    this.S = Math.PI * Math.pow(this.r, 2);
    this.P = 2 * Math.PI * r;
  }

  public double getS() {
    return S;
  }

  public double getP() {
    return P;
  }

  public void setCenter(double x, double y) {
    this.center.setX(x);
    this.center.setY(y);
  }

  public void setX(double x){
    this.center.setX(x);
  }

  public void setY(double y){
    this.center.setY(y);
  }

  public String compare(Circle circle) {
    if (this.getS() > circle.getS()){
      return "bigger";
    } else if (this.getS() == circle.getS()) {
      return "equals";
    } else {
      return "smaller";
    }
  }

  @Override
  public String toString() {
    return "Circle{" +
        "r=" + r +
        ", S=" + String.format("%.2f", S) +
        ", P=" + String.format("%.2f", P) +
        '}';
  }
}
