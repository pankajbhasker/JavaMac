package com.google.bhasker;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int numArr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};

       // output : 0,3,5 | 1,3,4| 0,1,7 | 0,2,6 |


        getSumOfDigits(8, numArr);
	// write your code here
        // Sum and digit
    }
    public static void getSumOfDigits(int sum, int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap();
        int sumtemp =0;
        for(int i=0; i<arr.length ;i++){
            list.add(i); // 0,1,2
            sumtemp = sumtemp +i; //3
            System.out.println("value of i "+ i);
            System.out.println("value of list "+ list);
            if(list.size() > 3 || sumtemp == sum ){
                map.put("num"+i, sumtemp);
                System.out.println("value of map  line num 28 : "+ map);
            }
            else {
               // list.clear();
                list.add(i); // 3,4,5
                sumtemp = sumtemp +i;
                if(list.size()>3 && sumtemp == sum ){
                    if(!map.containsKey("num"+i)){
                        map.put("num"+i, sumtemp);
                        System.out.println("value of map  line num 37 : "+ map);
                    }
                }

            }
        }
        System.out.print("values  : " +map);

    }
}
