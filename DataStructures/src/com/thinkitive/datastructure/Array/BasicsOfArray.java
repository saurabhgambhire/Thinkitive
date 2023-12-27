package com.thinkitive.datastructure.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class BasicsOfArray {
    public static void main(String[] args) {
        //One Dimensional
        // two Dimensional
        // MultiDimensional
        int n = 10;  // size of the array
        int[] arr = new int[n];

//        arr[0] = 1;
//        arr[1] = 6;
//        arr[2] = 59;
//        arr[3] = 96;
//        arr[4] = 45;
//        arr[5] = 43;
//        arr[6] = 39;
//        arr[7] = 44;
//        arr[8] = 223;
//        arr[9] = 23;
//        System.out.println(arr[5]);

//        for (int i = 0; i < 10; i++) {
//            arr[i] = 10 -i;
//        }
//
//        for (int item : arr) {
//            System.out.println(item);
//        }
//
//        OptionalDouble first = Arrays.stream(arr).average();
//        System.out.println(Arrays.stream(arr).sum());
//        System.out.println(first.getAsDouble());

//        HashSet<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < 10; i++) {
//            set.add(i);
//        }
//
//        System.out.println(set);
//
//
//        for (int i = 0; i < 10; i++) {
//            minimum(set);
//        }

//        int[][] arr1 = new int[3][3];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr1[i][j] = i*j;
//            }
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j]);
//            }
//            System.out.println();
//        }


    }

    private static void minimum(HashSet<Integer> set) {

        int min = Integer.MIN_VALUE;
        for (Integer i : set) {
            if (min < i)
                min = i;
        }
        System.out.println(min);
        set.remove(min);
    }
}
