package com.google.bhasker.generic;
//Defining bounded type in combination also
public class BoundToNumberNRunnableGenDemo <T extends Number & Runnable>{

  public static void main(String args[]){
    BoundToNumberGenDemo<Integer> ob0 = new BoundToNumberGenDemo<>();
    BoundToNumberGenDemo<Integer> ob1 = new BoundToNumberGenDemo<Integer>();
    BoundToNumberGenDemo<Double> ob2 = new BoundToNumberGenDemo<Double>();

    BoundToRunnableGenDemo<Runnable> ob3 = new BoundToRunnableGenDemo<>();
    BoundToRunnableGenDemo<Runnable> ob4 = new BoundToRunnableGenDemo<Runnable>();
    BoundToRunnableGenDemo<Thread> ob5 = new BoundToRunnableGenDemo<Thread>();
    BoundToRunnableGenDemo<BoundTest> ob6 = new BoundToRunnableGenDemo<BoundTest>();
  }
}

// Some other bound example
/*
  The type parameter should be Class which should implement both Runnable and Comparable
  public class BoundToNumberNRunnableGenDemo <T extends Runnable & Comparable>{ }

  The type parameter should be Class which should extends Number ands its child and implement both Runnable and Comparable
  here Class Number should be first always because we have to take class first followed by interface
   public class BoundToNumberNRunnableGenDemo <T extends Number & Runnable & Comparable>{ }

public class  BoundTypeParameter <T> {} // Valid
public class  BoundTypeParameter <A,B> {} // Valid
public class  BoundTypeParameter <A,B,C> {} // Valid
Ex
HashMap<K,V>  map = new HashMap<K,V>(); // K  is key type and //  V is value type

We can have  any number of type parameter seperated by comma .

public class  BoundTypeParameter <X> or public class  BoundTypeParameter <A> or public class  BoundTypeParameter <durga> //  valid
Any valid identifier available in english lang we can use instead of T
using T as type parameter is just  convention we should follow innn java  for better readability
   public class BoundToNumberNRunnableGenDemo <T extends  Runnable & Comparable & Number>{ } //  Wrong
   public class BoundToNumberNRunnableGenDemo <T extends  Number & Thread>{ } //  Wrong because we cannot extends more than one class
 */
//
