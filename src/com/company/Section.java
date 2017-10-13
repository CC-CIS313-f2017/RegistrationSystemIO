package com.company;

import java.util.*;

public class Section {
    private String semester;
    private String place;
    private String dayAndTimes;
    private int capacity;
    private List<Student> roll;

    public Section(String semester, String place, String dayAndTimes, int capacity) {
        this.semester = semester;
        this.place = place;
        this.dayAndTimes = dayAndTimes;
        this.capacity = capacity;
        roll = new ArrayList<Student>();
    }

    public String getSemester() {
        return semester;
    }

    public String getPlace() {
        return place;
    }

    public String getDayAndTimes() {
        return dayAndTimes;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDayAndTimes(String dayAndTimes) {
        this.dayAndTimes = dayAndTimes;
    }

    public boolean isFull(){
        return roll.size() >= capacity;
    }

    public boolean enrollStudent(Student student){
        if(!isFull()){
            roll.add(student);
            return true;
        }
        else{
            return false;
        }
    }

    public void printSectionInfo(){
        System.out.printf("%s\t%s\t%s\n", semester, place, dayAndTimes);
    }
    public void printRoll(){
        for(Student student:roll){
            System.out.printf("%s\t%-10s%s\n", student.getStudId(), student.getLastName(), student.getFirstName());
        }
    }

}
