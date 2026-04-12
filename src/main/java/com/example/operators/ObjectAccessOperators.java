package com.example;

public class ObjectAccessOperators {

    public int createObjectAndUseNew() {
        ArithmeticOperators arithmetic = new ArithmeticOperators();
        return arithmetic.additionInt(2, 3);
    }

    public String memberAccess() {
        Developer developer = new Developer("Anna", 8, 7000);
        return developer.getName();
    }

    public int arrayAccess() {
        int[] numbers = {1, 2, 3};
        return numbers[0];
    }

    public int parenthesesGrouping() {
        return (2 + 3) * 4;
    }
}