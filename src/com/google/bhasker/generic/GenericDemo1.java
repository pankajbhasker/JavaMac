package com.google.bhasker.generic;

public class GenericDemo1 {
  public static void main(String args[])
  {
    System.out.println("max value is.." + max(1,2));
  }
  public static <T> T max(T x, T y) {
   // return x > y ? x : y;  //   T is object x.equals(y) should be used else compile time error
    return x.equals(y) ? x : y;
  }
}
