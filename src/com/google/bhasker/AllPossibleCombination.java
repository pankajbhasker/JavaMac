package com.google.bhasker;

public class AllPossibleCombination {


  public void getAllPosibleCombination() {
    int count = 0;
   // int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int arr[] = {0, 1, 2, 3};
    int noOfDigit = 4;
    for (int a = 0; a < noOfDigit; a++) {
      for (int b = 0; b < noOfDigit; b++) {
        for (int c = 0; c < noOfDigit; c++) {
          for (int d = 0; d < noOfDigit; d++) {
            if (a != b && b != c && c != d && d != a) {
              count++;
              System.out.println(arr[a] + "" + arr[b] + "" + arr[c] + "" + arr[d] +" count : " + count);
            }
          }
        }
      }

    }

  }
  public void getAllPosibleCombinationOfTwoDigit() {
    int count = 0;
    // int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int arr[] = {0, 1,2};
    int noOfDigit = 3;

        for (int a = 0; a < noOfDigit; a++) {
          for (int b = 0; b < noOfDigit; b++) {
            if (a != b && b != a) {
              count++;
              System.out.println(arr[a] + "" + arr[b] +" count : " + count);
            }
          }
        }

    }

  public void getAllPosibleCombinationOfDigits(int noOfDigit, int arr[]) {
    int count = 0;
    // int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};



    for (int a = 0; a < noOfDigit; a++) {
      for (int b = 0; b < noOfDigit; b++) {
        if (a != b && b != a) {
          count++;
          System.out.println(arr[a] + "" + arr[b] +" count : " + count);
        }
      }
    }

  }
  }

