import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the signup page.
 */
public class SignUpController implements ActionListener, DocumentListener {
    private Model smsModel;
    private MainGUI mainGUI;
    private SignUpPage signUpPage;
    private CreateAccPage createAccPage;

    public SignUpController(MainGUI mainGUI, SignUpPage signUpPage, CreateAccPage createAccPage, Model smsModel) {
        this.smsModel = smsModel;
        this.mainGUI = mainGUI;

        this.signUpPage = signUpPage;
        this.createAccPage = createAccPage;

        this.signUpPage.setActionListener(this);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "Teacher":
                createAccPage.updateForStepOneTeacher(smsModel.profTypes());
                mainGUI.showCard("Create Account");
                break;
            case "Student":
                createAccPage.updateForStepOneStudent(smsModel.yearStudent());
                mainGUI.showCard("Create Account");
                break;
            case "< RETURN":
                mainGUI.showCard("Login");
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
