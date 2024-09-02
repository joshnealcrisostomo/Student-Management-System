import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Locale;

/**
 * GUI for the main menu.
 */
public class HomePage extends JPanel {
    private JPanel HomeAndLoginPanel;
    private JPanel optionsBasePanel;
    private JPanel imagePanel;
    private JPanel titlePanel;
    private JLabel titleLbl;
    private JPanel optionsPanel;
    private JLabel title2Panel;
    private JPanel titleTwoPanel;
    private JPanel dividerPanel;
    private JSeparator divider;
    private JPanel btnChoicesPanel;
    private JButton adminBtn;
    private JButton teacherBtn;
    private JButton studentBtn;
    private JButton quitBtn;
    private JPanel dividePanel;
    private JPanel homeLblPanel;
    private JLabel homeLbl;

    public HomePage() {
        setLayout(new BorderLayout());

        setSize(800, 500);

        designPanel();

        setVisible(true);
    }

    private void insertImage() {
        // Load the image
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/SMS-Logo.png"));

        // Scale the image to fit within the panel (adjust dimensions as needed)
        Image image = imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH); // Example size 100x100
        imageIcon = new ImageIcon(image);

        // Create a JLabel with the scaled image
        JLabel imageLabel = new JLabel(imageIcon);

        // Clear any previous components in imagePanel (optional, but helps avoid duplicates)
        imagePanel.removeAll();
        imagePanel.setBackground(new Color(-331546));

        // Add the image label to the image panel
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        imagePanel.revalidate();
        imagePanel.repaint();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void designPanel() {
        HomeAndLoginPanel = new JPanel();
        HomeAndLoginPanel.setLayout(new BorderLayout(0, 0));
        HomeAndLoginPanel.setBackground(new Color(-331546));
        HomeAndLoginPanel.setEnabled(true);
        HomeAndLoginPanel.setMaximumSize(new Dimension(800, 500));
        HomeAndLoginPanel.setMinimumSize(new Dimension(800, 500));
        HomeAndLoginPanel.setPreferredSize(new Dimension(800, 500));

        optionsBasePanel = new JPanel();
        optionsBasePanel.setLayout(new BorderLayout(0, 0));
        optionsBasePanel.setOpaque(false);
        optionsBasePanel.setPreferredSize(new Dimension(400, 0));
        HomeAndLoginPanel.add(optionsBasePanel, BorderLayout.WEST);
        optionsBasePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(20, 5, 20, 5), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        titlePanel.setBackground(new Color(-4604993));
        titlePanel.setMinimumSize(new Dimension(400, 200));
        titlePanel.setOpaque(false);
        optionsBasePanel.add(titlePanel, BorderLayout.NORTH);
        titlePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.getFont(null, -1, -1, titlePanel.getFont()), null));

        titleLbl = new JLabel();
        Font titleLblFont = this.getFont("Microsoft Sans Serif", Font.BOLD, 22, titleLbl.getFont());
        if (titleLblFont != null) titleLbl.setFont(titleLblFont);
        titleLbl.setForeground(Color.decode("#FB4570"));
        titleLbl.setText("STUDENT MANAGEMENT");
        titlePanel.add(titleLbl);

        optionsPanel = new JPanel();
        optionsPanel.setLayout(new BorderLayout(0, 0));
        optionsPanel.setOpaque(false);
        optionsBasePanel.add(optionsPanel, BorderLayout.CENTER);
        optionsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        titleTwoPanel = new JPanel();
        titleTwoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        titleTwoPanel.setOpaque(false);
        optionsPanel.add(titleTwoPanel, BorderLayout.NORTH);
        titleTwoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        title2Panel = new JLabel();

        Font title2PanelFont = this.getFont("Microsoft Sans Serif", Font.BOLD, 22, title2Panel.getFont());
        if (title2PanelFont != null) title2Panel.setFont(title2PanelFont);
        title2Panel.setForeground(Color.decode("#FB4570"));
        title2Panel.setOpaque(false);
        title2Panel.setText("SYSTEM");
        titleTwoPanel.add(title2Panel);

        dividerPanel = new JPanel();
        dividerPanel.setLayout(new BorderLayout(0, 0));
        dividerPanel.setOpaque(false);
        optionsPanel.add(dividerPanel, BorderLayout.CENTER);
        dividerPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(29, 0, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        dividePanel = new JPanel();
        dividePanel.setLayout(new BorderLayout(0,0));
        dividePanel.setOpaque(false);
        dividerPanel.add(dividePanel, BorderLayout.NORTH);
        dividePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        divider = new JSeparator();
        divider.setForeground(new Color(-16777216));
        divider.setInheritsPopupMenu(false);
        divider.setMinimumSize(new Dimension(1, 1));
        divider.setPreferredSize(new Dimension(0, 3));
        dividePanel.add(divider, BorderLayout.NORTH);

        homeLblPanel = new JPanel();
        homeLblPanel.setLayout(new FlowLayout());
        homeLblPanel.setOpaque(false);
        dividePanel.add(homeLblPanel, BorderLayout.SOUTH);
        homeLblPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        homeLbl = new JLabel();
        homeLbl.setText("HOME");
        Font homeLblFont = this.getFont("Microsoft Sans Serif", Font.BOLD, 12, homeLbl.getFont());
        if (homeLblFont != null) homeLbl.setFont(homeLblFont);
        homeLblPanel.add(homeLbl);

        btnChoicesPanel = new JPanel();
        btnChoicesPanel.setLayout(new GridBagLayout());
        btnChoicesPanel.setOpaque(false);
        dividerPanel.add(btnChoicesPanel, BorderLayout.CENTER);
        btnChoicesPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

        adminBtn = new JButton();
        adminBtn.setBackground(Color.decode("#000040"));
        adminBtn.setBorderPainted(true);
        adminBtn.setContentAreaFilled(true);
        Font adminBtnFont = this.getFont("Microsoft Sans Serif", Font.PLAIN, 12, adminBtn.getFont());
        if (adminBtnFont != null) adminBtn.setFont(adminBtnFont);
        adminBtn.setForeground(new Color(-331546));
        adminBtn.setOpaque(true);
        adminBtn.setPreferredSize(new Dimension(108, 30));
        adminBtn.setSelected(false);
        adminBtn.setText("Admin");
        GridBagConstraints gbc;

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 30, 0);
        btnChoicesPanel.add(adminBtn, gbc);

        teacherBtn = new JButton();
        teacherBtn.setBackground(Color.decode("#000040"));
        Font teacherBtnFont = this.getFont("Microsoft Sans Serif", Font.PLAIN, 12, teacherBtn.getFont());
        if (teacherBtnFont != null) teacherBtn.setFont(teacherBtnFont);
        teacherBtn.setForeground(new Color(-331546));
        teacherBtn.setOpaque(true);
        teacherBtn.setPreferredSize(new Dimension(69, 30));
        teacherBtn.setText("Teacher");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 30, 0);
        btnChoicesPanel.add(teacherBtn, gbc);

        studentBtn = new JButton();
        studentBtn.setBackground(Color.decode("#000040"));
        Font studentBtnFont = this.getFont("Microsoft Sans Serif", Font.PLAIN, 12, studentBtn.getFont());
        if (studentBtnFont != null) studentBtn.setFont(studentBtnFont);
        studentBtn.setForeground(new Color(-331546));
        studentBtn.setPreferredSize(new Dimension(71, 30));
        studentBtn.setText("Student");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 30, 0);
        btnChoicesPanel.add(studentBtn, gbc);

        quitBtn = new JButton();
        quitBtn.setBackground(new Color(-5103070));
        Font quitBtnFont = this.getFont("Microsoft Sans Serif", Font.PLAIN, 12, quitBtn.getFont());
        if (quitBtnFont != null) quitBtn.setFont(quitBtnFont);
        quitBtn.setForeground(new Color(-331546));
        quitBtn.setPreferredSize(new Dimension(149, 30));
        quitBtn.setText("Quit");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        btnChoicesPanel.add(quitBtn, gbc);

        imagePanel = new JPanel();
        imagePanel.setLayout(new BorderLayout(0, 0));

        HomeAndLoginPanel.add(imagePanel, BorderLayout.EAST);

        insertImage();
    }

    /**
     * @noinspection ALL
     */
    private Font getFont(String fontName, int style, int size, Font currentFont) {
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
        return HomeAndLoginPanel;
    }

    public void setActionListener(ActionListener listener) {
        adminBtn.addActionListener(listener);
        teacherBtn.addActionListener(listener);
        studentBtn.addActionListener(listener);
        quitBtn.addActionListener(listener);
    }
}