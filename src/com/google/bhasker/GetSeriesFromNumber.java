package com.google.bhasker;

public class GetSeriesFromNumber {

  public void getTwoSidePrintSeries(int num) {
    int number = 0;
    int number1 = 1;
    StringBuilder sb = new StringBuilder();
    StringBuilder sb1 = new StringBuilder();
    for (int i = 1; i < 2; i++) {
      sb1.append(i+",");
    }
    for (int i = 5; i <= num; i++) {
      if (i % 2 == 0) {
        number1 = number1 + 3;
      } else {
        number1 =  number1 + 1;
      }
      sb1.append(number1+",");
    }
    System.out.println(sb1);
    System.out.println("-----------------------------------------------------------------");
    for (int i = 0; i <= num; i++) {
        if (i % 2 == 0) {
          number = number + 3;
        } else {
          number++;
        }
        sb.append(number+",");
      }
      System.out.print(sb);
  }
//1,2,5,6,9,10,13,14,17,18,
  public static void main(String args[]) {
    GetSeriesFromNumber obj = new GetSeriesFromNumber();
    obj.getTwoSidePrintSeries(100);
  }
}
