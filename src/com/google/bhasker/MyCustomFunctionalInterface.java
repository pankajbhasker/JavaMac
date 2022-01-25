package com.google.bhasker;

@FunctionalInterface
public interface MyCustomFunctionalInterface extends MyFunctionalInterface {

  // public void createFunctionalInterface(); even if we write method or not as both interface have same method compiler wont complaint.
  // public void newMethod(); // Creating extra method compiler will complain and interface become non FunctionalInterface


}
