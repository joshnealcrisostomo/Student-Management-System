import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the account creation.
 */
public class CreateAccController implements ActionListener, DocumentListener {
    private Model smsModel;
    private MainGUI mainGUI;
    private CreateAccPage createAccPage;
    String teacherFirstName, teacherLastName, profType;
    String studentFirstName, studentLastName, studentYear;
    String monthT, monthS, genderT, genderS;
    String username, idNum, passwordT, passwordS, confirmPassT, confirmPassS;
    int dayT, yearT, dayS, yearS;

    public CreateAccController(MainGUI mainGUI, CreateAccPage createAccPage, Model smsModel) {
        this.smsModel = smsModel;
        this.mainGUI = mainGUI;
        this.createAccPage = createAccPage;

        this.createAccPage.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Proceed To Step 2 of 3":
                String createAccLbl = createAccPage.getStepLabel();

                switch(createAccLbl) {
                    case "NEW TEACHER":
                        teacherFirstName = createAccPage.getFirstName();
                        teacherLastName = createAccPage.getLastName();
                        profType = createAccPage.getProfType();

                        if(smsModel.isTextFldEmpty(teacherFirstName, teacherLastName)) {
                            createAccPage.setErrorMessage("Firstname/Lastname must be filled.");
                        } else {
                            createAccPage.updateForStepTwoTeacher(smsModel.monthList());
                        }
                        break;
                    case "NEW STUDENT":
                        studentFirstName = createAccPage.getFirstName();
                        studentLastName = createAccPage.getLastName();
                        studentYear = createAccPage.getStudentYear();

                        if(smsModel.isTextFldEmpty(studentFirstName, studentLastName)) {
                            createAccPage.setErrorMessage("Firstname/Lastname must be filled.");
                        } else {
                            createAccPage.updateForStepTwoStudent(smsModel.monthList());
                        }
                        break;
                }
                break;
            case "Proceed To Step 3 of 3":
                String stepTwoLbl = createAccPage.getStepLabel();

                switch(stepTwoLbl) {
                    case "BIRTHDATE AND GENDER (TEACHER)":
                        monthT = createAccPage.getMonth();
                        dayT = createAccPage.getDay();
                        yearT = createAccPage.getYear();
                        genderT = createAccPage.getGender();

                        if(smsModel.isTextFldEmpty(dayT, yearT, genderT)) {
                            createAccPage.setErrorMessage("Day/Year/Gender must be filled appropriately.");
                        } else {
                            if(smsModel.isDateValid(monthT, dayT, yearT)) {
                                createAccPage.updateForLastStepTeacher();
                            } else {
                                createAccPage.setErrorMessage("Date is invalid. Please try again.");
                            }
                        }
                        break;
                    case "BIRTHDATE AND GENDER (STUDENT)":
                        monthS = createAccPage.getMonth();
                        dayS = createAccPage.getDay();
                        yearS = createAccPage.getYear();
                        genderS = createAccPage.getGender();

                        if(smsModel.isTextFldEmpty(dayS, yearS, genderS)) {
                            createAccPage.setErrorMessage("Day/Year/Gender must be filled appropriately.");
                        } else {
                            if(smsModel.isDateValid(monthS, dayS, yearS)) {
                                createAccPage.updateForLastStepStudent();
                            } else {
                                createAccPage.setErrorMessage("Date is invalid. Please try again.");
                            }
                        }
                        break;
                }
                break;
            case "SIGN UP":
                String lastStepLbl = createAccPage.getStepLabel();

                switch(lastStepLbl) {
                    case "USERNAME AND PASSWORD (TEACHER)":
                        username = createAccPage.getUsername();
                        passwordT = createAccPage.getPassword();
                        confirmPassT = createAccPage.getConfirmPass();

                        if(smsModel.isTextFldEmpty(username, passwordT, confirmPassT)) {
                            createAccPage.setErrorMessage("Username/Password must be filled.");
                        } else {
                            if(smsModel.isTeacherUsernameExists(username)) {
                                createAccPage.setErrorMessage("Username already exists.");
                                createAccPage.clearUserPass();
                            } else {
                                if(smsModel.doesPassMatch(passwordT, confirmPassT)) {
                                    if(smsModel.isPasswordValid(passwordT)) {
                                        smsModel.addTeacher(username, teacherFirstName, teacherLastName, genderT, passwordT, monthT, dayT, yearT, profType);
                                        createAccPage.setValidMessage("Account Created!");
                                        mainGUI.showCard("Home");
                                    } else {
                                        createAccPage.setErrorMessage("Passwords does not meet the requirements.");
                                        createAccPage.clearUserPass();
                                    }
                                } else {
                                    createAccPage.setErrorMessage("Passwords does not match. Please try again.");
                                    createAccPage.clearUserPass();
                                }
                            }
                        }
                        break;
                    case "ID NUMBER AND PASSWORD (STUDENT)":
                        idNum = createAccPage.getUsername();
                        passwordS = createAccPage.getPassword();
                        confirmPassS = createAccPage.getConfirmPass();

                        if(smsModel.isTextFldEmpty(idNum, passwordS, confirmPassS)) {
                            createAccPage.setErrorMessage("Username/Password must be filled.");
                        } else {
                            if(smsModel.isStudentIdNumExists(idNum)) {
                                createAccPage.setErrorMessage("ID number already exists.");
                                createAccPage.clearUserPass();
                            } else {
                                if(smsModel.doesPassMatch(passwordS, confirmPassS)) {
                                        if(smsModel.isPasswordValid(passwordS)) {
                                            smsModel.addStudent(idNum, studentFirstName, studentLastName, genderS, passwordS, monthS, dayS, yearS, studentYear);
                                            createAccPage.setValidMessage("Account Created!");
                                            mainGUI.showCard("Home");
                                        } else {
                                            createAccPage.setErrorMessage("Passwords does not meet the requirements.");
                                            createAccPage.clearUserPass();
                                        }
                                } else {
                                    createAccPage.setErrorMessage("Passwords does not match. Please try again.");
                                    createAccPage.clearUserPass();
                                }
                            }
                        }
                        break;
                }
                break;
            case "Reset Inputs":
                String resetLbl = createAccPage.getStepLabel();

                switch(resetLbl) {
                    case "NEW TEACHER":
                    case "NEW STUDENT":
                        createAccPage.clearNameFlds();
                        break;
                    case "BIRTHDATE AND GENDER (TEACHER)":
                    case "BIRTHDATE AND GENDER (STUDENT)":
                        createAccPage.clearBirthdateGender();
                        break;
                    case "USERNAME AND PASSWORD (TEACHER)":
                    case "ID NUMBER AND PASSWORD (STUDENT)":
                        createAccPage.clearUserPass();
                        break;
                }
                break;
            case "< RETURN":
                int confirmation = createAccPage.showConfirmReturn();

                if(confirmation == createAccPage.getYesOption()) {
                    mainGUI.showCard("Sign Up");
                }
                break;
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // No changes needed here for now
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        // No changes needed here for now
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // No changes needed here for now
    }
}
