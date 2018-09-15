//***************************************************************************************************************************
// CLASS: Main
//
// AUTHOR
// Your author information
//***************************************************************************************************************************

import java.io.FileNotFoundException;
import javax.swing.JFrame;

/**
 * The Main class containing the main() and run() methods.
 */
public class Main {

    // The Roster of students that is read from "gradebook.txt".
    private Roster mRoster;

    // A reference to the View object.
    private View mView;

    /**
     * This is where execution starts. Instantiate a Main object and then call run().
     */
    public static void main(String[] pArgs)  {
        ???
    }

    /**
     * exit() is called when the Exit button in the View is clicked.
     *
     * PSEUDOCODE:
     * try
     *     Instantiate a GradebookWriter object opening "gradebook.txt" for writing
     *     Call writeGradebook(getRoster()) on the object
     *     Call System.exit(0) to terminate the application
     * catch FileNotFoundException
     *     Call messageBox() on the View to display ""Could not open gradebook.txt for writing. Exiting without saving."
     *     Call System.exit(-1) to terminate the application with an error code of -1
     */

    try  {


        GradebookWriter book = new GradebookWriter("/Users/jonathanzier/Dropbox/IdeaProjects/CSE 205 Project 3/src/gradebook.txt");
        book.writeGradeBook(getRoster());
        System.exit(0);

    }

    catch fileNotFoundException(FileNotFoundException exception){
        View.messageBox("Could not open gradebook.txt for writing. Exiting without saving.");
        System.exit(-1);
    }

    /**
     * Accessor method for mRoster.
     */
    public Roster getRoster() {
        return mRoster;
    }

    /**
     * Accessor method for mView.
     */
    public View getView() {
        return mView;
    }

    /**
     * run() is the main routine.
     *
     * PSEUDOCODE:
     * Call JFrame.setDefaultLookAndFeelDecorated(true or false depending on your preference)
     * Call setView(instantiate new View object passing this to the ctor)
     * try
     *     Instantiate a GradebookReader object to open "gradebook.txt" for reading
     *     Call readGradebook() on the object
     *     Call setRoster() to save the Roster returned from readGradebook()
     * catch
     *     Call messageBox() on the View to display ""
     *     Call System.exit(-1) to terminate the application with an error code
     *
     *
     */
    public void run() {


        JFrame.setDefaultLookAndFeelDecorated(true);
        View view = new View;
        setView(View);

        try {
           GradebookReader book = new GradebookReader("gradebook.txt");
           setRoster(book.readGradebook());
        } catch {
            View.messageBox("Could not open gradebook.txt for reading. Exiting.");
            System.exit(-1);
            
        }
    }

    /**
     * search() is called when the Search button is clicked on the View. The input parameter is the non-empty last name
     * of the Student to locate. Call getStudent(pLastName) on the Roster object to get a reference to the Student with
     * that last name. If the student is not located, getStudent() returns null.
     */
    public Student search(String pLastName){
        if(Roster.getStudent(pLastName) == null){
            return null;
        }

        else{
            return Roster.getStudent(pLastName);
        }

    }

    /**
     * Mutator method for mRoster.
     */
    public void setRoster(Roster pRoster) {
        mRoster = pRoster;
    }

    /**
     * Mutator method for mView.
     */
    public void setView(View pView) {
        mView = pView;
    }
}
