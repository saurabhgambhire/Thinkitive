package com.thinkitive.assignments;

import java.util.concurrent.atomic.AtomicInteger;

public class GetPrimeNumbers implements Runnable {
    private int start;
    private int end;
    private Integer[] sum;

    GetPrimeNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public GetPrimeNumbers(int start, int end, Integer[] sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    @Override
    public void run() {
        int primeSum = calculatePrimeSum(start, end);
        sum[0] += primeSum;
        System.out.println("Sum of prime numbers from " + start + " to " + end + ": " + primeSum);
    }

    public int getSum() {
        return sum[0];
    }

    private int calculatePrimeSum(int start, int end) {
        int primeSum = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                primeSum += i;
            }
        }
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
