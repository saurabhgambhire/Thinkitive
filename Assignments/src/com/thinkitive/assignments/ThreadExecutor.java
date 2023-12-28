package com.thinkitive.assignments;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExecutor {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        Runnable runnable = new GetPrimeNumbers(1, 100);
//        executorService.execute(runnable);
//
//        Runnable runnable1 = new GetPrimeNumbers(101, 200);
//        executorService.execute(runnable1);
//
//        Runnable runnable2 = new GetPrimeNumbers(201, 300);
//        executorService.execute(runnable2);
//        System.out.println();
//        Runnable runnable3 = new GetPrimeNumbers(301, 400);
//        executorService.execute(runnable3);
//        Runnable runnable4 = new GetPrimeNumbers(401, 500);
//        executorService.execute(runnable4);
//        Runnable runnable5 = new GetPrimeNumbers(501, 600);
//        executorService.execute(runnable5);
//        Runnable runnable6 = new GetPrimeNumbers(601, 700);
//        executorService.execute(runnable6);
//        Runnable runnable7 = new GetPrimeNumbers(701, 800);
//        executorService.execute(runnable7);
//        Runnable runnable8 = new GetPrimeNumbers(801, 900);
//        executorService.execute(runnable8);
//        Runnable runnable9 = new GetPrimeNumbers(901, 1000);
//        executorService.execute(runnable9);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        AtomicInteger totalSum = new AtomicInteger(0);

        for (int i = 1; i <= 10; i++) {
            int start = (i - 1) * 100 + 1;
            int end = i * 100;
            Runnable runnable = new GetPrimeNumbers(start, end, totalSum);
            executorService.execute(runnable);
        }

        executorService.shutdown();

        System.out.println("Total sum of all prime numbers: " + totalSum.get());
    }
}
