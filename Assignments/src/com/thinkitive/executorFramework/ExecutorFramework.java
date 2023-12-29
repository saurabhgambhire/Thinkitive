package com.thinkitive.executorFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFramework {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 1; i <= 1000; i += 100) {
            // object is created with parameterised constructor with start and end value
            SumOf sumOf = new SumOf(i, i + 100);

            // called submit of executorService which takes the object of collable object
            Future<Integer> submit = executorService.submit(sumOf);
            // store all the future call in Arraylist
            futures.add(submit);
        }

        Integer totalSum = 0;
        for (Future<Integer> future : futures) {
            Integer i = future.get();
            totalSum += i;
        }

        executorService.shutdown();

        System.out.println("Total sum : " + totalSum);


    }
}
