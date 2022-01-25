package com.google.bhasker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream API allowing us to bulk process with the data source or group of data in convenient and
 * fast way, Using streams we achieve functional programming style operations
 *
 * We can understand Stream API as methodology which takes Raw data of collection as input and
 * process it using streaming or filtering to generated the desired data.
 */

public class StreamAPIBasic {

  public static void main(String args[]) {

    List<String> listOfPlayList = new ArrayList<String>();
    listOfPlayList.add("Budgie");
    listOfPlayList.add("Bhakti Song");
    listOfPlayList.add("India New");
    listOfPlayList.add("Pop Songs ");
    listOfPlayList.add("Ticktok Video");
    listOfPlayList.add("Food Mania");
    listOfPlayList.add("Dance Mania");
    listOfPlayList.add("Learn Mania");
    listOfPlayList.add("Photo Mania");
    listOfPlayList.add("Ram");
    listOfPlayList.add("Kanha");
    listOfPlayList.add("Kanha");



    List<Integer> listOfDob = new ArrayList<>();
    listOfDob.add(1985);
    listOfDob.add(1991);
    listOfDob.add(1987);
    listOfDob.add(1986);
    listOfDob.add(1989);
    listOfDob.add(1988);
    listOfDob.add(1993);
    listOfDob.add(1992);

    System.out.println("listOf dob : " +listOfDob);

    Stream<Integer> streamOfInteger = Stream.of(1,2,3,4,5,6,7,8,9);
    System.out.println("Created integer  stream  : " +streamOfInteger);
    System.out.println("Printing integer  stream  values: ");
    streamOfInteger.forEach(p -> System.out.println(p));

    Stream<String> streamOfString = Stream.of("A", "B", "C");
    System.out.println("Printing integer  stream  values: ");
    streamOfString.forEach(p -> System.out.println(p));

    // Passing Array to stream's  factory method "of"
    Stream<Integer> streamOfIntArray = Stream.of(new Integer[] {1,2,3,4,5,9});
    System.out.println("Printing integer array  stream  values: ");
    streamOfIntArray.forEach(p -> System.out.println(p));

    Stream<String> streamOfStringArray = Stream.of(new String[] {"A", "B", "C", "D"});
    List<String> filterString = streamOfStringArray
        .filter(p -> !p.equals("A"))
        .collect(Collectors.toList());
    System.out.println("Printing filter string array  stream  values: " + filterString);

    // Getting list of even dob
    List<Integer> listOfEvenDob= listOfDob.stream().filter(p -> p%2 ==0).collect(Collectors.toList());
    System.out.println("Printing list of even dob ");
    listOfEvenDob.forEach(p -> System.out.println(p));

    // Getting list of odd dob
    List<Integer> listOfOddDob= listOfDob.stream().filter(p -> p%2 !=0).collect(Collectors.toList());
    System.out.println("Printing list of odd dob ");
    listOfOddDob.forEach(p -> System.out.println(p));

    // Increasing dob by 1 year
    List<Integer> listOfIncreasedDob= listOfDob.stream().map(m -> m+1).collect(Collectors.toList());
    System.out.println("Printing list of increase dob ");
    listOfIncreasedDob.forEach(p -> System.out.println(p));

    List<String> playlistWithSize = listOfPlayList.stream().filter(l -> l.length() > 5)
        .collect(Collectors.toList());
    //System.out.println("playlistWithSize : " +playlistWithSize);


    List<String> playlistWithText = listOfPlayList.stream().map(t -> t + " ram")
        .collect(Collectors.toList());
    //System.out.println("playlistWithText : " +playlistWithText);

    Set<String> playlistSetWithText = listOfPlayList.stream().map(t -> t.toUpperCase())
        .collect(Collectors.toSet());
    //System.out.println("playlistSetWithText : " +playlistSetWithText);

    List<Map> list = new ArrayList<Map>();
    Map<String, String> map1 = new HashMap<>();
    map1.put("shammi", "Computer");
    map1.put("Chandresh", "Hindi");
    map1.put("Pankaj", "Marathi");
    //map1 = {"shammi" : "Computer", "Chandresh" : "Hindi", "Pankaj" :  "Marathi"}

    list.add(map1);

    Map<String, String> map2 = new HashMap<>();
    map2.put("shammi", "English");
    map2.put("Chandresh", "Hindi");
    map2.put("Pankaj", "English");
    //map1 = {"shammi" : "English", "Chandresh" : "Hindi", "Pankaj" : "English"}
    list.add(map2);

    //outputMap : {shammi : [Computer, English], pankaj : [Marathi, English], chandresh : Hindi}

    Map<String, List<String>> mapOutput = new HashMap<String, List<String>>();

    /**List a = map1.entrySet().stream().map(e -> e.getKey() + " : " + e.getValue()).collect(Collectors.toList());
     List b = map2.entrySet().stream().map(e -> e.getKey() + " : " + e.getValue()).collect(Collectors.toList());
     System.out.println(" a: "+a);
     System.out.println(" b: "+b);
     */
    Stream mergedMap = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream());
    //System.out.println("map1: "+ map1);
    //System.out.println("map2: "+ map2);
    //System.out.println("map3: "+ mergedMap.collect(Collectors.toList()));

    map2.forEach((key, value) ->
        map1.merge(key, value,
            (v1, v2) -> String.valueOf(Stream.<String>builder().add(v1).add(v2).build().collect(
                Collectors.toList()))));
    //  map1.merge(key,value,(v1, v2) -> Stream.of(v1).collect(Collectors.toList()) +" : "+ Stream.of(v2).collect(Collectors.toList()) ));

    // map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> ));
    // map1.forEach((key, value) -> System.out.println(key +" : " +value));
    // Merge second map with first map
    /**map2.forEach((key, value) ->
     map1.merge(key,
     value,
     (v1, v2) -> Stream.concat(Stream.of(v1) , ":"+Stream.of(v2)).collect(Collectors.toList())));

     map2.forEach((key, value) ->
     map1.merge(key,value,(v1, v2) ->  Stream.of(v1).collect(Collectors.toList()) +""+ Stream.of(v2).collect(Collectors.toList())));
     */
    //  map1.merge(key,value,(v1, v2) -> Stream.of(v1).collect(Collectors.toList()) +" : " +Stream.of(v2).collect(Collectors.toList())));

    //map2.forEach((key, value) ->
    //   map1.merge(key,value,(v1, v2) -> v1 == v2 ? v1 : v1 +":"+v2));
    //  map1.merge(key, value, (v1, v2) -> v1 + ":"+ v2) );

// Print new map
    System.out.println(map1);

    // {shammi = [Computer, english], pankaj =[Marathi,english], Chandresh = [Hindi]}

  }

  // Generic method to add elements of a stream to an existing list
  public static <T> void addToList(List<T> target, Stream<T> source) {
    source.forEachOrdered(target::add);
  }

}
