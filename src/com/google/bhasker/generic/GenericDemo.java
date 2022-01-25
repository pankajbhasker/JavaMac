package com.google.bhasker.generic;

public class GenericDemo<T> {

  private T typeObject;

  public GenericDemo(T typeObject) {
    this.typeObject = typeObject;
  }

  public void showTypeObject() {
    System.out.println("GenericDemoTest Type of : "+ typeObject.getClass().getName());
  }

  public T getTypeObject(){
    return typeObject;
  }
}
