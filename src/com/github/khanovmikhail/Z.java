package com.github.khanovmikhail;

public class Z {
    public static void main(String[] args) {
        //int z = 5;
        Integer z = 5;
        inc(z);
        System.out.println(z); //What output will be?
    }

    static void inc(int z){
        z+=5;
    }
    static void inc(Integer z){
        z+=5;
    }
}
