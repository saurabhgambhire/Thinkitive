package com.thinkitive.assignments;

import java.util.concurrent.Callable;

public class GetPrimeNumbers implements Callable<Integer> {
    private int start;
    private int end;

    GetPrimeNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        return calculatePrimeSum(start, end);
    }

    private int calculatePrimeSum(int start, int end) {
        int primeSum = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                primeSum += i;
            }
        }
        System.out.println("The sum of " + start + " and " + end + "is " + primeSum);
        return primeSum;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
