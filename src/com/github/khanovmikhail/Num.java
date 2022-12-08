package com.github.khanovmikhail;

import java.io.IOException;

public class Num {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 100; i++) {
            num = num++;
        }
        System.out.println(num);
    }
}
