package com.google.bhasker;

// An interface having only one abstract method or unimplemented method is called functional interface.
// No matter it contains any number of default and static method
// Its not mandatory to put @FunctionalInterface annotation, By adding annotation we just insure that new developer
// will know that its functional interface  and it may be used as lamda expression and
// if he add  any extra abstract method it become non functional interface and he will take extra care to handle it.


@FunctionalInterface
public interface MyFunctionalInterface {

  public void createFunctionalInterface();

  public default void createDefaultCustomFunctionInterface() {

  }
  public static void createStaticCustomFunctionInterface() {

  }

}
