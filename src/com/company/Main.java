package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Course cis313 = new Course("CIS 313", "Software Developement");
        cis313.addSection("Fall 2017", "BSC221","W 2:00pm-3:15pm", 3);
        cis313.addSection("Fall 2017", "BSC221","M 2:00pm-3:15pm", 3);

        if(!cis313.enrollStudent(new Undergraduate("123","Ngo","Katherine"), "Fall 2017","W 2:00pm-3:15pm")){
            cis313.enrollStudent(new Undergraduate("123","Ngo","Katherine"), "Fall 2017","M 2:00pm-3:15pm");
        };
        if(!cis313.enrollStudent(new Undergraduate("234","Nguyen","Megan"), "Fall 2017","W 2:00pm-3:15pm")){
            cis313.enrollStudent(new Undergraduate("234","Nguyen","Megan"), "Fall 2017","M 2:00pm-3:15pm");
        };
        if(!cis313.enrollStudent(new Undergraduate("345","Blue","Raquel"), "Fall 2017","W 2:00pm-3:15pm")){
            cis313.enrollStudent(new Undergraduate("345","Blue","Raquel"), "Fall 2017","M 2:00pm-3:15pm");
        }
        if(!cis313.enrollStudent(new Undergraduate("456","Karoly","Alexa"), "Fall 2017","W 2:00pm-3:15pm")){
            cis313.enrollStudent(new Undergraduate("456","Karoly","Alexa"), "Fall 2017","M 2:00pm-3:15pm");
        }
        if(!cis313.enrollStudent(new Undergraduate("567","Monroe","Ashlyn"), "Fall 2017","W 2:00pm-3:15pm")){
            cis313.enrollStudent(new Undergraduate("567","Monroe","Ashlyn"), "Fall 2017","M 2:00pm-3:15pm");
        }

        cis313.printRoll();

        // Print roll of cis313 to file


        // Print the object cis313 to a file


        // Read object stored in file and store it in new variable cis313Copy of type Course.


        // print roll of cis313Copy to screen
        System.out.println("Printing  copy of CIS 313 read from file");

    }

    /**
     * Prints a course obejct to a file.
     * @param filename  name of file
     * @param aCourse   name of Course object to print to file
     */

    public static void printCourseToFile(String filename, Course aCourse){

    }

    /**
     * Read a course object form a file
     * @param filename  name of file containing the object
     * @return  the Course object
     */
    public static Course readCourseFormFile(String filename) {

        return null;
    }
}
