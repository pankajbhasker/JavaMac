package com.google.bhasker.jstreams;

@FunctionalInterface
public interface AddNumber {

  public int add(int a, int b);
  //void letsGo();      //invalid because another abstract method does not allow
  public String toString();    // valid because toString from Object
  public boolean equals(Object o); //valid

  public static int sum(int a, int b)   // valid because method static
  {

    return a + b;
  }

  public default int sub(int a, int b)   //valid because method default
  {
    return a - b;
  }
}
