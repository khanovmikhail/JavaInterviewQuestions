package com.github.khanovmikhail;

public class Ints {
    public static void main(String[] args) {
        int a = 06;
        int b = 01;
        a = a + b;
        System.out.println(a);
        ++a;
        System.out.println(Integer.toOctalString(a));
        ++a;
        System.out.println(a);
        System.out.println(Integer.toOctalString(a));

        int c = 010;
        int d = 011;

        c = c + d;
        System.out.println(c);
        System.out.println(Integer.toOctalString(c));
    }
}
