package com.example;
public class IncrementDecrementOperators {

    public int prefixIncrement(int x) {
        return ++x;
    }

    public int postfixIncrement(int x) {
        x++;
        return x;
    }

    public int prefixDecrement(int x) {
        return --x;
    }

    public int postfixDecrement(int x) {
        x--;
        return x;
    }

    public void incrementExamples() {
        int a = 5;
        int b = ++a; // a=6, b=6

        int c = 5;
        int d = c++; // c=6, d=5

        System.out.println("Prefix increment: a = " + a + ", b = " + b);
        System.out.println("Postfix increment: c = " + c + ", d = " + d);
    }

    public void decrementExamples() {
        int a = 5;
        int b = --a; // a=4, b=4

        int c = 5;
        int d = c--; // c=4, d=5

        System.out.println("Prefix decrement: a = " + a + ", b = " + b);
        System.out.println("Postfix decrement: c = " + c + ", d = " + d);
    }
}