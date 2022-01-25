package com.google.bhasker;

import java.util.function.Predicate;

public class Main {

  public static String stripSuffix(String str, String suffix) {
    return str.contains(suffix) ? str.substring(0, str.length()) : null;
  }

  public static String firstFromSplit(String source, String delimiter) {
    int i = source.indexOf(delimiter);
    return i == -1 ? source : source.substring(0, i);
  }

  public static String getFloorId(String roomId) {
    if (roomId != null && roomId.contains("~")) {
      int i = roomId.indexOf("~");
      return i == -1 ? roomId : roomId.substring(0, i);
    } else {
      return null;
    }
  }

  private static String getAllocationBlock(String roomId) {
    if (roomId != null) {
      if (roomId.contains("~")) {
        String allocationBlock = roomId.substring(roomId.lastIndexOf('~') + 1);
        return allocationBlock;
      } else {
        return null;
      }
    } else {
      return null;
    }
  }

  private static int getManipulatedString(String str) {
    if (str == null) {
      return 0;
    }
    String[] arr = str.split("\n");
    int sum = 0;
    float floatNumSum = 0;
    for (String num : arr) {
      try {
        sum = sum + Integer.parseInt(num);
      } catch (NumberFormatException e) {
        try {
          floatNumSum = floatNumSum + Float.parseFloat(num);
        } catch (NumberFormatException e1) {
          System.out.println("String is not a Float : " + e1);
        }
      }
    }
      sum = (int) (sum+ floatNumSum);
    System.out.println("String Sum : " +sum);
    return sum;
  }

  public static void main(String args[]) {
    String strJun = "2019.5\n"
        + "3960\n"
        + "2540\n"
        + "2656\n"
        + "2401\n"
        + "616.95\n"
        + "2728.2\n"
        + "4205\n"
        + "796.25\n"
        + "3931.25\n"
        + "9187.5\n"
        + "1340\n"
        + "1974\n";
    String strJul = "6758\n"
        + "1321.65\n"
        + "777\n"
        + "3150\n"
        + "3036\n"
        + "1812\n"
        + "4656\n"
        + "1044\n"
        + "3810.8\n"
        + "400.5\n";
String strAug ="736.75\n"
    + "3258\n"
    + "3315\n"
    + "421\n"
    + "472\n"
    + "541.1\n"
    + "1798.2\n"
    + "1260\n";
String strApr ="8804\n"
    + "4639.25\n"
    + "5106\n"
    + "4642.5\n"
    + "6600\n"
    + "7160\n"
    + "4360\n";
String str = "10140\n"
    + "4131\n"
    + "7571.2\n"
    + "2685\n"
    + "3698.1\n"
    + "4750\n"
    + "2768\n"
    + "1143.1\n"
    + "5470.5\n"
    + "4260\n"
    + "5040\n";
    getManipulatedString(str);

  }

  public static void main1(String[] args) {
    int[] numArr = {2,4, 6,7,0, 1};
    ArrayProblem  objArrProblem = new ArrayProblem();

    objArrProblem.getArrayIndices(5, numArr);

    String fromLocation = "CH-ZRH-BRA-5~Knowledge Engine-3P";
    String ToLocation = "US-MTV-45-1~Turquoise";
    String building = "US-MTV-45-1-CGW";
    String floor[] = building.split("-");
    AllPossibleCombination obj = new AllPossibleCombination();
    //obj.getAllPosibleCombination();
    //obj.getAllPosibleCombinationOfTwoDigit();
    /** System.out.println(" FromFloor   : " + getFloorId(fromLocation));
     System.out.println(" From Allocation : " + getAllocationBlock(fromLocation));
     System.out.println("To Floor   : " + getFloorId(ToLocation));
     System.out.println("To Allocation : " + getAllocationBlock(ToLocation)); */
    // write your code here

  }
}
