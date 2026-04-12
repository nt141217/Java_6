package com.example;
public class ShiftOperators {

    public int leftShift(int a, int positions) {
        return a << positions;
    }

    public int signedRightShift(int a, int positions) {
        return a >> positions;
    }

    public int unsignedRightShift(int a, int positions) {
        return a >>> positions;
    }
}