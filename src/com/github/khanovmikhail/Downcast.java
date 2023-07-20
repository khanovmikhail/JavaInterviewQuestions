package com.github.khanovmikhail;

/**
 * @author Khanov Mikhail
 */
public class Downcast {
    public static void main(String[] args) {
        int a = 258;
        double d = 267.34;

        byte b = (byte) a;
        byte c = (byte) d;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
