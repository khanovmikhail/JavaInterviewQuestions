package com.github.khanovmikhail;

public class Increment {
    public static void main(String[] args) {
        int i = 5;
        i = ++i + ++i;
        System.out.println(i);
    }
}
