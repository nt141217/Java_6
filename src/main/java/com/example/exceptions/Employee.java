package com.example.exceptions;

public class Employee {
    private String name;
    private int skill;
    private double salary;

    public Employee(String name, int skill, double salary) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        if (skill <= 0) {
            throw new IllegalArgumentException("Skill must be greater than zero.");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }

        this.name = name;
        this.skill = skill;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public double getSalary() {
        return salary;
    }
}