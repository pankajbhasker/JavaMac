package com.google.bhasker;

import com.google.bhasker.model.Student;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiMapMergeUsingStream {
  public static void main(String args[]){
    Map<String,String>  map1 = new HashMap<>();
    map1.put("shammi", "Computer");
    map1.put("Chandresh", "Hindi");
    map1.put("Pankaj", "Marathi");
    //map1 = {"shammi" : "Computer", "Chandresh" : "Hindi", "Pankaj" :  "Marathi"}


    Map<String,String>  map2 = new HashMap<>();
    map2.put("shammi", "English");
    map2.put("Chandresh", "Hindi");
    map2.put("Pankaj", "English");
    //map1 = {"shammi" : "English", "Chandresh" : "Hindi", "Pankaj" : "English"}


    /** output should be
     *
     * {Chandresh=[Hindi], shammi=[Computer, English], Pankaj=[Marathi, English]}
     *
     */
    map2.forEach((key, value) ->
        map1.merge(key, value,(v1, v2) -> String.valueOf(
            Stream.<String>builder().add(v1).add(v2).build().collect(
                Collectors.toSet()))));
    System.out.println("Result  : " +map1);

  }

}
