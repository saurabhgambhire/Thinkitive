package com.thinkitive.datastructure.Array;

public class ZeroOnecs {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 1, 1};

        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            if (arr[st] == 0 && arr[end] == 1) {
                st++;
                end--;
            } else if (arr[st] == 1 && arr[end] == 0) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }else if (arr[st] == 0 && arr[end] == 0){
                st++;
            } else if (arr[st] == 1 && arr[end] == 1) {
                end--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
