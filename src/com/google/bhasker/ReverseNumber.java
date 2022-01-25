package com.google.bhasker;

import java.io.InputStream;
import java.util.Scanner;

public class ReverseNumber {

  public static void main(String[] args) {
    ReverseNumber obj = new ReverseNumber();
    Scanner sc = new Scanner(System.in);
    int num =  sc.nextInt();
    System.out.println("Given number  : " + num);
    obj.getReverseNumber(num);
  }

  private void getReverseNumber(int number) {

    int reverse = 0;
    while (number != 0) {
      int reminder = number % 10;
      reverse = reverse*10 + reminder;
      number = number / 10;
    }
    System.out.println("Reverse number is : " + reverse);
  }

}
