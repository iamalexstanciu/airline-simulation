package org.example;

public class FlightAttendant extends Employee {

    private Language language;

    public FlightAttendant(String name, String dateOfBirth, EmployeeType employeeType, Language language) {
        super(name, dateOfBirth, employeeType);
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }
}
