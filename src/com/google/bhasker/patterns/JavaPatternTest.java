package com.google.bhasker.patterns;

public class JavaPatternTest {
  public static void main(String args[]){

    CommonUtilsSingleton obj = CommonUtilsSingleton.getCommonUtilsInstance();
    obj.someMethod();
    try {
      CommonUtilsSingleton obj1 =  obj.clone();
      obj1.someMethod();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

  }

}
