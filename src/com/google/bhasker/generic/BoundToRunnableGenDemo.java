package com.google.bhasker.generic;

public class BoundToRunnableGenDemo <T extends Runnable>{

  public static void main(String args[]){
    BoundToRunnableGenDemo<Runnable> ob0 = new BoundToRunnableGenDemo<>();
    BoundToRunnableGenDemo<Runnable> ob1 = new BoundToRunnableGenDemo<Runnable>();
    BoundToRunnableGenDemo<Thread> ob2 = new BoundToRunnableGenDemo<Thread>();
    BoundToRunnableGenDemo<BoundTest> ob3 = new BoundToRunnableGenDemo<BoundTest>();
    // BoundToRunnableGenDemo<Integer> ob3 = new BoundToRunnableGenDemo<Integer>();
 // java: type argument java.lang.Integer is not within bounds of type-variable T
  }

}
