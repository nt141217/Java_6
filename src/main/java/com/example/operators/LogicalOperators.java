package com.example;
public class LogicalOperators {

    public boolean conditionalAnd(boolean a, boolean b) {
        return a && b;
    }

    public boolean conditionalOr(boolean a, boolean b) {
        return a || b;
    }

    public boolean logicalNot(boolean a) {
        return !a;
    }

    public boolean logicalAndNoShortCircuit(boolean a, boolean b) {
        return a & b;
    }

    public boolean logicalOrNoShortCircuit(boolean a, boolean b) {
        return a | b;
    }

    public boolean logicalXor(boolean a, boolean b) {
        return a ^ b;
    }
}