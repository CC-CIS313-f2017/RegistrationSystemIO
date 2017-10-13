# RegistrationSystemIO
Homework 4

Topic: writing to and reading from file

The basis for this homework is the registration system completed in homework 3. Clone the solution included in this  assignment. 

The code to print a roll to a file or to the screen is very similar. To avoid duplicated code we will create methods in the Section class and in the Course class, that will create a String with the section or course information and then use those mehtods to print the information.

1. In Section class: Add a toString method. This method should output the section information and the students information in the same format that it was printed in printSectionInfo() and printRoll(). 
Note: the static method format in the String class, takes the same arguments as printf and return the String in the same format as printf prints it. 

2. In Course class: Add a method called courseRollToString that returns a String that contains the information that is currently printed by the printRoll() method. You must call the toString method from the Section class in your implementation.

3. Modify the printRoll() method so that its implementation makes use of the courseRollToString method (only one line of code needed in the body of the method!)

4. In Course class: Add a printCourseToFile method that takes one parameter for the file name. Make use of the courseRollToString in your implementation.

5. In main method: Call the printCourseToFile method after printing to the screen. The file produced should contains the same information with the same formatting as the printout to the screen.  

6. In Main class: Complete the  static methods printCourseToFile and ReadCourseFromFile that write and read a Course **object** to a file. The method stubs are already included in the class. You need to make the necessary changes to some other class(es) to be able to read and write the Course object.

7. Add the code as suggested in comments at the bottom of the main method to test the method written in (6).
