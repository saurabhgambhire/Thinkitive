package com.thinkitive.assignments;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {
    public static void main(String[] args) {
        long totalSum = 0l;
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Integer[] sum = {0};

        for (int i = 1; i <= 10; i++) {
            int start = (i - 1) * 100 + 1;
            int end = i * 100;

            GetPrimeNumbers getPrimeNumbers = new GetPrimeNumbers(start, end, sum);

            Runnable runnable = getPrimeNumbers;
            totalSum += getPrimeNumbers.getSum();
            executorService.execute(runnable);
        }

        executorService.shutdown();

        System.out.println("Total sum of all prime numbers: " + totalSum);
    }
}
