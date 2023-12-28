package com.thinkitive.assignments;

import java.util.concurrent.atomic.AtomicInteger;

public class GetPrimeNumbers implements Runnable {
//    int start;
//    int end;
//
//    GetPrimeNumbers(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }
//
//    @Override
//    public void run() {
//        printPrimeNumbers(start, end);
//        System.out.println();
//    }
//
//    private void printPrimeNumbers(int start, int end) {
//        for (int i = start; i < end; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
//    private boolean isPrime(int num) {
//        for (int j = 2; j < num; j++) {
//            if (num % j == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    private int start;
    private int end;
    private AtomicInteger sum;

    GetPrimeNumbers(int start, int end, AtomicInteger sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    @Override
    public void run() {
        int primeSum = calculatePrimeSum(start, end);
        sum.addAndGet(primeSum);
        System.out.println("Sum of prime numbers from " + start + " to " + end + ": " + primeSum);
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
