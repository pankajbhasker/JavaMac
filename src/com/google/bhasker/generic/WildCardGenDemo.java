package com.google.bhasker.generic;

/*
method1(ArrayList<String> list) //  only  String type allowed
method1(ArrayList<?> list)  // Any type is allowed
method1(ArrayList<? extends X> list) //  only  X  and its child classes/interface are allowed
method1(ArrayList<? super X> list)  // only X and its super classes/ interface are allowed - super is allowed with method level but on class level with T its not allowed
in  this method we can either  X or super class if X is an interface then  we can pass either X or its implemetation   super class
ex Runnable interface  implementaion is Thread class and its super class is Object to we can pass object  class type only
within method we can add anything to list except null, because null is valid value for any type , within method we can add X type of object  and null
method1(ArrayList<?> list)  //  this type of method are best suitable for read only purpose

Generic concept is for compile time only at runtime there is no concept of generic.
 */
public class WildCardGenDemo {

}
