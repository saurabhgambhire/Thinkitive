package com.thinkitive.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",", "{", "}");
        stringJoiner.add("saurabh");
        stringJoiner.add("gambhire");
        stringJoiner.add("Aniket");
        stringJoiner.add("Tushar");
        System.out.println(stringJoiner);
    }
}
