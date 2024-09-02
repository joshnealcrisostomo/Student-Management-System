import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the login page.
 */
public class LoginPageController implements ActionListener, DocumentListener {
    private Model smsModel;
    private MainGUI mainGUI;
    private LoginPage loginPage;
    private AdminPage adminPage;
    private SignUpPage signUpPage;
    private StudentPage studentPage;
    private TeacherPage teacherPage;

    public LoginPageController(MainGUI mainGUI, LoginPage loginPage, AdminPage adminPage, StudentPage studentPage, TeacherPage teacherPage,SignUpPage signUpPage, Model smsModel) {
        this.smsModel = smsModel;
        this.mainGUI = mainGUI;
        this.signUpPage = signUpPage;
        this.adminPage = adminPage;
        this.studentPage = studentPage;
        this.teacherPage = teacherPage;

        this.loginPage = loginPage;

        this.loginPage.setActionListener(this);
    }
    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "LOGIN":
                String loginPageLbl = loginPage.getLoginPageLbl();

                switch (loginPageLbl) {
                    case "ADMIN LOGIN":
                        String inputAdminUser = loginPage.getUsername();
                        String inputAdminPass = loginPage.getPassword();

                        if (smsModel.authorizeAdmin(inputAdminUser, inputAdminPass)) {
                            loginPage.setValidMessage("Admin successfully logged in!");
                            adminPage.resetPanel();
                            mainGUI.showCard("Admin Page");
                            loginPage.clearTextFlds();
                        } else if (smsModel.isTextFldEmpty(inputAdminUser, inputAdminPass)) {
                            loginPage.clearTextFlds();
                            loginPage.setErrorMessage("Username/Password must be filled.");
                        } else {
                            loginPage.clearTextFlds();
                            loginPage.setErrorMessage("Username/Password does not match.");
                        }
                        break;
                    case "TEACHER LOGIN":
                        String teacherUserInput = loginPage.getUsername();
                        String teacherPassInput = new String(loginPage.getPassword());

                        if (smsModel.authorizeTeacherLogin(teacherUserInput, teacherPassInput)) {
                            teacherPage.updateGreeting(teacherUserInput);
                            smsModel.setCurrentUser(teacherUserInput);
                            loginPage.setValidMessage("Teacher successfully logged in!");
                            loginPage.clearTextFlds();
                            teacherPage.resetPanel();
                            mainGUI.showCard("Teacher Page");
                            loginPage.clearTextFlds();
                        } else if (smsModel.isTextFldEmpty(teacherUserInput, teacherPassInput)) {
                            loginPage.clearTextFlds();
                            loginPage.setErrorMessage("Username/Password must be filled.");
                        } else {
                            loginPage.clearTextFlds();
                            loginPage.setErrorMessage("Username/Password does not match.");
                        }
                        break;
                    case "STUDENT LOGIN":
                        String studentUserInput = loginPage.getUsername();
                        String studentPassInput = new String(loginPage.getPassword());

                        if (smsModel.authorizeStudentLogin(studentUserInput, studentPassInput)) {
                            studentPage.updateGreeting(studentUserInput);
                            smsModel.setCurrentUser(studentUserInput);
                            loginPage.setValidMessage("Student successfully logged in!");
                            loginPage.clearTextFlds();
                            studentPage.resetPanel();
                            mainGUI.showCard("Student Page");
                            loginPage.clearTextFlds();
                        } else if (smsModel.isTextFldEmpty(studentUserInput, studentPassInput)) {
                            loginPage.clearTextFlds();
                            loginPage.setErrorMessage("Username/Password must be filled.");
                        } else {
                            loginPage.clearTextFlds();
                            loginPage.setErrorMessage("Username/Password does not match.");
                        }
                        break;
                }
                break;
            case "New Here? Sign Up!":
                String loginLbl = loginPage.getLoginPageLbl();

                switch (loginLbl) {
                    case "TEACHER LOGIN":
                        loginPage.clearTextFlds();
                        signUpPage.disableTeacherBtn(true);
                        signUpPage.disableStudentBtn(false);
                        mainGUI.showCard("Sign Up");
                        break;
                    case "STUDENT LOGIN":
                        loginPage.clearTextFlds();
                        signUpPage.disableStudentBtn(true);
                        signUpPage.disableTeacherBtn(false);
                        mainGUI.showCard("Sign Up");
                        break;
                }

                break;
            case "< RETURN":
                loginPage.clearTextFlds();
                mainGUI.showCard("Home");
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
