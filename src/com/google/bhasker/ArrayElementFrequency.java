package com.google.bhasker;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementFrequency {

  public static void main(String args[]){
        int numArr[] = {10,10,220,20,20, 30,30, 10, 40, 20};
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : numArr){
          System.out.println(num);
          if(map.containsKey(num)){
            map.put(num, map.get(num)+1);
          }else{
            map.put(num, 1);
          }
        }
    System.out.println("Frequency of elements : ");
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
          System.out.println("Key : "+ entry.getKey() + " | Frequency : " +entry.getValue() );
        }


  }

}
