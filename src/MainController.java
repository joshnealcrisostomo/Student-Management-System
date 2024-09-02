public class MainController {
    private Model smsModel;
    private MainGUI mainGUI;

    private HomePage homePage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;
    private CreateAccPage createAccPage;
    private AdminPage adminPage;
    private StudentPage studentPage;
    private TeacherPage teacherPage;

    private HomePageController homePageController;
    private LoginPageController loginPageController;
    private SignUpController signUpController;
    private CreateAccController createAccController;
    private AdminController adminController;
    private StudentController studentController;
    private TeacherController teacherController;

    /**
     * Main controller of the program that consists of all the GUIs and Controllers.
     *
     * @param mainGUI - main GUI of the program.
     * @param smsModel - main model of the program.
     */
    public MainController(MainGUI mainGUI, Model smsModel) {
        this.mainGUI = mainGUI;
        this.smsModel = smsModel;

        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
        this.signUpPage = new SignUpPage();
        this.createAccPage = new CreateAccPage();
        this.adminPage = new AdminPage();
        this.studentPage = new StudentPage();
        this.teacherPage = new TeacherPage();

        this.homePageController = new HomePageController(mainGUI, homePage, loginPage, smsModel);
        this.loginPageController = new LoginPageController(mainGUI, loginPage, adminPage, studentPage, teacherPage,signUpPage, smsModel);
        this.signUpController = new SignUpController(mainGUI, signUpPage, createAccPage, smsModel);
        this.createAccController = new CreateAccController(mainGUI, createAccPage, smsModel);
        this.adminController = new AdminController(mainGUI, adminPage, smsModel);
        this.studentController = new StudentController(mainGUI, studentPage, smsModel);
        this.teacherController = new TeacherController(mainGUI, teacherPage, smsModel);

        mainGUI.addHomePage(homePage);
        mainGUI.addLoginPage(loginPage);
        mainGUI.addSignUpPage(signUpPage);
        mainGUI.addCreateAccPage(createAccPage);
        mainGUI.addAdminPage(adminPage);
        mainGUI.addStudentPage(studentPage);
        mainGUI.addTeacherPage(teacherPage);
    }
}
