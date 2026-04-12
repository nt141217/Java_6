package com.example;
public class ConditionalOperator {

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public String evenOrOdd(int x) {
        return (x % 2 == 0) ? "parzysta" : "nieparzysta";
    }
}