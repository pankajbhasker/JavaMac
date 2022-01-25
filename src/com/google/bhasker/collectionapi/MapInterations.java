package com.google.bhasker.collectionapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MapInterations {

}
/*
  public static void main(String args[]) {

    Map<String, List<String>> grades = new HashMap<>();
    for (int row = 0; row < studentCoursePairs1.length; row++) {
      for (int col = 0; col < studentCoursePairs1[row].length; col++) {
        if (!grades.containsKey(studentCoursePairs1[row][0])) {
          List<String> list = new ArrayList<>();
          list.add(studentCoursePairs1[col][1]);
          grades.put(studentCoursePairs1[row][0], list);
        } else {
          List<String> strings1 = grades.get(studentCoursePairs1[row][0]);
          strings1.add(studentCoursePairs1[col][1]);//It fails when i try to add to the list
          grades.put(studentCoursePairs1[row][0], new ArrayList<>(strings1));
        }
      }
    }
    //System.out.println(grades);

    String[][] studentCoursePairs2 = {
        {"42", "Software Design"},
        {"0", "Advanced Mechanics"},
        {"9", "Art History"},
    };

    Map<String, String> arrMap = Arrays.stream(studentCoursePairs2).collect(
        Collectors.toMap(e -> e[0], e -> e[1]));
    List<String> str = new ArrayList<>();
    Map<String, String> m = Arrays.stream(studentCoursePairs2)
        .collect(Collectors.toMap(kv -> kv[0],
            kv -> kv[1],
            (oldV, newV) -> newV)
        );

    for (Entry<String, String> e : m.entrySet()) {
      // System.out.println(e.getKey() + " : " + e.getValue());
    }

    //flatten(studentCoursePairs1);
    // System.out.println(getCommonCourse(grades));

    Map<String[], List<String>> map = coursePair(studentCoursePairs3);
    Set<String> studentList = new HashSet<>();
    Set<String> studentCourse = new HashSet<>();
    List<String> listStr = new ArrayList<>();
    for (Map.Entry<String[], List<String>> commonPairs : map.entrySet()) {
      String[] strArr = commonPairs.getKey();
      List<String> list = commonPairs.getValue();
      for (String name : strArr) {
        studentList.add(name);
        //System.out.println(name);
      }
      for (String course : list) {
        studentCourse.add(course);
        //System.out.println(course);
      }
    }
    System.out.println(studentList);
    System.out.println(studentCourse);
  }
  */


