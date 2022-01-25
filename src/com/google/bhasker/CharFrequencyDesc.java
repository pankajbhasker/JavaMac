package com.google.bhasker;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharFrequencyDesc {


  public static void main(String[] args) {
    CharFrequencyDesc obj = new CharFrequencyDesc();
    obj.getCharFrequencyInDesc();
  }

  public void getCharFrequencyInDesc() {
    TreeMap<Character, Integer> hm = new TreeMap(Collections.reverseOrder());
    Scanner scanner = new Scanner(System.in);
    String in = scanner.nextLine();
    System.out.println("Input String: " + in);
    char[] charArray = in.toCharArray();
    Arrays.sort(charArray);
    String reverseOrderStr = new StringBuilder(new String(charArray)).reverse().toString();
    System.out.println("Sorted String: " + reverseOrderStr);
    int count = 0;
    for (char c : reverseOrderStr.toCharArray()) {
      if (hm.containsKey(c)) {
        count = hm.get(c);
        ++count;
      } else {
        ++count;
      }
      hm.put(c, count);
      count = 0;
    }
    StringBuilder sb = new StringBuilder();
    for (Character key : hm.keySet()) {
      sb.append(key + "" + hm.get(key));
    }
    System.out.println(sb);
  }

  public void findCharOccurences() {
    Scanner scanner = new Scanner(System.in);
    String in = scanner.nextLine();
    HashMap<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < in.length(); i++) {
      char ch = in.charAt(i);
      hm.put(ch, hm.getOrDefault(ch, 0) + 1);
    }
    TreeMap<Integer, Character> tm = new TreeMap<>(Collections.reverseOrder());
    for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
      tm.put(entry.getValue(), entry.getKey());
    }
    StringBuilder sb = new StringBuilder();
    for (Integer key : tm.keySet()) {
      sb.append(tm.get(key) + "" + key);
    }
    System.out.println(sb);
  }
}
