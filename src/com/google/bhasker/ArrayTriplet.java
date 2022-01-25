package com.google.bhasker;

public class ArrayTriplet {
  public static void main(String args[]){
    int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    getTriplet(8, arr, 3);


  }

  public static void getTriplet(int sumVal, int arr[], int numDigit){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("| "+i);
        }
  }
}
