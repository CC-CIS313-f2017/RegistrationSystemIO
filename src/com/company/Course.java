package com.company;

import java.util.*;


public class Course {
    private String id;
    private String name;
    private int numberOfCredits;
    private String description;
    private List<Section> sections;

    /**
     * Constructor for Course object
     * @param id    The course id
     * @param name  The course name
     */
    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        sections = new ArrayList<Section>();
    }

    /**
     * Returns the course id
     * @return  The course id
     */
    public String getId() {
        return id;
    }

    /**
     * Return the course name
     * @return  The course name
     */
    public String getName() {
        return name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public String getDescription() {
        return description;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addSection(String semester, String place, String dayAndTime, int capacity) {
        sections.add(new Section(semester, place, dayAndTime, capacity));
    }

    public List<Section> openSections(){
        ArrayList<Section>  open = new ArrayList<Section>();
        for(Section section : sections){
            if (!section.isFull()){
                open.add(section);
            }
        }
        return open;
    }

    public boolean enrollStudent(Student student, String semester, String dayAndTime){
        for(Section section: openSections()) {
            if ((section.getDayAndTimes().equals(dayAndTime)) && (section.getSemester().equals(semester))) {
                return section.enrollStudent(student);
            }
        }
        return false;
    }

    public void printRoll(){
        System.out.printf("%s\t%s\n\n", id, name );
        for(Section section: sections){
            section.printSectionInfo();
            section.printRoll();
            System.out.println();
        }
    }


}
