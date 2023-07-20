package com.github.khanovmikhail.experimental;

import java.util.Objects;

public class NullHashCode {
    public static void main(String[] args) {
        System.out.println(Objects.hash(null));
        //new Object();
    }
}
