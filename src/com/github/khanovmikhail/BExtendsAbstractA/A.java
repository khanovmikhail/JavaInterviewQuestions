package com.github.khanovmikhail.BExtendsAbstractA;

import java.util.ArrayList;
import java.util.List;

public abstract class A {
    static{
        System.out.println("Father static");
    }
    int a = 8;
    int b =15;
    public A(){
        show();
    }
    abstract void show();
}

class B extends A {
    static int x = 101;
    static {
        x=102;
    }
    int a = 90;
    Object C = new Object();
    List<?> list = new ArrayList<>();
    {
        a = 80;
    }
     B(){a=85;}

    void show() {
        System.out.println("" + a);
    }

    public static void main(String[] args) {
        System.out.println("here");
        new B().show();
    }
}

class C{
    public static void main(String[] args) {
        System.out.println("here");
        new B().show();
    }
}
