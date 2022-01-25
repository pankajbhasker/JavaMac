package com.google.bhasker;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOfFirstLastDigit
{
  private void getSumOfFirstAndLastDigit(int num) {
    System.out.println("Given num is : "+num);
    int firstDigit = 0;
    int lastDigit = 0;
    if(num == 0){
      System.out.println("Given num is Zero");
    }
    if(num < 10) {
      System.out.println("Given num, sum  is : " +num);
    } else {
      firstDigit = getFirstDigit(num);
      lastDigit = getLastDigit(num);
      int sum = firstDigit + lastDigit;
      System.out.println("First num : "+firstDigit+ ", last num : "+ lastDigit+" and Given num sum is : "+sum);
    }



  }

  private int getFirstDigit(int number) {
    while(number >= 10) {
      number = number /10;
    }
    return number;
  }

  private int getLastDigit(int number) {
    while(number >= 10) {
      number = number % 10;
    }
    return number;
  }

  public static void main (String[] args) throws java.lang.Exception
  {

    SumOfFirstLastDigit object = new SumOfFirstLastDigit();
    object.getSumOfFirstAndLastDigit(232323);
  }
}
