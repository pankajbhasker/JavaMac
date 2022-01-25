package com.google.bhasker.jstreams.defaultstatic;

import java.util.function.Consumer;

public class OneTwoPrint implements One, Two{

  public static void main(String args[]){
    OneTwoPrint obj =new OneTwoPrint();
    obj.m1();

    Consumer<Two> m2 = Two::m1;


  }

  @Override
  public void m1() {
    One.super.m1();
    Two.super.m1();
  }
}
