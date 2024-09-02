import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Locale;

/**
 * GUI for the student page.
 */
public class StudentPage extends JPanel {
    private JPanel studentPagePanel;
    private JPanel optionsPanel;
    private JPanel studentTitlePanel;
    private JPanel studentTitle;
    private JLabel studentLbl;
    private JPanel dividerPanel;
    private JSeparator divider;
    private JPanel options;
    private JButton viewProfileBtn;
    private JButton dashboardBtn;
    private JButton manageProfile;
    private JButton enrollClassBtn;
    private JButton logoutBtn;
    private JPanel mainStudentPanel;
    private JPanel contentTitlePanel;
    private JPanel extraPanel;
    private JLabel contentTitleLbl;
    private JTextArea contentArea;
    private JScrollPane scrollBar1;
    private JPanel contentPanel;
    private JButton enrollBtn;
    private JPanel choicePanel;
    private JButton editGender, editYear, editName;
    private JPanel editContentPanel;
    private JLabel newInfoLbl;
    private JComboBox<String> newYear;
    private JTextField newName, newPass, newGender;
    private JLabel newInfo2Lbl;
    private JTextField newName2;
    private JButton applyNameBtn, applyPassBtn, applyGenderBtn, applyYearBtn;

    public StudentPage() {
        setLayout(new BorderLayout());

        setSize(800, 500);

        designPanel();

        setVisible(true);
    }

    private void designPanel() {
        studentPagePanel = new JPanel();
        studentPagePanel.setLayout(new BorderLayout(0, 0));
        studentPagePanel.setBackground(new Color(-331546));
        studentPagePanel.setMinimumSize(new Dimension(800, 500));
        studentPagePanel.setPreferredSize(new Dimension(800, 500));
        studentPagePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        optionsPanel = new JPanel();
        optionsPanel.setLayout(new BorderLayout(0, 0));
        optionsPanel.setMinimumSize(new Dimension(180, 500));
        optionsPanel.setOpaque(false);
        optionsPanel.setPreferredSize(new Dimension(180, 500));
        studentPagePanel.add(optionsPanel, BorderLayout.WEST);
        optionsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        studentTitlePanel = new JPanel();
        studentTitlePanel.setLayout(new BorderLayout(0, 0));
        studentTitlePanel.setOpaque(false);
        studentTitlePanel.setPreferredSize(new Dimension(180, 115));
        optionsPanel.add(studentTitlePanel, BorderLayout.NORTH);
        studentTitlePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        studentTitle = new JPanel();
        studentTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        studentTitle.setBackground(new Color(-16777072));
        studentTitle.setOpaque(true);
        studentTitle.setPreferredSize(new Dimension(180, 100));
        studentTitlePanel.add(studentTitle, BorderLayout.NORTH);
        studentTitle.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(29, 0, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        studentLbl = new JLabel();
        studentLbl.setBackground(new Color(-16777072));
        Font studentLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 28, studentLbl.getFont());
        if (studentLblFont != null) studentLbl.setFont(studentLblFont);
        studentLbl.setForeground(new Color(-331546));
        studentLbl.setOpaque(false);
        studentLbl.setText("STUDENT");
        studentTitle.add(studentLbl);

        dividerPanel = new JPanel();
        dividerPanel.setLayout(new BorderLayout(0, 0));
        dividerPanel.setBackground(new Color(-16777152));
        dividerPanel.setForeground(new Color(-331546));
        dividerPanel.setPreferredSize(new Dimension(180, 15));
        studentTitlePanel.add(dividerPanel, BorderLayout.SOUTH);
        dividerPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        divider = new JSeparator();
        divider.setForeground(new Color(-331546));
        dividerPanel.add(divider, BorderLayout.CENTER);

        options = new JPanel();
        options.setLayout(new GridBagLayout());
        options.setBackground(new Color(-16777152));
        optionsPanel.add(options, BorderLayout.CENTER);
        options.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$(null, -1, -1, options.getFont()), null));

        viewProfileBtn = new JButton();
        viewProfileBtn.setBackground(new Color(-16777152));
        viewProfileBtn.setContentAreaFilled(true);
        viewProfileBtn.setBorderPainted(true);
        viewProfileBtn.setFocusPainted(false);
        Font viewProfileBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, viewProfileBtn.getFont());
        if (viewProfileBtnFont != null) viewProfileBtn.setFont(viewProfileBtnFont);
        viewProfileBtn.setForeground(new Color(-331546));
        viewProfileBtn.setOpaque(false);
        viewProfileBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        viewProfileBtn.setText("View Profile");
        GridBagConstraints gbc;

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        options.add(viewProfileBtn, gbc);

        dashboardBtn = new JButton();
        dashboardBtn.setBackground(new Color(-16777152));
        dashboardBtn.setContentAreaFilled(true);
        dashboardBtn.setBorderPainted(true);
        dashboardBtn.setFocusPainted(false);
        Font dashboardBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, dashboardBtn.getFont());
        if (dashboardBtnFont != null) dashboardBtn.setFont(dashboardBtnFont);
        dashboardBtn.setForeground(new Color(-331546));
        dashboardBtn.setOpaque(false);
        dashboardBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        dashboardBtn.setText("Teacher List");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20, 0, 20, 0);
        options.add(dashboardBtn, gbc);

        enrollClassBtn = new JButton();
        enrollClassBtn.setBackground(new Color(-16777152));
        enrollClassBtn.setContentAreaFilled(true);
        enrollClassBtn.setBorderPainted(true);
        enrollClassBtn.setFocusPainted(false);
        Font enrollClassBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, enrollClassBtn.getFont());
        if (enrollClassBtnFont != null) enrollClassBtn.setFont(enrollClassBtnFont);
        enrollClassBtn.setForeground(new Color(-331546));
        enrollClassBtn.setOpaque(false);
        enrollClassBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        enrollClassBtn.setText("Enroll Classes");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 50, 0);
        options.add(enrollClassBtn, gbc);

        manageProfile = new JButton();
        manageProfile.setBackground(new Color(-16777152));
        manageProfile.setContentAreaFilled(true);
        manageProfile.setBorderPainted(true);
        manageProfile.setFocusPainted(false);
        Font manageProfileFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, manageProfile.getFont());
        if (manageProfileFont != null) manageProfile.setFont(manageProfileFont);
        manageProfile.setForeground(new Color(-331546));
        manageProfile.setOpaque(false);
        manageProfile.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        manageProfile.setText("Edit Profile");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20, 0, 0, 0);
        options.add(manageProfile, gbc);

        logoutBtn = new JButton();
        logoutBtn.setBackground(new Color(-309904));
        Font logoutBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD | Font.ITALIC, -1, logoutBtn.getFont());
        if (logoutBtnFont != null) logoutBtn.setFont(logoutBtnFont);
        logoutBtn.setForeground(new Color(-331546));
        logoutBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        logoutBtn.setFocusPainted(false);
        logoutBtn.setText("LOGOUT");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 15, 0);
        options.add(logoutBtn, gbc);

        mainStudentPanel = new JPanel();
        mainStudentPanel.setLayout(new BorderLayout(0, 0));
        mainStudentPanel.setOpaque(false);
        studentPagePanel.add(mainStudentPanel, BorderLayout.CENTER);
        mainStudentPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        contentTitlePanel = new JPanel();
        contentTitlePanel.setLayout(new BorderLayout(0, 0));
        contentTitlePanel.setMinimumSize(new Dimension(0, 102));
        contentTitlePanel.setOpaque(false);
        contentTitlePanel.setPreferredSize(new Dimension(0, 102));
        mainStudentPanel.add(contentTitlePanel, BorderLayout.NORTH);
        contentTitlePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        extraPanel = new JPanel();
        extraPanel.setLayout(new FlowLayout());
        extraPanel.setOpaque(false);
        extraPanel.setPreferredSize(new Dimension(200, 0));
        contentTitlePanel.add(extraPanel, BorderLayout.EAST);
        extraPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        enrollBtn = new JButton();

        contentTitleLbl = new JLabel();
        Font contentTitleLblFont = this.$$$getFont$$$("Inter Semi Bold", Font.BOLD, 36, contentTitleLbl.getFont());
        if (contentTitleLblFont != null) contentTitleLbl.setFont(contentTitleLblFont);
        contentTitleLbl.setForeground(new Color(-16777216));
        contentTitlePanel.add(contentTitleLbl, BorderLayout.CENTER);

        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout(0, 0));
        contentPanel.setBackground(new Color(-331546));
        contentPanel.setOpaque(false);
        mainStudentPanel.add(contentPanel, BorderLayout.CENTER);
        contentPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        contentArea = new JTextArea();
        contentArea.setEditable(false);
        Font contentAreaFont = this.$$$getFont$$$("Arial", Font.PLAIN, 12, contentArea.getFont());
        if (contentAreaFont != null) contentArea.setFont(contentAreaFont);
        contentArea.setForeground(new Color(-16777216));
        contentArea.setMargin(new Insets(50, 50, 50, 50));
        contentArea.setOpaque(true);
        contentArea.setBackground(new Color(-331546));
        contentArea.setText("");
        contentArea.setWrapStyleWord(true);
        contentArea.setLineWrap(true);

        scrollBar1 = new JScrollPane(contentArea);
        scrollBar1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollBar1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBar1.setPreferredSize(new Dimension(500, 300));
        scrollBar1.setOpaque(false);
        scrollBar1.setBorder(BorderFactory.createEmptyBorder());
        contentPanel.add(scrollBar1, BorderLayout.CENTER);

        editName = new JButton();
        editGender = new JButton();
        editYear = new JButton();

        applyNameBtn = new JButton();
        applyGenderBtn = new JButton();
        applyPassBtn = new JButton();
        applyYearBtn = new JButton();
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent getRootComponent() {
        return studentPagePanel;
    }

    public void setActionListener(ActionListener listener) {
        viewProfileBtn.addActionListener(listener);
        manageProfile.addActionListener(listener);
        dashboardBtn.addActionListener(listener);
        enrollClassBtn.addActionListener(listener);
        logoutBtn.addActionListener(listener);
        editName.addActionListener(listener);
        editGender.addActionListener(listener);
        editYear.addActionListener(listener);
        applyNameBtn.addActionListener(listener);
        applyGenderBtn.addActionListener(listener);
        applyPassBtn.addActionListener(listener);
        applyYearBtn.addActionListener(listener);
        enrollBtn.addActionListener(listener);
    }

    public void reinitializeContentArea() {
        contentPanel.removeAll();

        contentPanel.setLayout(new BorderLayout(0, 0));
        contentPanel.setOpaque(false);
        mainStudentPanel.add(contentPanel, BorderLayout.CENTER);
        contentPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        contentArea.setEditable(false);
        Font contentAreaFont = this.$$$getFont$$$("Arial", Font.PLAIN, 12, contentArea.getFont());
        if (contentAreaFont != null) contentArea.setFont(contentAreaFont);
        contentArea.setForeground(new Color(-16777216));
        contentArea.setMargin(new Insets(50, 50, 50, 50));
        contentArea.setOpaque(true);
        contentArea.setBackground(new Color(-331546));
        contentArea.setWrapStyleWord(true);
        contentArea.setLineWrap(true);
        contentPanel.add(contentArea, BorderLayout.CENTER);

        scrollBar1 = new JScrollPane(contentArea);
        scrollBar1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollBar1.setPreferredSize(new Dimension(500, 300));
        scrollBar1.setOpaque(false);
        scrollBar1.setBorder(BorderFactory.createEmptyBorder());
        contentPanel.add(scrollBar1, BorderLayout.CENTER);
    }

    public void resetPanel() {
        Font contentTitleLblFont = this.$$$getFont$$$("Inter Semi Bold", Font.BOLD, 36, contentTitleLbl.getFont());
        if (contentTitleLblFont != null) contentTitleLbl.setFont(contentTitleLblFont);
        contentTitleLbl.setForeground(new Color(-16777216));
        contentTitlePanel.add(contentTitleLbl, BorderLayout.CENTER);

        // Clear content area
        contentArea.setText("");

        // Reset panel layout
        contentPanel.removeAll();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(scrollBar1, BorderLayout.CENTER);

        // Refresh the panel
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void updateContentArea(String content) {
        reinitializeContentArea();
        contentArea.setText(content);
    }

    public void updateContentTitle(String newTitle) {
        contentTitleLbl.setText(newTitle);
    }

    public void updateGreeting(String name) {
        contentTitleLbl.setText(" | Welcome, " + name + "!");
    }

    public int showConfirmLogout() {
        return JOptionPane.showConfirmDialog(studentPagePanel, "Are you sure you want to logout?", "CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    public void enroll(String subList) {
        reinitializeContentArea();
        updateContentTitle(" | Available Classes");
        contentArea.setText(subList);

        extraPanel = new JPanel();
        extraPanel.setLayout(new FlowLayout());
        extraPanel.setOpaque(false);
        extraPanel.setPreferredSize(new Dimension(200, 0));
        contentTitlePanel.add(extraPanel, BorderLayout.EAST);
        extraPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(35,0,0,10), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        enrollBtn.setBackground(new Color(-16777152));
        enrollBtn.setContentAreaFilled(true);
        enrollBtn.setBorderPainted(true);
        enrollBtn.setFocusPainted(false);
        Font enrollBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, enrollBtn.getFont());
        if (enrollBtnFont != null) enrollBtn.setFont(enrollBtnFont);
        enrollBtn.setForeground(new Color(-331546));
        enrollBtn.setOpaque(true);
        enrollBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        enrollBtn.setText("ENROLL");
        extraPanel.add(enrollBtn);

        revalidate();
        repaint();
    }

    public void updateForEnroll() {

    }

    public void updateForEditProfile() {
        updateContentTitle(" | Manage Profile");

        contentPanel.removeAll();

        contentPanel.setLayout(new BorderLayout(0, 0));
        contentPanel.setOpaque(false);
        mainStudentPanel.add(contentPanel, BorderLayout.CENTER);
        contentPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        choicePanel = new JPanel();
        choicePanel.setLayout(new FlowLayout());
        choicePanel.setOpaque(false);
        choicePanel.setBorder(BorderFactory.createEmptyBorder(0,0,50,0));
        contentPanel.add(choicePanel, BorderLayout.SOUTH);

        Font editNameFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, editName.getFont());
        if (editNameFont != null) editName.setFont(editNameFont);
        editName.setForeground(Color.BLACK);
        editName.setOpaque(false);
        editName.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        editName.setFocusPainted(false);
        editName.setText("EDIT NAME");
        choicePanel.add(editName);

        Font editGenderfont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, editGender.getFont());
        if (editGenderfont != null) editGender.setFont(editGenderfont);
        editGender.setForeground(Color.BLACK);
        editGender.setOpaque(false);
        editGender.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        editGender.setFocusPainted(false);
        editGender.setText("EDIT GENDER");
        choicePanel.add(editGender);

        Font editYearFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, editYear.getFont());
        if (editYearFont != null) editYear.setFont(editYearFont);
        editYear.setForeground(Color.BLACK);
        editYear.setOpaque(false);
        editYear.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        editYear.setFocusPainted(false);
        editYear.setText("EDIT YEAR");
        choicePanel.add(editYear);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void editNamePanel() {
        if (editContentPanel != null) {
            contentPanel.remove(editContentPanel);
        }

        editContentPanel = new JPanel();
        editContentPanel.setLayout(new FlowLayout());
        editContentPanel.setOpaque(false);
        editContentPanel.setBorder(BorderFactory.createEmptyBorder(100,0,0,0));
        contentPanel.add(editContentPanel, BorderLayout.CENTER);

        newInfoLbl = new JLabel();
        newInfoLbl.setText("NEW FIRST NAME: ");
        Font newNameLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, newInfoLbl.getFont());
        if (newNameLblFont != null) newInfoLbl.setFont(newNameLblFont);
        editContentPanel.add(newInfoLbl);

        newName = new JTextField();
        newName.setColumns(10);
        editContentPanel.add(newName);

        newInfo2Lbl = new JLabel();
        newInfo2Lbl.setText("NEW LAST NAME: ");
        Font newInfo2LblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, newInfo2Lbl.getFont());
        if (newInfo2LblFont != null) newInfo2Lbl.setFont(newInfo2LblFont);
        editContentPanel.add(newInfo2Lbl);

        newName2 = new JTextField();
        newName2.setColumns(10);
        editContentPanel.add(newName2);

        Font applyChangesBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, applyNameBtn.getFont());
        if (applyChangesBtnFont != null) applyNameBtn.setFont(applyChangesBtnFont);
        applyNameBtn.setForeground(Color.red);
        applyNameBtn.setOpaque(false);
        applyNameBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        applyNameBtn.setFocusPainted(false);
        applyNameBtn.setText("APPLY NAME");
        editContentPanel.add(applyNameBtn);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void editGenderPanel() {
        if (editContentPanel != null) {
            contentPanel.remove(editContentPanel);
        }

        editContentPanel = new JPanel();
        editContentPanel.setLayout(new FlowLayout());
        editContentPanel.setOpaque(false);
        editContentPanel.setBorder(BorderFactory.createEmptyBorder(100,0,0,0));
        contentPanel.add(editContentPanel, BorderLayout.CENTER);

        newInfoLbl = new JLabel();
        newInfoLbl.setText("NEW GENDER: ");
        Font newNameLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, newInfoLbl.getFont());
        if (newNameLblFont != null) newInfoLbl.setFont(newNameLblFont);
        editContentPanel.add(newInfoLbl);

        newGender = new JTextField();
        newGender.setColumns(20);
        editContentPanel.add(newGender);

        Font applyChangesBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, applyGenderBtn.getFont());
        if (applyChangesBtnFont != null) applyGenderBtn.setFont(applyChangesBtnFont);
        applyGenderBtn.setForeground(Color.red);
        applyGenderBtn.setOpaque(false);
        applyGenderBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        applyGenderBtn.setFocusPainted(false);
        applyGenderBtn.setText("APPLY GENDER");
        editContentPanel.add(applyGenderBtn);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void editYearPanel(String[] year) {
        if (editContentPanel != null) {
            contentPanel.remove(editContentPanel);
        }

        editContentPanel = new JPanel();
        editContentPanel.setLayout(new FlowLayout());
        editContentPanel.setOpaque(false);
        editContentPanel.setBorder(BorderFactory.createEmptyBorder(100,0,0,0));
        contentPanel.add(editContentPanel, BorderLayout.CENTER);

        newInfoLbl = new JLabel();
        newInfoLbl.setText("NEW YEAR LEVEL: ");
        Font newNameLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, newInfoLbl.getFont());
        if (newNameLblFont != null) newInfoLbl.setFont(newNameLblFont);
        editContentPanel.add(newInfoLbl);

        newYear = new JComboBox<>(year);
        newYear.setBackground(new Color(-2104859));
        editContentPanel.add(newYear);

        Font applyChangesBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, applyYearBtn.getFont());
        if (applyChangesBtnFont != null) applyYearBtn.setFont(applyChangesBtnFont);
        applyYearBtn.setForeground(Color.red);
        applyYearBtn.setOpaque(false);
        applyYearBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        applyYearBtn.setFocusPainted(false);
        applyYearBtn.setText("APPLY YEAR");
        editContentPanel.add(applyYearBtn);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public String getNewFirstName() {
        return newName.getText();
    }

    public String getNewLastName() {
        return newName2.getText();
    }

    public String getNewPassword() {
        return newPass.getText();
    }

    public String getNewGender() {
        return newGender.getText();
    }

    public String getNewYear() {
        return (String) newYear.getSelectedItem();
    }

    public int getYesOption() {
        return JOptionPane.YES_OPTION;
    }

    public int getNoOption() {
        return JOptionPane.NO_OPTION;
    }

    public void setErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(mainStudentPanel, errorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public void setValidMessage(String validMessage) {
        JOptionPane.showMessageDialog(mainStudentPanel, validMessage, "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    }

    public void removeExtraContent() {
        contentTitlePanel.remove(extraPanel);
        contentTitlePanel.revalidate();
        contentTitlePanel.repaint();
    }
}
