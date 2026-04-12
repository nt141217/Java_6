package com.example.exceptions;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        System.out.println("=== 16. Exception Handling and Validation ===");

        System.out.println("\n16.5 Constructor validation:");
        try {
            Employee employee1 = new Employee("Anna", 8, 7000);
            System.out.println("Employee created: " + employee1.getName()
                    + ", skill = " + employee1.getSkill()
                    + ", salary = " + employee1.getSalary());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid employee data: " + e.getMessage());
        }

        try {
            Employee employee2 = new Employee("", 5, 3000);
            System.out.println(employee2.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid employee data: " + e.getMessage());
        }

        System.out.println("\n18. try-catch:");
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("\n18.1 Example with validation:");
        try {
            int monthlyCost = ValidationUtils.calculateMonthlyCost(5, 4000);
            System.out.println("Monthly cost: " + monthlyCost);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }

        try {
            int monthlyCostInvalid = ValidationUtils.calculateMonthlyCost(0, 4000);
            System.out.println("Monthly cost: " + monthlyCostInvalid);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }

        System.out.println("\n19. finally block:");
        try {
            System.out.println("Trying...");
        } catch (Exception e) {
            System.out.println("Caught exception.");
        } finally {
            System.out.println("This always runs.");
        }

        System.out.println("\n21. Validation examples:");
        try {
            ValidationUtils.setSkill(10);
            System.out.println("Skill is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidationUtils.setSkill(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidationUtils.setName("John");
            System.out.println("Name is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidationUtils.setName("   ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 1: " + ValidationUtils.getElement(numbers, 1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 5: " + ValidationUtils.getElement(numbers, 5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n23. Complete example combining operators and validation:");
        try {
            int totalSkill = 21;
            int employeeCount = 3;

            double average = ValidationUtils.calculateAverage(totalSkill, employeeCount);
            System.out.println("Average skill: " + average);

            double invalid = ValidationUtils.calculateAverage(totalSkill, 0);
            System.out.println("This line will not be printed: " + invalid);

        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }

        System.out.println("\nExercise 5 divide:");
        try {
            System.out.println("10 / 2 = " + ValidationUtils.divide(10, 2));
            System.out.println("10 / 0 = " + ValidationUtils.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}