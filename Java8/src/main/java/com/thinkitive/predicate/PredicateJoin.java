package com.thinkitive.predicate;

import java.util.function.Predicate;

public class PredicateJoin {
    public static void main(String[] args) {
        int[] arr = {12, 1, 2, 34, 35, 3, 2, 45, 56, 4};
        Predicate<Integer> p1 = p -> p % 2 == 0;
        Predicate<Integer> p2 = c -> c > 18;
        for (int i : arr) {
            if (p1.and(p2).test(i))
                System.out.println(i);
        }
    }
}
