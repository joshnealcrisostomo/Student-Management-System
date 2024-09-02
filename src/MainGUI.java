import javax.swing.*;
import java.awt.*;

/**
 * Main GUI consisting of all the subGUIs compiled in a cardLayout.
 */
public class MainGUI extends JFrame {
   private CardLayout cardLayout;
   private JPanel cardPanel;

   public MainGUI() {
       cardLayout = new CardLayout();
       cardPanel = new JPanel(cardLayout);

       add(cardPanel);

       setTitle("STUDENT MANAGEMENT SYSTEM");
       setSize(800, 500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       setResizable(false);

       setVisible(true);
   }

   public void showCard(String cardName) {
       cardLayout.show(cardPanel, cardName);
   }

    public void addHomePage(HomePage homePage) {
        cardPanel.add(homePage.getRootComponent(), "Home");
    }

    public void addLoginPage(LoginPage loginPage) {
       cardPanel.add(loginPage.getRootComponent(), "Login");
    }

    public void addSignUpPage(SignUpPage signUpPage) {
       cardPanel.add(signUpPage.getRootComponent(), "Sign Up");
    }

    public void addCreateAccPage(CreateAccPage createAccPage) {
       cardPanel.add(createAccPage.getRootComponent(), "Create Account");
    }

    public void addAdminPage(AdminPage adminPage) {
       cardPanel.add(adminPage.getRootComponent(), "Admin Page");
    }

    public void addStudentPage(StudentPage studentPage) {
       cardPanel.add(studentPage.getRootComponent(), "Student Page");
    }

    public void addTeacherPage(TeacherPage teacherPage)
    {
        cardPanel.add(teacherPage.getRootComponent(), "Teacher Page");
    }
}
