import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Locale;

/**
 * GUI for the admin page.
 */
public class AdminPage extends JPanel {
    private JPanel adminPagePanel;
    private JPanel optionsPanel;
    private JPanel adminTitlePanel;
    private JPanel adminTitle;
    private JPanel dividerPanel;
    private JLabel adminLbl;
    private JPanel options;
    private JButton searchBtn;
    private JButton teacherListBtn;
    private JButton studentListBtn;
    private JButton announceBtn;
    private JButton logoutBtn;
    private JButton manageBtn;
    private JPanel mainAdminPanel;
    private JPanel contentTitlePanel;
    private JPanel searchPanel;
    private JPanel contentPanel;
    private JLabel contentTitleLbl;
    private JTextArea contentArea;
    private JScrollPane scrollBar1;
    private JSeparator divider;
    private JTextField searchFld;
    private JButton enterSearchBtn;
    private JLabel codeLbl, classNameLbl, schedLbl, timeLbl, modeLbl;
    private JComboBox<String> schedules, timeSlots, modalities;
    private JTextField codeFld, classNameFld;
    private JButton addClassBtn;
    private JPanel codePanel, codeCenterPanel, classNamePanel, classNamePanelCenter;
    private JPanel schedTimePanel;
    private JPanel addClassPanel;
    private JPanel modalityPanel;
    private JPanel schedTImeCenterPanel;
    private JButton addBtn;

    public AdminPage() {
        setLayout(new BorderLayout());

        setSize(800, 500);

        designPanel();

        setVisible(true);
    }

    private void designPanel() {
        adminPagePanel = new JPanel();
        adminPagePanel.setLayout(new BorderLayout(0, 0));
        adminPagePanel.setBackground(new Color(-331546));
        adminPagePanel.setMinimumSize(new Dimension(800, 500));
        adminPagePanel.setPreferredSize(new Dimension(800, 500));
        adminPagePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        optionsPanel = new JPanel();
        optionsPanel.setLayout(new BorderLayout(0, 0));
        optionsPanel.setMinimumSize(new Dimension(180, 500));
        optionsPanel.setOpaque(false);
        optionsPanel.setPreferredSize(new Dimension(180, 500));
        adminPagePanel.add(optionsPanel, BorderLayout.WEST);
        optionsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        adminTitlePanel = new JPanel();
        adminTitlePanel.setLayout(new BorderLayout(0, 0));
        adminTitlePanel.setOpaque(false);
        adminTitlePanel.setPreferredSize(new Dimension(180, 115));
        adminTitlePanel.setRequestFocusEnabled(true);
        optionsPanel.add(adminTitlePanel, BorderLayout.NORTH);
        adminTitlePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        adminTitle = new JPanel();
        adminTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        adminTitle.setBackground(new Color(-16777072));
        adminTitle.setMinimumSize(new Dimension(180, 100));
        adminTitle.setOpaque(true);
        adminTitle.setPreferredSize(new Dimension(180, 100));
        adminTitlePanel.add(adminTitle, BorderLayout.NORTH);
        adminTitle.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(25, 0, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        adminLbl = new JLabel();
        Font adminLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 36, adminLbl.getFont());
        if (adminLblFont != null) adminLbl.setFont(adminLblFont);
        adminLbl.setForeground(new Color(-331546));
        adminLbl.setText("ADMIN");
        adminTitle.add(adminLbl);

        dividerPanel = new JPanel();
        dividerPanel.setLayout(new BorderLayout(0, 0));
        dividerPanel.setBackground(new Color(-16777152));
        dividerPanel.setForeground(new Color(-331546));
        dividerPanel.setOpaque(true);
        dividerPanel.setPreferredSize(new Dimension(180, 15));
        adminTitlePanel.add(dividerPanel, BorderLayout.SOUTH);
        dividerPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        divider = new JSeparator();
        divider.setAlignmentY(0.5f);
        divider.setEnabled(true);
        Font dividerFont = this.$$$getFont$$$(null, Font.BOLD, -1, divider.getFont());
        if (dividerFont != null) divider.setFont(dividerFont);
        divider.setForeground(new Color(-331546));
        divider.setOpaque(false);
        divider.setOrientation(0);
        divider.setPreferredSize(new Dimension(0, 3));
        dividerPanel.add(divider, BorderLayout.CENTER);

        options = new JPanel();
        options.setLayout(new GridBagLayout());
        options.setBackground(new Color(-16777152));
        options.setOpaque(true);
        optionsPanel.add(options, BorderLayout.CENTER);
        options.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        searchBtn = new JButton();
        searchBtn.setBackground(new Color(-16777152));
        searchBtn.setBorderPainted(true);
        searchBtn.setContentAreaFilled(true);
        Font searchBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, searchBtn.getFont());
        if (searchBtnFont != null) searchBtn.setFont(searchBtnFont);
        searchBtn.setForeground(new Color(-331546));
        searchBtn.setOpaque(false);
        searchBtn.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        searchBtn.setFocusPainted(false);
        searchBtn.setText("Find Student/Teacher");
        GridBagConstraints gbc;

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        options.add(searchBtn, gbc);

        teacherListBtn = new JButton();
        teacherListBtn.setBackground(new Color(-16777152));
        Font teacherListBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, teacherListBtn.getFont());
        if (teacherListBtnFont != null) teacherListBtn.setFont(teacherListBtnFont);
        teacherListBtn.setForeground(new Color(-331546));
        teacherListBtn.setOpaque(false);
        teacherListBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        teacherListBtn.setFocusPainted(false);
        teacherListBtn.setText("Teacher List");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20, 0, 0, 0);
        options.add(teacherListBtn, gbc);

        studentListBtn = new JButton();
        studentListBtn.setBackground(new Color(-16777152));
        Font studentListBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, studentListBtn.getFont());
        if (studentListBtnFont != null) studentListBtn.setFont(studentListBtnFont);
        studentListBtn.setForeground(new Color(-331546));
        studentListBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        studentListBtn.setFocusPainted(false);
        studentListBtn.setText("Student List");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20, 0, 20, 0);
        options.add(studentListBtn, gbc);

        announceBtn = new JButton();
        announceBtn.setBackground(new Color(-16777152));
        Font announceBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, announceBtn.getFont());
        if (announceBtnFont != null) announceBtn.setFont(announceBtnFont);
        announceBtn.setForeground(new Color(-331546));
        announceBtn.setOpaque(false);
        announceBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        announceBtn.setFocusPainted(false);
        announceBtn.setText("Add Class");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        options.add(announceBtn, gbc);

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
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 15, 0);
        options.add(logoutBtn, gbc);

        manageBtn = new JButton();
        manageBtn.setBackground(new Color(-309904));
        Font manageBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, -1, manageBtn.getFont());
        if (manageBtnFont != null) manageBtn.setFont(manageBtnFont);
        manageBtn.setForeground(new Color(-331546));
        manageBtn.setOpaque(false);
        manageBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        manageBtn.setFocusPainted(false);
        manageBtn.setText("View Log Activity");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 50, 0);
        options.add(manageBtn, gbc);

        mainAdminPanel = new JPanel();
        mainAdminPanel.setLayout(new BorderLayout(0, 0));
        mainAdminPanel.setOpaque(false);
        adminPagePanel.add(mainAdminPanel, BorderLayout.CENTER);
        mainAdminPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        contentTitlePanel = new JPanel();
        contentTitlePanel.setLayout(new BorderLayout(0, 0));
        contentTitlePanel.setOpaque(false);
        contentTitlePanel.setPreferredSize(new Dimension(0, 102));
        contentTitlePanel.setRequestFocusEnabled(true);
        mainAdminPanel.add(contentTitlePanel, BorderLayout.NORTH);
        contentTitlePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        searchPanel.setOpaque(false);
        searchPanel.setPreferredSize(new Dimension(250, 0));
        contentTitlePanel.add(searchPanel, BorderLayout.EAST);
        searchPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(35,0,0,10), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        searchFld = new JTextField();

        enterSearchBtn = new JButton();

        contentTitleLbl = new JLabel();
        Font contentTitleLblFont = this.$$$getFont$$$("Inter Semi Bold", Font.BOLD, 36, contentTitleLbl.getFont());
        if (contentTitleLblFont != null) contentTitleLbl.setFont(contentTitleLblFont);
        contentTitleLbl.setForeground(new Color(-16777216));
        contentTitleLbl.setText("| Welcome, Admin!");
        contentTitlePanel.add(contentTitleLbl, BorderLayout.CENTER);

        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout(0, 0));
        contentPanel.setOpaque(false);
        mainAdminPanel.add(contentPanel, BorderLayout.CENTER);
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
        scrollBar1.setPreferredSize(new Dimension(500, 300));
        scrollBar1.setOpaque(false);
        scrollBar1.setBorder(BorderFactory.createEmptyBorder());
        contentPanel.add(scrollBar1, BorderLayout.CENTER);

        addClassBtn = new JButton();

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
        return adminPagePanel;
    }

    public void setActionListener(ActionListener listener) {
        searchBtn.addActionListener(listener);
        teacherListBtn.addActionListener(listener);
        studentListBtn.addActionListener(listener);
        announceBtn.addActionListener(listener);
        manageBtn.addActionListener(listener);
        logoutBtn.addActionListener(listener);
        enterSearchBtn.addActionListener(listener);
        addClassBtn.addActionListener(listener);
        addBtn.addActionListener(listener);
    }

    public void reinitializeContentArea() {
        contentPanel.removeAll();

        contentPanel.setLayout(new BorderLayout(0, 0));
        contentPanel.setOpaque(false);
        mainAdminPanel.add(contentPanel, BorderLayout.CENTER);
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
        contentTitleLbl.setText("| Welcome, Admin!");
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

    public void search() {
        updateContentTitle("| Finder");

        reinitializeContentArea();

        contentArea.setText("To search:\n\t- Enter the full name of the Teacher or\n\t- Enter the full name/ID of the Student.");

        searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        searchPanel.setOpaque(false);
        searchPanel.setPreferredSize(new Dimension(250, 0));
        contentTitlePanel.add(searchPanel, BorderLayout.EAST);
        searchPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(35,0,0,10), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        searchFld.setBackground(new Color(-2104859));
        searchFld.setColumns(15);
        searchPanel.add(searchFld);

        Font enterSearchBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, enterSearchBtn.getFont());
        if (enterSearchBtnFont != null) enterSearchBtn.setFont(enterSearchBtnFont);
        enterSearchBtn.setForeground(Color.BLACK);
        enterSearchBtn.setOpaque(false);
        enterSearchBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        enterSearchBtn.setFocusPainted(false);
        enterSearchBtn.setText("SEARCH");
        searchPanel.add(enterSearchBtn);

        revalidate();
        repaint();
    }

    public void updateForAddClass(String classCode, String[] scheds, String[] time, String[] mode) {
        updateContentTitle(" | Add Class");

        contentPanel.removeAll();

        contentPanel.setLayout(new BorderLayout(0, 0));
        contentPanel.setOpaque(false);
        mainAdminPanel.add(contentPanel, BorderLayout.CENTER);
        contentPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        codePanel = new JPanel();
        codePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        codePanel.setOpaque(false);
        codePanel.setBorder(BorderFactory.createEmptyBorder(30,50,0,0));
        contentPanel.add(codePanel, BorderLayout.NORTH);

        codeLbl = new JLabel();
        codeLbl.setText("CLASS CODE: ");
        Font codeLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, codeLbl.getFont());
        if (codeLblFont != null) codeLbl.setFont(codeLblFont);
        codePanel.add(codeLbl);

        codeFld = new JTextField();
        codeFld.setColumns(10);
        codeFld.setText(classCode);
        codeFld.setEditable(false);
        codePanel.add(codeFld);

        codeCenterPanel = new JPanel();
        codeCenterPanel.setLayout(new BorderLayout());
        codeCenterPanel.setOpaque(false);
        contentPanel.add(codeCenterPanel, BorderLayout.CENTER);

        classNamePanel = new JPanel();
        classNamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        classNamePanel.setOpaque(false);
        classNamePanel.setBorder(BorderFactory.createEmptyBorder(0,50,0,0));
        codeCenterPanel.add(classNamePanel, BorderLayout.NORTH);

        classNameLbl = new JLabel();
        classNameLbl.setText("CLASS NAME: ");
        Font classNameLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, classNameLbl.getFont());
        if (classNameLblFont != null) classNameLbl.setFont(classNameLblFont);
        classNamePanel.add(classNameLbl);

        classNameFld = new JTextField();
        classNameFld.setColumns(25);
        classNamePanel.add(classNameFld);

        classNamePanelCenter = new JPanel();
        classNamePanelCenter.setLayout(new BorderLayout());
        classNamePanelCenter.setOpaque(false);
        codeCenterPanel.add(classNamePanelCenter, BorderLayout.CENTER);

        schedTimePanel = new JPanel();
        schedTimePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        schedTimePanel.setOpaque(false);
        schedTimePanel.setBorder(BorderFactory.createEmptyBorder(0,50,0,0));
        classNamePanelCenter.add(schedTimePanel, BorderLayout.NORTH);

        schedLbl = new JLabel();
        schedLbl.setText("WEEKLY SCHEDULE: ");
        Font schedLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, schedLbl.getFont());
        if (schedLblFont != null) schedLbl.setFont(schedLblFont);
        schedTimePanel.add(schedLbl);

        schedules = new JComboBox<>(scheds);
        schedules.setBackground(new Color(-2104859));
        schedTimePanel.add(schedules);

        timeLbl = new JLabel();
        timeLbl.setText("  TIME: ");
        Font timeLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, timeLbl.getFont());
        if (timeLblFont != null) timeLbl.setFont(timeLblFont);
        schedTimePanel.add(timeLbl);

        timeSlots = new JComboBox<>(time);
        timeSlots.setBackground(new Color(-2104859));
        schedTimePanel.add(timeSlots);

        schedTImeCenterPanel = new JPanel();
        schedTImeCenterPanel.setLayout(new BorderLayout());
        schedTImeCenterPanel.setOpaque(false);
        classNamePanelCenter.add(schedTImeCenterPanel, BorderLayout.CENTER);

        modalityPanel = new JPanel();
        modalityPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        modalityPanel.setOpaque(false);
        modalityPanel.setBorder(BorderFactory.createEmptyBorder(0,50,0,0));
        schedTImeCenterPanel.add(modalityPanel, BorderLayout.NORTH);

        modeLbl = new JLabel();
        modeLbl.setText("MODALITY: ");
        Font modeLblFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, modeLbl.getFont());
        if (modeLblFont != null) modeLbl.setFont(modeLblFont);
        modalityPanel.add(modeLbl);

        modalities = new JComboBox<>(mode);
        modalities.setBackground(new Color(-2104859));
        modalityPanel.add(modalities);

        addClassPanel = new JPanel();
        addClassPanel.setLayout(new FlowLayout());
        addClassPanel.setBorder(BorderFactory.createEmptyBorder(0,0,100,0));
        addClassPanel.setOpaque(false);
        contentPanel.add(addClassPanel, BorderLayout.SOUTH);

        Font addClassBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, addClassBtn.getFont());
        if (addClassBtnFont != null) addClassBtn.setFont(addClassBtnFont);
        addClassBtn.setForeground(Color.BLACK);
        addClassBtn.setOpaque(false);
        addClassBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        addClassBtn.setFocusPainted(false);
        addClassBtn.setText("ADD CLASS");
        addClassPanel.add(addClassBtn);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void addAddBtn() {
        removeSearchBar();

        searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        searchPanel.setOpaque(false);
        searchPanel.setPreferredSize(new Dimension(250, 0));
        contentTitlePanel.add(searchPanel, BorderLayout.EAST);
        searchPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(35,0,0,10), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        Font addBtnFont = this.$$$getFont$$$("Microsoft Sans Serif", Font.BOLD, 12, addBtn.getFont());
        if (addBtnFont != null) addBtn.setFont(addBtnFont);
        addBtn.setForeground(Color.BLACK);
        addBtn.setOpaque(false);
        addBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        addBtn.setFocusPainted(false);
        addBtn.setText("   ADD   ");
        searchPanel.add(addBtn);

        contentTitlePanel.revalidate();
        contentTitlePanel.repaint();
        searchPanel.revalidate();
        searchPanel.repaint();
    }

    public void updateContentArea(String content) {
        reinitializeContentArea();
        contentArea.setText(content);
    }

    public void updateContentTitle(String newTitle) {
        contentTitleLbl.setText(newTitle);
    }

    public void clearSearchFld() {
        searchFld.setText("");
    }

    public String getSearch() {
        return searchFld.getText();
    }

    public int showConfirmLogout() {
        return JOptionPane.showConfirmDialog(adminPagePanel, "Are you sure you want to logout?", "CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    public int getYesOption() {
        return JOptionPane.YES_OPTION;
    }

    public int getNoOption() {
        return JOptionPane.NO_OPTION;
    }

    public void setErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(mainAdminPanel, errorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public void setValidMessage(String validMessage) {
        JOptionPane.showMessageDialog(mainAdminPanel, validMessage, "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    }

    public void removeSearchBar() {
        contentTitlePanel.remove(searchPanel);
        contentTitlePanel.revalidate();
        contentTitlePanel.repaint();
    }

    public String getClassCode() {
        return codeFld.getText();
    }

    public String getClassName() {
        return classNameFld.getText();
    }

    public String getSched() {
        return (String) schedules.getSelectedItem();
    }

    public String getTime() {
        return (String) timeSlots.getSelectedItem();
    }

    public String getModality() {
        return (String) modalities.getSelectedItem();
    }
}
