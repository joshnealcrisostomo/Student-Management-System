import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the student page.
 */
public class StudentController implements ActionListener, DocumentListener {
    private Model smsModel;
    private MainGUI mainGUI;
    private StudentPage studentPage;

    public StudentController(MainGUI mainGUI, StudentPage studentPage, Model smsModel) {
        this.mainGUI = mainGUI;
        this.studentPage = studentPage;
        this.smsModel = smsModel;

        this.studentPage.setActionListener(this);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String currentUser = smsModel.getCurrentUser();

        switch(e.getActionCommand()) {
            case "View Profile":
                studentPage.removeExtraContent();
                studentPage.updateContentTitle(" | Profile");
                studentPage.updateContentArea(smsModel.studentInfo(currentUser));
                break;
            case "Edit Profile":
                studentPage.removeExtraContent();
                studentPage.updateForEditProfile();
                break;
            case "EDIT NAME":
                studentPage.removeExtraContent();
                studentPage.editNamePanel();
                break;
            case "EDIT GENDER":
                studentPage.removeExtraContent();
                studentPage.editGenderPanel();
                break;
            case "EDIT YEAR":
                studentPage.removeExtraContent();
                studentPage.editYearPanel(smsModel.yearStudent());
                break;
            case "APPLY NAME":
                String newFirstName = studentPage.getNewFirstName();
                String newLastName = studentPage.getNewLastName();

                if(smsModel.isTextFldEmpty(newFirstName, newLastName)) {
                    studentPage.setErrorMessage("First/Last name must be both filled.");
                } else {
                    smsModel.updateStudentName(newFirstName, newLastName);
                    studentPage.setValidMessage("Name updated successfully!");
                }
                break;
            case "APPLY GENDER":
                String newGender = studentPage.getNewGender();

                if(smsModel.isTextFldEmpty(newGender)) {
                    studentPage.setErrorMessage("Gender must be filled.");
                } else {
                    smsModel.updateStudentGender(newGender);
                    studentPage.setValidMessage("Gender updated successfully!");
                }
                break;
            case "APPLY YEAR":
                String newYear = studentPage.getNewYear();

                if(smsModel.isTextFldEmpty(newYear)) {
                    studentPage.setErrorMessage("Year level must be filled.");
                } else {
                    smsModel.updateStudentYear(newYear);
                    studentPage.setValidMessage("Year level updated successfully!");
                }
                break;
            case "Teacher List":
                studentPage.removeExtraContent();
                studentPage.updateContentTitle(" | All Teachers");
                studentPage.updateContentArea(smsModel.getTeacherList());
                break;
            case "Enroll Classes":
                studentPage.enroll(smsModel.getSubjectList());
                break;
            case "LOGOUT":
                studentPage.removeExtraContent();
                int confirmation = studentPage.showConfirmLogout();

                if(confirmation == studentPage.getYesOption()) {
                    smsModel.addLogActivity("Student logged out.");
                    mainGUI.showCard("Home");
                }
                break;
            case "ENROLL":
                studentPage.updateContentTitle(" | Enroll Classes");
                studentPage.updateContentArea("This is some sample text.\n\n" + "Add more text here to test the scrollbar.\n\n".repeat(20));
                break;
        }
    }

    /**
     * Gives notification that there was an insert into the document.  The
     * range given by the DocumentEvent bounds the freshly inserted region.
     *
     * @param e the document event
     */
    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    /**
     * Gives notification that a portion of the document has been
     * removed.  The range is given in terms of what the view last
     * saw (that is, before updating sticky positions).
     *
     * @param e the document event
     */
    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    /**
     * Gives notification that an attribute or set of attributes changed.
     *
     * @param e the document event
     */
    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
