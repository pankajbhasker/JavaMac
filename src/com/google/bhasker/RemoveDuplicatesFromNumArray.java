package com.google.bhasker;

public class RemoveDuplicatesFromNumArray {

  public static void main(String args[]){
      int numArray[] = {1,2,4,69,72,12,14,4} ;
      getNumArrayWithoutDuplicate(numArray);

  }

  public static void getNumArrayWithoutDuplicate(int[] numArr) {
    // {1,2,4,69,72,12,14,4} ;
    System.out.println("Given number Array : " +numArr.length);
    for (int i = 0; i < numArr.length; i++) {
      System.out.println(numArr[i]);

    }
    // Sorting using Bubble sort
    System.out.println("Checking number Array");
    int temp = 0;
    for(int i = 0; i < numArr.length ; i++) {
      for(int j = 0; j < numArr.length; j++){
        System.out.println(numArr[i] + " > " +numArr[j] +" : "+(numArr[i] > numArr[j]));
        //System.out.println("index number Array : " + i + " value : "+ numArr[i]);
        if(numArr[i] > numArr[j]) {
          temp = numArr[j]; // 3
          numArr[j] = numArr[i]; // 2
          numArr[i] = temp;
        }
        if(numArr[i] == numArr[j]) {
          System.out.println("Duplicate element at index : "+i +" Value "+ numArr[i]);
        }
      }

    }

    System.out.println("Given number Array After sort");
    for (int i = 0; i < numArr.length; i++) {
      System.out.println(numArr[i]);
    }
  }

}
