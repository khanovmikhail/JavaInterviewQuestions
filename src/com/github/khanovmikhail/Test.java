package com.khanovmikhail;

public class Test {
    public static void main(String[] args) {
        test:
        if(true){
            for (int i = 0; i < 100; i++) {
                System.out.println("i = " + i);
                if(i == 5){
                    break test;
                }
            }
            System.out.println("Inside if after for loop");
        }
    }
}
