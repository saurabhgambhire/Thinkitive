package com.thinkitive.datastructure.Array;

public class ZeroOnecs {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0,0, 1, 1, 1};
        segregateZerosOnes(arr);

    }

    public static void segregateZerosOnes(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            if (arr[st] == 0 && arr[end] == 1) {
                st++;
                end--;
            } else {
                if (arr[st] == 1) {
                    swap(arr, st, end);
                }
                st++;
                end--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
