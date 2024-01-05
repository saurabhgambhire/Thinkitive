package com.thinkitive.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (integer -> integer % 2 == 0);
        System.out.println(predicate.test(48));

        String[] arr = {"saurabh", "gambhire", "ravindra"};
        Predicate<String> predicate1 = (s -> s.length() > 7);
        for (String s : arr) {
            if (predicate1.test(s))
                System.out.println(s);
        }

    }
}
