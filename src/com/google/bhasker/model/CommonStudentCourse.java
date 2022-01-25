package com.google.bhasker.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommonStudentCourse {

  public static String[] flatten(String[][] data) {
    List<String> list = new ArrayList<String>();
    Map<String, List<String>> map = new HashMap<>();

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        String name = data[i][0];
        String subject = data[j][1];
        list.add(name + " : " + subject);
      }
    }
    String[] strArr = new String[list.size()];
    for (int i = 0; i < list.size(); i++) {
      strArr[i] = list.get(i);
      System.out.println(strArr[i]);
    }
    return strArr;
  }

  public static Map<String, List<String>> getCommonCourse(String[][] data) {
/**
 for (int i = 0; i < data.length; i++) {
 for (int j = 0; j < data[i].length; j++) {
 System.out.println(
 "Course Id arr[" + i + "][" + 0 + "] = " + data[i][0] + " And Course Name arr["
 + i + "][" + 1 + "] = " + data[i][1]);
 }}
 */
    Map<String, List<String>> map = new HashMap<>();

    List<String> list = new ArrayList<>();
    for (String[] m : data) {
      list.add(m[0] + " : " + m[1]);
    }
    for (String s : list) {
      String[] str = s.split(" : ");
      if (!map.containsKey(str[0])) {
        List<String> set = new ArrayList<>();
        set.add(str[1]);
        map.put(str[0], set);
      } else {
        List<String> setN = new ArrayList<>(map.get(str[0]));
        setN.add(str[1]);
        map.put(str[0], setN);
      }
    }
    System.out.println(map);
    List<String> common = new ArrayList<>();
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      List<String> listC = entry.getValue();
      for (String st : entry.getValue()) {
        if (listC.contains(st)) {
          common.add(entry.getKey());
        }
      }
    }
    for (List<String> entry : map.values()) {

    }
    System.out.println(common);
    return map;
  }

  public static Map<String, Set<String>> getCommonCoursePair(String[][] data) {
    Map<String, Set<String>> map = new HashMap<>();
    return map;
  }

  public static void main(String args[]) {

    String[][] studentCoursePairs1 = {
        {"58", "Linear Algebra"},
        {"94", "Art History"},
        {"94", "Operating Systems"},
        {"17", "Software Design"},
        {"58", "Mechanics"},
        {"58", "Economics"},
        {"17", "Linear Algebra"},
        {"17", "Political Science"},
        {"94", "Economics"},
        {"25", "Economics"},
        {"58", "Software Design"}};

    String[][] studentCoursePairs3 = {
        {"94", "Art History"},
        {"94", "Operating Systems"},
        {"17", "Software Design"},
        {"58", "Mechanics"},
        {"17", "Linear Algebra"},
        {"25", "Economics"},
        {"58", "Software Design"}};

    getCommonCourse(studentCoursePairs3);

  }

  public static Map<String[], List<String>> coursePair(String coursePairs[][]) {
    Map<String, List> map = new HashMap<>();
    List<String> courseNameList = new ArrayList<>();
    for (int j = 0; j < coursePairs.length; j++) {
      String courseNum = coursePairs[j][0];
      String courseName = coursePairs[j][1];
      if (!map.containsKey(courseNum)) {
        map.put(courseNum, new ArrayList<>());
      }
      map.get(courseNum).add(courseName);
    }
    Map<String[], List<String>> commonPairs = new HashMap<>();
    for (int i = 0; i < coursePairs.length; i++) {
      for (int j = i + 1; j < coursePairs.length; j++) {
        String courseNum1 = coursePairs[i][0];
        String courseNum2 = coursePairs[j][0];
        if (map.containsKey(courseNum1) && map.containsKey(courseNum2) && !courseNum1.equals(
            courseNum2)) {
          List<String> list1 = map.get(courseNum1);
          List<String> list2 = map.get(courseNum2);
          List<String> common = commonElements(list1, list2);
          String pair[] = new String[2];
          pair[0] = courseNum1;
          pair[1] = courseNum2;
          commonPairs.put(pair, common);
        }
      }
    }
    return commonPairs;
  }

  public static List<String> commonElements(List<String> list1, List<String> list2) {
    List<String> ans = new ArrayList<>();
    for (String st : list1) {
      if (list2.contains(st)) {
        ans.add(st);
      }
    }
    return ans;
  }

}
