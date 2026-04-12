package com.example.exceptions;

public class ValidationUtils {

    public static int calculateMonthlyCost(int employees, int salary) {
        if (employees <= 0) {
            throw new IllegalArgumentException("Employees must be greater than zero.");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }

        return employees * salary;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor must not be zero.");
        }

        return a / b;
    }

    public static double calculateAverage(int sum, int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Count must be greater than zero.");
        }

        return (double) sum / count;
    }

    public static void setSkill(int skill) {
        if (skill <= 0) {
            throw new IllegalArgumentException("Skill must be positive.");
        }
    }

    public static void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank.");
        }
    }

    public static int getElement(int[] numbers, int index) {
        if (index < 0 || index >= numbers.length) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }

        return numbers[index];
    }
}