package com.google.bhasker;

public class CallingCustomLamda  { // no need to implement in case of Lamda implements MyFunctionalInterface{


  public static void main(String args[]) {
    MyFunctionalInterface obj = () -> { System.out.println("Calling Functional Interface");};
    obj.createFunctionalInterface();

    String input = "One Parameter Functional Interface ";
    IOneParamFunctionalInterface obj1 = (p) -> {System.out.println("Calling parameterized Functional Interface : "+ input); return input; };
    obj1.getInputString(input);
  }

  /*
  @Override
  public void createFunctionalInterface() {
    System.out.println("Calling Functional Interface");
  }

   */
}
