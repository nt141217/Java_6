package com.example;
public class AssignmentOperators {

    public int addAssign(int x, int value) {
        x += value;
        return x;
    }

    public int subtractAssign(int x, int value) {
        x -= value;
        return x;
    }

    public int multiplyAssign(int x, int value) {
        x *= value;
        return x;
    }

    public int divideAssign(int x, int value) {
        x /= value;
        return x;
    }

    public int remainderAssign(int x, int value) {
        x %= value;
        return x;
    }

    public int andAssign(int x, int value) {
        x &= value;
        return x;
    }

    public int orAssign(int x, int value) {
        x |= value;
        return x;
    }

    public int xorAssign(int x, int value) {
        x ^= value;
        return x;
    }

    public int leftShiftAssign(int x, int value) {
        x <<= value;
        return x;
    }

    public int rightShiftAssign(int x, int value) {
        x >>= value;
        return x;
    }

    public int unsignedRightShiftAssign(int x, int value) {
        x >>>= value;
        return x;
    }
}