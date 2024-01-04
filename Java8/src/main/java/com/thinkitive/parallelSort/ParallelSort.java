package com.thinkitive.parallelSort;

import java.util.Arrays;

public class ParallelSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 98, 06, 54, -34, 54, 84};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.parallelSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        Arrays.parallelSort(arr, 3, 5);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
