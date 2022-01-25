package com.google.bhasker.jstreams;

import java.util.HashMap;
import java.util.Map;

public class MapIterateLamdaStream {

  public static void main(String args[]){
    Map<String, String> map = new HashMap<>();
    map.put(null, "One");
    map.put(null,"Two");
    map.put(null, "Three");
    map.put(null, null);
    map.put(null, "Ram");
    map.put("Ram", null);
    map.put(null, null);
    map.put("Sohan", "Ram");
    map.put("Ram", "Ram");

    iterateUsingLamda(map);
    iterateUsingStream(map);
  }

  private static void iterateUsingLamda(Map<String,String> map) {
    /*
     Iterate without using Lambda
		   for (Map.Entry<String, Integer> entry : prices.entrySet()) {
		   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
		   }
		*/
    System.out.println("Traversal using Lamda ");
    map.forEach((k,v)->System.out.println("Key : " + k + ", Value  : " + v));
  }

  private static void iterateUsingStream(Map<String,String> map) {
    System.out.println("Traversal using Stream ");
    map.entrySet().stream().forEach((entry) -> System.out.println("Key : " + entry.getKey() + " Value : "+  entry.getValue()) );
  }
}
