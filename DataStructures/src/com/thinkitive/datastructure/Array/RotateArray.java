package com.thinkitive.datastructure.Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int st = 0;
        int end = arr.length-1;
        int k = 2;

        swap(arr, 0, arr.length - 1);

        // Reverse the first k elements
        swap(arr, 0, k - 1);

        // Reverse the remaining elements
        swap(arr, k, arr.length - 1);

        for (int i : arr) {
            System.out.print(i);
        }
    }

    private static void swap(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}
