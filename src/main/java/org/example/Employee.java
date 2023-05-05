package org.example;

abstract class Employee {
    private String name;
    private String dateOfBirth;

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    private EmployeeType employeeType;

    public Employee(String name, String dateOfBirth, EmployeeType employeeType) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.employeeType = employeeType;
    }
}
