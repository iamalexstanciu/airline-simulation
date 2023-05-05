package org.example;

public class Pilot extends Employee {

    private EmployeeType employeeType;

    private boolean compassAnalog;

    public Pilot(String name, String dateOfBirth, EmployeeType employeeType) {
        super(name, dateOfBirth, employeeType);
        this.compassAnalog = false;
    }

    public boolean isCompassAnalog() {
        return compassAnalog;
    }

    public void setCompassAnalog(boolean compassAnalog) {
        this.compassAnalog = true;
    }

    public EmployeeType getPilotType() {
        return employeeType;
    }

}
