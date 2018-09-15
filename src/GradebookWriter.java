//***************************************************************************************************************************
// CLASS: GradebookWriter
//
// AUTHOR
// Your author information
//***************************************************************************************************************************

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * GradebookWriter inherits from PrintWriter and writes the gradebook info to the file name passed to the ctor.
 */
public class GradebookWriter extends PrintWriter {

    Scanner mIn;



    /**
     * GradebookWriter()
     * Call the super class ctor that takes a String.
     */
    public GradebookWriter(String fileName, Scanner mIn) throws FileNotFoundException {
        super(fileName);
        this.mIn = mIn;
    }

    /**
     * writeGradebook()
     * Writes the gradebook info to the file, which was opened in the ctor.
     *
     *
     *
     * PSEUDOCODE:
     * EnhancedFor each student in pRoster.getStudentList() Do
     *    Call println(student)
     * End For
     * Call close()
     */

    public void writeGradeBook(Roster pRoster){
        for(Student student : pRoster.getStudentList() ){

           println(student.toString());
        }
        close();
    }
}
