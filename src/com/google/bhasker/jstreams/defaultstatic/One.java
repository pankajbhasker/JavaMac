package com.google.bhasker.jstreams.defaultstatic;

public interface One {

  public default void m1(){
    System.out.println("Default m1 from One");
  }

  static void m2(){
    System.out.println("Static m1 2rom One");
  }
}
