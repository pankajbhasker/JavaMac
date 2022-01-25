package com.google.bhasker.patterns;

import java.util.concurrent.SynchronousQueue;

public class CommonUtilsSingleton {

  private static CommonUtilsSingleton utils =  new CommonUtilsSingleton();
  private CommonUtilsSingleton(){}

  // Only one thread can execute this at a time
  public static synchronized CommonUtilsSingleton getCommonUtilsInstance(){
    if(utils== null){
      utils =  new CommonUtilsSingleton();
    }
    return utils;
  }

  public static CommonUtilsSingleton getInstance()
  {
    if (utils == null)
    {
      // To make thread safe
      synchronized (CommonUtilsSingleton.class)
      {
        // check again as multiple threads can reach above step
        if (utils==null)
          utils = new CommonUtilsSingleton();
      }
    }
    return utils;
  }
  public CommonUtilsSingleton clone() throws CloneNotSupportedException {
    // return INSTANCE
    throw new CloneNotSupportedException();
  }

  public void someMethod(){
    System.out.println("method called");
  }

}
