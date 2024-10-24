package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public abstract class arrayMap {
    public static int [][] generate(int lenX, int lenY, int min, int max){
        if(min > max){
            int buf = min;
            min = max;
            max = buf;
        }

        int [][] arr = new int [lenY][lenX];
        for (int y = 0; y < lenY; y++) {
            for(int x = 0; x < lenX; x++){
                arr[y][x] = ThreadLocalRandom.current().nextInt(min, max+1);
            }
        }
        return arr;
    }

    public static void countOnCondition(int [][] arr, int condNum){
        ArrayList condList = new ArrayList();
        ArrayList idxList = new ArrayList();
        int condCount = 0;
        for (int y = 0; y < arr.length; y++){
            for(int x = 0; x < arr[0].length; x++){
                int curNum = arr[y][x];
                if(cond1(curNum, y, x, condNum)){
                    condCount++;
                    condList.add(curNum);
                    idxList.add(x);
                    idxList.add(y);
                }
            }
        }
        printArrayList(condList);
        printArrayList(idxList);
        System.out.println("Count: " + condCount);
    }

    private static boolean cond1(int num, int idx1, int idx2, int condNum){
        if(num >= 0 && idx1+idx2>condNum)
            return true;
        return false;
    }

    public static void printArrayList(ArrayList list){
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void printArray(int [][] arr){
        System.out.println("Array: "+Arrays.deepToString(arr));
    }
}
