package com.google.bhasker;

import java.util.HashMap;
import java.util.Map;

public class HashMapDebug {
public static void main(String args[]) {
  Map<String, Integer> map =  new HashMap<>();
  map.put("aa", 1);
  map.put("bb", 2);
  map.put("cc",3);
  map.put("FB",4);
  map.put("Ea",5);
  map.put(null,6);
  map.put(null,7);

  System.out.println(map);



}
}
