package com.github.khanovmikhail;

public class IntToByte {
    public static void main(String[] args) {
        int a = 257;
        byte b = (byte) a;
        System.out.println(b);

        ++a;
        b = (byte) a;
        System.out.println(b);
    }
}
