package com.github.khanovmikhail;

/**
 * What output will be?
 * A. true true false
 * B. false false true
 */
public class AndAndAnd {
    public static void main(String[] args) {
        if(coll() && call())
            System.out.print("TRUE");
        if(coll() & call())
            System.out.print("TRUE");
    }

    static boolean call(){
        System.out.print("true ");
        return true;
    }

    static boolean coll(){
        System.out.print("false ");
        return false;
    }
}
