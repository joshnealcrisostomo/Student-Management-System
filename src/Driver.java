/**
 * Main Driver of the program.
 */
public class Driver {
    public static void main(String[] args) {
        Model smsModel = new Model();
        MainGUI mainGUI = new MainGUI();
        MainController mainController = new MainController(mainGUI, smsModel);
    }
}