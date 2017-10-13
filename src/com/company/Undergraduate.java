package com.company;

public class Undergraduate extends Student{
    public static final double MINGPA = 2;

    public Undergraduate(String studId, String lastName, String firstName) {
        super(studId, lastName, firstName);
    }

    @Override
    public double getMingpa() {
        return MINGPA;
    }
}
