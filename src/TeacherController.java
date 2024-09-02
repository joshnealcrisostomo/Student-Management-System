import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the teacher page.
 */
public class TeacherController implements ActionListener, DocumentListener {
    private Model smsModel;
    private MainGUI mainGUI;
    private TeacherPage teacherPage;

    public TeacherController(MainGUI mainGUI, TeacherPage teacherPage, Model smsModel) {
        this.mainGUI = mainGUI;
        this.teacherPage = teacherPage;
        this.smsModel = smsModel;

        this.teacherPage.setActionListener(this);
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
                teacherPage.removeExtraContent();
                teacherPage.updateContentTitle(" | Profile");
                teacherPage.updateContentArea(smsModel.teacherInfo(currentUser));
                break;
            case "Edit Profile":
                teacherPage.removeExtraContent();
                teacherPage.updateForEditProfile();
                break;
            case "EDIT NAME":
                teacherPage.removeExtraContent();
                teacherPage.editNamePanel();
                break;
            case "EDIT GENDER":
                teacherPage.removeExtraContent();
                teacherPage.editGenderPanel();
                break;
            case "EDIT PROF TYPE":
                teacherPage.removeExtraContent();
                teacherPage.editProfTypePanel(smsModel.profTypes());
                break;
            case "APPLY NAME":
                String newFirstName = teacherPage.getNewFirstName();
                String newLastName = teacherPage.getNewLastName();

                if(smsModel.isTextFldEmpty(newFirstName, newLastName)) {
                    teacherPage.setErrorMessage("First/Last name must be both filled.");
                } else {
                    smsModel.updateTeacherName(newFirstName, newLastName);
                    teacherPage.setValidMessage("Name updated successfully!");
                }
                break;
            case "APPLY GENDER":
                String newGender = teacherPage.getNewGender();

                if(smsModel.isTextFldEmpty(newGender)) {
                    teacherPage.setErrorMessage("Gender must be filled.");
                } else {
                    smsModel.updateTeacherGender(newGender);
                    teacherPage.setValidMessage("Gender updated successfully!");
                }
                break;
            case "APPLY PROF TYPE":
                String newProfType = teacherPage.getNewProfType();

                if(smsModel.isTextFldEmpty(newProfType)) {
                    teacherPage.setErrorMessage("Prof Type must be filled.");
                } else {
                    smsModel.updateTeacherType(newProfType);
                    teacherPage.setValidMessage("Prof Type updated successfully!");
                }
                break;
            case "Student List":
                teacherPage.removeExtraContent();
                teacherPage.updateContentTitle(" | All Students");
                teacherPage.updateContentArea(smsModel.getStudentList());
                break;
            case "Connect":
                teacherPage.removeExtraContent();
                teacherPage.updateForConnect();
                break;
            case "View Friends":
                teacherPage.updateForFriendList(smsModel.viewFriends(currentUser));
                break;
            case "Add Friend":
                teacherPage.updateForAddFriend(smsModel.displayUsernameAndName());
                break;
            case "Friend Requests":
                teacherPage.updateForAcceptReq(smsModel.viewFriendRequests(currentUser));
                break;
            case "ADD":
                String teacherToAdd = teacherPage.getAddFriend();

                if(smsModel.isTextFldEmpty(teacherToAdd)) {
                    teacherPage.setErrorMessage("Username must be filled.");
                } else {
                    smsModel.sendFriendRequest(currentUser, teacherToAdd);
                    teacherPage.setValidMessage("Friend request sent!");
                }
                break;
            case "ACCEPT":
                String teachertoAccept = teacherPage.getAcceptReq();

                if(smsModel.isTextFldEmpty(teachertoAccept)) {
                    teacherPage.setErrorMessage("Username must be filled.");
                } else {
                    smsModel.acceptFriendRequest(currentUser, teachertoAccept);
                    teacherPage.setValidMessage("Friend request accepted!");
                }
                break;
            case "LOGOUT":
                teacherPage.removeExtraContent();
                int confirmation = teacherPage.showConfirmLogout();

                if(confirmation == teacherPage.getYesOption()) {
                    smsModel.addLogActivity("Teacher logged out.");
                    mainGUI.showCard("Home");
                }
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
