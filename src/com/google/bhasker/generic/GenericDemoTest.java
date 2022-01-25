package com.google.bhasker.generic;

import com.google.bhasker.model.Employee;

public class GenericDemoTest{

  public GenericDemoTest() {
  }

  public static void main(String args[]){

    GenericDemo demo1 =  new GenericDemo("Pankaj");
    demo1.showTypeObject();
    System.out.println("Test Value : "+demo1.getTypeObject());

    GenericDemo demo2 =  new GenericDemo(123435);
    demo2.showTypeObject();
    System.out.println("Test Value : "+demo2.getTypeObject());

    GenericDemo demo3 =  new GenericDemo(34.98);
    demo3.showTypeObject();
    System.out.println("Test Value : "+demo3.getTypeObject());

    //  Passing custom object
    GenericDemo demo4 =  new GenericDemo(new Employee(1, "Ram",450, 600000.0f, "Manager"));
    demo4.showTypeObject();
    System.out.println("Test Value : "+demo4.getTypeObject());


  }

}
