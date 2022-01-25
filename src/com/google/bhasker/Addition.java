package com.google.bhasker;

public class Addition {

  public static void main(String args[]){
    Addition obj = new Addition();
    obj.add(10, 5);
    obj.multiply(10, 5);
    obj.divide(10, 5);
    obj.minus(10, 5);
  }

  public void add(int a, int b){
    System.out.println(a+b);
  }

  public void multiply(int a, int b){
    System.out.println(a*b);
  }

  public void divide(int a, int b){
    System.out.println(a/b);
  }

  public void minus(int a, int b){
    System.out.println(a-b);
  }

}
