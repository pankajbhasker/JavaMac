package com.google.bhasker;

public class ArrayProblem {


  String getArrayIndices(int target, int[] numArr) {
    String indices = "";
    for(int i = 0; i<= numArr.length; i++){

      if(numArr[i] + numArr[i++] == target){
        System.out.println("FirstElement : " + numArr[i] +" at position  :" +i);
        System.out.println("FirstElement : " + numArr[i++] +" at position  :" +i++);
        indices = numArr[i] + " : " + numArr[i++];
      }

    }
    return indices;
  }

}
