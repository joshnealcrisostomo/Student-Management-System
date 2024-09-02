import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the main menu.
 */
public class HomePageController implements ActionListener, DocumentListener {
    private Model smsModel;
    private HomePage homePage;
    private MainGUI mainGUI;
    private LoginPage loginPage;

    public HomePageController(MainGUI mainGUI, HomePage homePage, LoginPage loginPage, Model smsModel) {
        this.mainGUI = mainGUI;
        this.smsModel = smsModel;

        this.homePage = homePage;
        this.loginPage = loginPage;

        this.homePage.setActionListener(this);
    }
    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Admin":
                loginPage.clearTextFlds();
                updateLoginLabel("ADMIN LOGIN", false, "");
                break;
            case "Teacher":
                loginPage.clearTextFlds();
                updateLoginLabel("TEACHER LOGIN", true, "New Here? Sign Up!");
                break;
            case "Student":
                loginPage.clearTextFlds();
                updateLoginLabel("STUDENT LOGIN", true, "New Here? Sign Up!");
                break;
            case "Quit":
                System.exit(0);
                break;
        }
    }

    /**
     * Updates the login label and switches to the login view.
     *
     * @param labelText Text to display in the login label.
     * @param enableCreateAccBtn Whether to enable the create account button.
     * @param createAccBtnText Text for the create account button.
     */
    private void updateLoginLabel(String labelText, boolean enableCreateAccBtn, String createAccBtnText) {
        loginPage.setLoginPageLbl(labelText);
        loginPage.setCreateAccBtnEnabled(enableCreateAccBtn);
        loginPage.setCreateAccBtnText(createAccBtnText);
        mainGUI.showCard("Login");
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
