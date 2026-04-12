package com.example;
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

    public int work() {
        return skill;
    }

    public String getName(){
        return name;
    }

    public int getSkill(){
        return skill;
    }

    public double getSalary(){
        return salary; 
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