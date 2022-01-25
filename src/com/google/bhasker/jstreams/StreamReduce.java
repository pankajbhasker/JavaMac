package com.google.bhasker.jstreams;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
 public static void main(String args[]){
    StreamReduce.streamReduce();
 }

  public static void streamReduce() {

    List<String> list = Arrays.asList("yogi","sharan","ashish","Balaji","aparna","Sharief");

    String result= list.stream().reduce((m,n) -> m+"-"+n).get();

    System.out.println("Reduce string:"+result);

    List<Integer> numlist = Arrays.asList(1,2,3,4,5);
    double aveResult= numlist.stream().reduce((m,n) -> (m+n)).get() / numlist.size();
    System.out.println("Average of given nu:"+aveResult);

  }

}
