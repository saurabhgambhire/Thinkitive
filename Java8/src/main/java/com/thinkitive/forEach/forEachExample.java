package com.thinkitive.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("saurabh", "gambhire", "tushar", "aniket", "ravindra");
        ArrayList<String> strings = new ArrayList<>(list);
        strings.forEach(string -> System.out.println(string.toUpperCase()));
    }
}
