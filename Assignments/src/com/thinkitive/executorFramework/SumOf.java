package com.thinkitive.executorFramework;

import java.util.concurrent.Callable;

public class SumOf implements Callable<Integer> {
    int start;
    int end;

    SumOf(int start, int end) {
        this.start = start;
        this.end = end;
    }

    Integer sum = 0;


    @Override
    public Integer call() throws Exception {
        return getSum(start, end);
    }

    public Integer getSum(int start, int end) {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The Total Sum of " + start + " And " + end + " is :" + sum);
        return sum;
    }
}
