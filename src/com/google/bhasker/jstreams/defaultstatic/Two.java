package com.google.bhasker.jstreams.defaultstatic;

public interface Two {
  public default void m1(){
    System.out.println("Default m1 from Two");
  }
  static void m2(){
    System.out.println("Static m2 from Two");
  }
}
