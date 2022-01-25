package com.google.bhasker.jstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageIntDemo {

  public static  void main(String args[]){

    List<Integer> list = Arrays.asList(1,2,3,4,5);  // average is 1+2+3+4+5 / 5 = 3

    List<Integer> intList = new ArrayList<>();
    /* jvm check object(right sid) , compiler  checks ref (left side)
    generic is compile time at runtime there is no concept of generics
     */
    intList.add(1);

    System.out.print(getAverageOne(list));
    System.out.print(getAverageStream(list));

  }

  private static int getAverageOne(List<Integer> list){
    int sum = 0;
    for(int i=0;  i < list.size() ; i++){
      sum = list.get(i)+ sum;
    }
    int average = sum/list.size();
    //System.out.print(average);
    return average;
  }

  private static OptionalDouble getAverageStream(List<Integer> list){
    IntStream intStream = list.stream().mapToInt(Integer::intValue);
    OptionalDouble average = intStream.average();

    int avg = (int) list.stream().flatMapToInt(IntStream::of).average().getAsDouble();
    //System.out.print(average);
    return average;
  }

}
