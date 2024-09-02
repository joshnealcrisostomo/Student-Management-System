import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the admin page.
 */
public class AdminController implements ActionListener, DocumentListener {
    private Model smsModel;
    private MainGUI mainGUI;
    private AdminPage adminPage;

    public AdminController(MainGUI mainGUI, AdminPage adminPage, Model smsModel) {
        this.mainGUI = mainGUI;
        this.adminPage = adminPage;
        this.smsModel = smsModel;

        this.adminPage.setActionListener(this);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "Find Student/Teacher":
                adminPage.search();
                break;
            case "Teacher List":
                adminPage.updateContentTitle("| Teacher List");
                adminPage.removeSearchBar();
                adminPage.updateContentArea(smsModel.getTeacherList());
                break;
            case "Student List":
                adminPage.updateContentTitle("| Student List");
                adminPage.removeSearchBar();
                adminPage.updateContentArea(smsModel.getStudentList());
                break;
            case "SEARCH":
                String search = adminPage.getSearch();

                if(smsModel.isTextFldEmpty(search)) {
                    adminPage.setErrorMessage("Invalid. Search field must be filled.");
                } else {
                    String newContent = smsModel.findPerson(search);
                    adminPage.updateContentArea(newContent);
                }

                adminPage.clearSearchFld();
                break;
            case "Add Class":
                adminPage.addAddBtn();
                adminPage.updateContentArea(smsModel.getSubjectList());
                break;
            case "   ADD   ":
                String randomClassCode = smsModel.generateUniqueClassCode();
                adminPage.updateForAddClass(randomClassCode, smsModel.schedList(), smsModel.timeList(), smsModel.modalities());
                break;
            case "ADD CLASS":
                String code = adminPage.getClassCode();
                String name = adminPage.getClassName();
                String sched = adminPage.getSched();
                String time = adminPage.getTime();
                String mode = adminPage.getModality();

                smsModel.addClass(code, name, sched, time, mode);
                adminPage.setValidMessage("Class Added!");
                break;
            case "View Log Activity":
                adminPage.updateContentTitle("| Activity Logs");
                adminPage.removeSearchBar();
                adminPage.updateContentArea(smsModel.viewLogActivity());
                break;
            case "LOGOUT":
                int confirmation = adminPage.showConfirmLogout();

                if(confirmation == adminPage.getYesOption()) {
                    adminPage.clearSearchFld();
                    smsModel.addLogActivity("Admin logged out.");
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
