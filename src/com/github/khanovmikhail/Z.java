package com.github.khanovmikhail;

public class Z {
    public static void main(String[] args) {
        int z = 5;
        inc(z);
        System.out.println(z);
    }

    static void inc(int z){
        z+=5;
    }
}
