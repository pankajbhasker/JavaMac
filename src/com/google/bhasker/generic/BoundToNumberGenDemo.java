package com.google.bhasker.generic;

// Bunded Types
//<T extends Numebr> bounds the type parameter to a particular range to number



/* this comment code is not applicable we can only bound using extends keyword

//Here we can pass either type of Runnable or its implementation class
public class BoundToRunnableGenDemo <T implements Runnable>{

}
//Here we can pass either type of Runnable or its implementation class
public class BoundToRunnableGenDemo <T super String>{

}

Syntex is
 class Test <T extends x> {} where x either class or interface
 if x is class then as type parameter we can pass either x type or its child classes

 if x is interface then as type parameter aw can pass either x type or its implementation classes
 */
public class BoundToNumberGenDemo<T extends Number> {

  private  T number1,  number2;
  public BoundToNumberGenDemo(){

  }
  public T add(T a, T b){
    return a;
  }

  public static void  main(String args[]){
    BoundToNumberGenDemo<Integer> ob0 = new BoundToNumberGenDemo<>();
    BoundToNumberGenDemo<Integer> ob1 = new BoundToNumberGenDemo<Integer>();
    BoundToNumberGenDemo<Double> ob2 = new BoundToNumberGenDemo<Double>();
  //  BoundToNumberGenDemo<String> ob2 = new BoundToNumberGenDemo<String>(); give exception
  }
}
