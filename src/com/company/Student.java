package com.company;


public abstract class Student {
    protected String studId;
    protected String lastName;
    protected String firstName;
    protected double gpa;

    public Student(String studId, String lastName, String firstName) {
        this.studId = studId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getStudId() {

        return studId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format("%-6s%-10s%s", studId,lastName,firstName);
    }

    public boolean isInGoodStanding() {
        return gpa >= getMingpa();
    }

    public abstract double getMingpa();
}
