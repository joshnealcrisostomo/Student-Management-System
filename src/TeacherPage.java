import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Locale;

/**
 * GUI for the teacher page.
 */
public class TeacherPage extends JPanel {
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
    private JPanel connectPanel, addFriendPanel, acceptRequestPanel;
    private JTextField addFriendFld, acceptReqFld;
    private JTextArea friendListArea, addFriendList, acceptReqList;
    private JButton addBtn, acceptReqBtn, viewFriendsBtn, addFriendBtn, acceptBtn;
    private JLabel addFriendLbl, acceptRedLbl;

    public TeacherPage() {
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
        studentLbl.setText("TEACHER");
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
        dashboardBtn.setText("Student List");

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
        enrollClassBtn.setText("Connect");

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

        viewFriendsBtn = new JButton();
        addFriendBtn = new JButton();
        acceptReqBtn = new JButton();
        acceptBtn = new JButton();
        addBtn = new JButton();
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
        viewFriendsBtn.addActionListener(listener);
        addFriendBtn.addActionListener(listener);
        acceptReqBtn.addActionListener(listener);
        acceptBtn.addActionListener(listener);
        addBtn.addActionListener(listener);
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
        addFriendList.setText("");
        friendListArea.setText("");

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
        editYear.setText("EDIT PROF TYPE");
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

    public void editProfTypePanel(String[] prof) {
        if (editContentPanel != null) {
            contentPanel.remove(editContentPanel);
        }

        editContentPanel = new JPanel();
        editContentPanel.setLayout(new FlowLayout());
        editContentPanel.setOpaque(false);
        editContentPanel.setBorder(BorderFactory.createEmptyBorder(100,0,0,0));
        contentPanel.add(editContentPanel, BorderLayout.CENTER);

        newInfoLbl = new JLabel();
        newInfoLbl.setText("NEW PROF TYPE: ");
        Font newNameLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, newInfoLbl.getFont());
        if (newNameLblFont != null) newInfoLbl.setFont(newNameLblFont);
        editContentPanel.add(newInfoLbl);

        newYear = new JComboBox<>(prof);
        newYear.setBackground(new Color(-2104859));
        editContentPanel.add(newYear);

        Font applyChangesBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, applyYearBtn.getFont());
        if (applyChangesBtnFont != null) applyYearBtn.setFont(applyChangesBtnFont);
        applyYearBtn.setForeground(Color.red);
        applyYearBtn.setOpaque(false);
        applyYearBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        applyYearBtn.setFocusPainted(false);
        applyYearBtn.setText("APPLY PROF TYPE");
        editContentPanel.add(applyYearBtn);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void updateForConnect() {
        updateContentTitle(" | Connect with Teachers");

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

        Font editNameFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, viewFriendsBtn.getFont());
        if (editNameFont != null) viewFriendsBtn.setFont(editNameFont);
        viewFriendsBtn.setForeground(Color.BLACK);
        viewFriendsBtn.setOpaque(false);
        viewFriendsBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        viewFriendsBtn.setFocusPainted(false);
        viewFriendsBtn.setText("View Friends");
        choicePanel.add(viewFriendsBtn);

        Font editGenderfont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, addFriendBtn.getFont());
        if (editGenderfont != null) addFriendBtn.setFont(editGenderfont);
        addFriendBtn.setForeground(Color.BLACK);
        addFriendBtn.setOpaque(false);
        addFriendBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        addFriendBtn.setFocusPainted(false);
        addFriendBtn.setText("Add Friend");
        choicePanel.add(addFriendBtn);

        Font editYearFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, acceptReqBtn.getFont());
        if (editYearFont != null) acceptReqBtn.setFont(editYearFont);
        acceptReqBtn.setForeground(Color.BLACK);
        acceptReqBtn.setOpaque(false);
        acceptReqBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        acceptReqBtn.setFocusPainted(false);
        acceptReqBtn.setText("Friend Requests");
        choicePanel.add(acceptReqBtn);

        contentPanel.revalidate();
        contentPanel.repaint();

    }

    public void updateForFriendList(String friendList) {
        updateContentTitle(" | Friend List");

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

        Font editNameFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, viewFriendsBtn.getFont());
        if (editNameFont != null) viewFriendsBtn.setFont(editNameFont);
        viewFriendsBtn.setForeground(Color.BLACK);
        viewFriendsBtn.setOpaque(false);
        viewFriendsBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        viewFriendsBtn.setFocusPainted(false);
        viewFriendsBtn.setText("View Friends");
        choicePanel.add(viewFriendsBtn);

        Font editGenderfont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, addFriendBtn.getFont());
        if (editGenderfont != null) addFriendBtn.setFont(editGenderfont);
        addFriendBtn.setForeground(Color.BLACK);
        addFriendBtn.setOpaque(false);
        addFriendBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        addFriendBtn.setFocusPainted(false);
        addFriendBtn.setText("Add Friend");
        choicePanel.add(addFriendBtn);

        Font editYearFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, acceptReqBtn.getFont());
        if (editYearFont != null) acceptReqBtn.setFont(editYearFont);
        acceptReqBtn.setForeground(Color.BLACK);
        acceptReqBtn.setOpaque(false);
        acceptReqBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        acceptReqBtn.setFocusPainted(false);
        acceptReqBtn.setText("Friend Requests");
        choicePanel.add(acceptReqBtn);

        connectPanel = new JPanel();
        connectPanel.setLayout(new BorderLayout());
        connectPanel.setOpaque(false);
        connectPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        contentPanel.add(connectPanel, BorderLayout.CENTER);

        friendListArea = new JTextArea();
        friendListArea.setText(friendList);
        friendListArea.setEditable(false);
        Font contentAreaFont = this.$$$getFont$$$("Arial", Font.PLAIN, 12, friendListArea.getFont());
        if (contentAreaFont != null) friendListArea.setFont(contentAreaFont);
        friendListArea.setForeground(new Color(-16777216));
        friendListArea.setMargin(new Insets(30, 50, 50, 50));
        friendListArea.setOpaque(true);
        friendListArea.setBackground(new Color(-331546));
        friendListArea.setWrapStyleWord(true);
        friendListArea.setLineWrap(true);

        scrollBar1 = new JScrollPane(friendListArea);
        scrollBar1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollBar1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBar1.setPreferredSize(new Dimension(500, 300));
        scrollBar1.setOpaque(false);
        scrollBar1.setBorder(BorderFactory.createEmptyBorder());
        connectPanel.add(scrollBar1, BorderLayout.CENTER);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void updateForAddFriend(String friendList) {
        updateContentTitle(" | Add Teacher");

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

        Font editNameFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, viewFriendsBtn.getFont());
        if (editNameFont != null) viewFriendsBtn.setFont(editNameFont);
        viewFriendsBtn.setForeground(Color.BLACK);
        viewFriendsBtn.setOpaque(false);
        viewFriendsBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        viewFriendsBtn.setFocusPainted(false);
        viewFriendsBtn.setText("View Friends");
        choicePanel.add(viewFriendsBtn);

        Font editGenderfont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, addFriendBtn.getFont());
        if (editGenderfont != null) addFriendBtn.setFont(editGenderfont);
        addFriendBtn.setForeground(Color.BLACK);
        addFriendBtn.setOpaque(false);
        addFriendBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        addFriendBtn.setFocusPainted(false);
        addFriendBtn.setText("Add Friend");
        choicePanel.add(addFriendBtn);

        Font editYearFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, acceptReqBtn.getFont());
        if (editYearFont != null) acceptReqBtn.setFont(editYearFont);
        acceptReqBtn.setForeground(Color.BLACK);
        acceptReqBtn.setOpaque(false);
        acceptReqBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        acceptReqBtn.setFocusPainted(false);
        acceptReqBtn.setText("Friend Requests");
        choicePanel.add(acceptReqBtn);

        connectPanel = new JPanel();
        connectPanel.setLayout(new BorderLayout());
        connectPanel.setOpaque(false);
        connectPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        contentPanel.add(connectPanel, BorderLayout.CENTER);

        addFriendPanel = new JPanel();
        addFriendPanel.setLayout(new FlowLayout());
        addFriendPanel.setOpaque(false);
        addFriendPanel.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
        contentPanel.add(addFriendPanel, BorderLayout.NORTH);

        addFriendLbl = new JLabel();
        addFriendLbl.setText("USERNAME: ");
        Font newNameLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, addFriendLbl.getFont());
        if (newNameLblFont != null) addFriendLbl.setFont(newNameLblFont);
        addFriendPanel.add(addFriendLbl);

        addFriendFld = new JTextField();
        addFriendFld.setColumns(20);
        addFriendPanel.add(addFriendFld);

        Font applyChangesBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, addBtn.getFont());
        if (applyChangesBtnFont != null) addBtn.setFont(applyChangesBtnFont);
        addBtn.setForeground(Color.red);
        addBtn.setOpaque(false);
        addBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        addBtn.setFocusPainted(false);
        addBtn.setText("ADD");
        addFriendPanel.add(addBtn);

        friendListArea = new JTextArea();
        friendListArea.setText(friendList);
        friendListArea.setEditable(false);
        Font contentAreaFont = this.$$$getFont$$$("Arial", Font.PLAIN, 12, friendListArea.getFont());
        if (contentAreaFont != null) friendListArea.setFont(contentAreaFont);
        friendListArea.setForeground(new Color(-16777216));
        friendListArea.setMargin(new Insets(30, 50, 50, 50));
        friendListArea.setOpaque(true);
        friendListArea.setBackground(new Color(-331546));
        friendListArea.setWrapStyleWord(true);
        friendListArea.setLineWrap(true);

        scrollBar1 = new JScrollPane(friendListArea);
        scrollBar1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollBar1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBar1.setPreferredSize(new Dimension(500, 300));
        scrollBar1.setOpaque(false);
        scrollBar1.setBorder(BorderFactory.createEmptyBorder());
        connectPanel.add(scrollBar1, BorderLayout.CENTER);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void updateForAcceptReq(String pending) {
        updateContentTitle(" | Friend Requests");

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

        Font editNameFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, viewFriendsBtn.getFont());
        if (editNameFont != null) viewFriendsBtn.setFont(editNameFont);
        viewFriendsBtn.setForeground(Color.BLACK);
        viewFriendsBtn.setOpaque(false);
        viewFriendsBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        viewFriendsBtn.setFocusPainted(false);
        viewFriendsBtn.setText("View Friends");
        choicePanel.add(viewFriendsBtn);

        Font editGenderfont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, addFriendBtn.getFont());
        if (editGenderfont != null) addFriendBtn.setFont(editGenderfont);
        addFriendBtn.setForeground(Color.BLACK);
        addFriendBtn.setOpaque(false);
        addFriendBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        addFriendBtn.setFocusPainted(false);
        addFriendBtn.setText("Add Friend");
        choicePanel.add(addFriendBtn);

        Font editYearFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, acceptReqBtn.getFont());
        if (editYearFont != null) acceptReqBtn.setFont(editYearFont);
        acceptReqBtn.setForeground(Color.BLACK);
        acceptReqBtn.setOpaque(false);
        acceptReqBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        acceptReqBtn.setFocusPainted(false);
        acceptReqBtn.setText("Friend Requests");
        choicePanel.add(acceptReqBtn);

        connectPanel = new JPanel();
        connectPanel.setLayout(new BorderLayout());
        connectPanel.setOpaque(false);
        connectPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        contentPanel.add(connectPanel, BorderLayout.CENTER);

        acceptRequestPanel = new JPanel();
        acceptRequestPanel.setLayout(new FlowLayout());
        acceptRequestPanel.setOpaque(false);
        acceptRequestPanel.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
        contentPanel.add(acceptRequestPanel, BorderLayout.NORTH);

        acceptRedLbl = new JLabel();
        acceptRedLbl.setText("USERNAME: ");
        Font newNameLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, acceptRedLbl.getFont());
        if (newNameLblFont != null) acceptRedLbl.setFont(newNameLblFont);
        acceptRequestPanel.add(acceptRedLbl);

        acceptReqFld = new JTextField();
        acceptReqFld.setColumns(20);
        acceptRequestPanel.add(acceptReqFld);

        Font applyChangesBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, acceptBtn.getFont());
        if (applyChangesBtnFont != null) addBtn.setFont(applyChangesBtnFont);
        acceptBtn.setForeground(Color.red);
        acceptBtn.setOpaque(false);
        acceptBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        acceptBtn.setFocusPainted(false);
        acceptBtn.setText("ACCEPT");
        acceptRequestPanel.add(acceptBtn);

        friendListArea = new JTextArea();
        friendListArea.setText(pending);
        friendListArea.setEditable(false);
        Font contentAreaFont = this.$$$getFont$$$("Arial", Font.PLAIN, 12, friendListArea.getFont());
        if (contentAreaFont != null) friendListArea.setFont(contentAreaFont);
        friendListArea.setForeground(new Color(-16777216));
        friendListArea.setMargin(new Insets(30, 50, 50, 50));
        friendListArea.setOpaque(true);
        friendListArea.setBackground(new Color(-331546));
        friendListArea.setWrapStyleWord(true);
        friendListArea.setLineWrap(true);

        scrollBar1 = new JScrollPane(friendListArea);
        scrollBar1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollBar1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBar1.setPreferredSize(new Dimension(500, 300));
        scrollBar1.setOpaque(false);
        scrollBar1.setBorder(BorderFactory.createEmptyBorder());
        connectPanel.add(scrollBar1, BorderLayout.CENTER);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public String getAddFriend() {
        return addFriendFld.getText();
    }

    public String getAcceptReq() {
        return acceptReqFld.getText();
    }

    public String getNewFirstName() {
        return newName.getText();
    }

    public String getNewLastName() {
        return newName2.getText();
    }

    public String getNewGender() {
        return newGender.getText();
    }

    public String getNewProfType() {
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
