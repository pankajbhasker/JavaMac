package com.google.bhasker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCount {


  public static void main(String[] args) throws IOException {
    BufferedReader in = null;
    try {
      FileReader fileReader = new FileReader("src/com/google/bhasker/tempFile.txt");
      in = new BufferedReader(fileReader);
      //lets example to test for words:- for, else, is , are
      Map<String, Integer> m = countWords(in);
      System.out.println(m);
    } finally {
      in.close();
    }
  }

  static HashMap<String, Integer> countWords(BufferedReader br) throws IOException {

    String readLine = "";
    HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
    while ((readLine = br.readLine()) != null) { // loop goes on till the end of the file
      StringTokenizer st = new StringTokenizer(readLine, " ");
      int size = st.countTokens(); // gets total number of tokens of the line
      for (int i = 0; i < size; i++) {
        String word = st.nextToken();// gets the first word
        //if (word.equals("ram") || word.equals("for") || word.equals("else") || word.equals("is") || word.equals("are")) {
          if (wordsMap.containsKey(word)) {
            wordsMap.put(word, wordsMap.get(word) + 1);
          } else {
            wordsMap.put(word, 1);
          }
        //}
      }
    }
    return wordsMap;
  }

}
