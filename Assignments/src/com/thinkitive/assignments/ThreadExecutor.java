package com.thinkitive.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExecutor {
    public static void main(String[] args) {
        long totalSum = 0L;
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int start = (i - 1) * 100 + 1;
            int end = i * 100;

            Future<Integer> future = executorService.submit(new GetPrimeNumbers(start, end));
            futures.add(future);
        }
        for (Future<Integer> future : futures) {
            try {
                totalSum += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();

        System.out.println("Total sum of all prime numbers: " + totalSum);
    }
}
