import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class CustomerFeedbackSystem extends JFrame {

    private JTextField nameField, emailField;
    private JTextArea feedbackArea;
    private JComboBox<String> ratingBox;
    private JRadioButton recommendYes, recommendNo;
    private ButtonGroup recommendGroup;
    private JButton submitBtn, clearBtn;
    private JTable resultsTable;
    private DefaultTableModel tableModel;
    private JLabel avgRatingLabel;

    public CustomerFeedbackSystem() {
        setTitle("Customer Feedback System (Applet-Style GUI)");
        setSize(800, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init(); // Mimics Applet's init() lifecycle method
    }

    // ===== init() - mirrors Applet lifecycle method =====
    public void init() {
        setLayout(new BorderLayout(10, 10));

        // ===== Input Form Panel (GridLayout) =====
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 8, 8));
        formPanel.setBorder(BorderFactory.createTitledBorder("Customer Feedback Form"));

        formPanel.add(new JLabel("Customer Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Email Address:"));
        emailField = new JTextField();
        formPanel.add(emailField);

        formPanel.add(new JLabel("Rating (1-5):"));
        ratingBox = new JComboBox<>(new String[]{"5 - Excellent", "4 - Good", "3 - Average",
                "2 - Poor", "1 - Very Poor"});
        formPanel.add(ratingBox);

        formPanel.add(new JLabel("Would you recommend us?"));
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        recommendYes = new JRadioButton("Yes");
        recommendNo = new JRadioButton("No");
        recommendGroup = new ButtonGroup();
        recommendGroup.add(recommendYes);
        recommendGroup.add(recommendNo);
        radioPanel.add(recommendYes);
        radioPanel.add(recommendNo);
        formPanel.add(radioPanel);

        formPanel.add(new JLabel("Comments:"));
        feedbackArea = new JTextArea(3, 20);
        feedbackArea.setLineWrap(true);
        JScrollPane areaScroll = new JScrollPane(feedbackArea);
        formPanel.add(areaScroll);

        // ===== Button Panel (FlowLayout) =====
        JPanel buttonPanel = new JPanel(new FlowLayout());
        submitBtn = new JButton("Submit Feedback");
        clearBtn = new JButton("Clear Form");
        buttonPanel.add(submitBtn);
        buttonPanel.add(clearBtn);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(formPanel, BorderLayout.CENTER);
        topPanel.add(buttonPanel, BorderLayout.SOUTH);

        // ===== Results Table =====
        String[] columns = {"Name", "Rating", "Recommend", "Comments"};
        tableModel = new DefaultTableModel(columns, 0);
        resultsTable = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(resultsTable);
        tableScroll.setBorder(BorderFactory.createTitledBorder("Submitted Feedback (Dynamic Display)"));

        avgRatingLabel = new JLabel("  Average Rating: N/A");
        avgRatingLabel.setFont(new Font("Arial", Font.BOLD, 14));

        add(topPanel, BorderLayout.NORTH);
        add(tableScroll, BorderLayout.CENTER);
        add(avgRatingLabel, BorderLayout.SOUTH);

        // ===== Event Handling =====
        submitBtn.addActionListener(new SubmitListener());
        clearBtn.addActionListener(e -> clearForm());
    }

    // ===== Submit Listener =====
    class SubmitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!validateForm()) return;

            String rating = ratingBox.getSelectedItem().toString();
            String recommend = recommendYes.isSelected() ? "Yes" : "No";

            tableModel.addRow(new Object[]{
                    nameField.getText().trim(),
                    rating.substring(0, 1), // store just the number
                    recommend,
                    feedbackArea.getText().trim()
            });

            updateAverageRating();
            JOptionPane.showMessageDialog(CustomerFeedbackSystem.this,
                    "Thank you for your feedback!");
            clearForm();
        }
    }

    // ===== Dynamic Update of Average Rating =====
    private void updateAverageRating() {
        int total = 0;
        int count = tableModel.getRowCount();
        for (int i = 0; i < count; i++) {
            total += Integer.parseInt(tableModel.getValueAt(i, 1).toString());
        }
        double avg = count == 0 ? 0 : (double) total / count;
        avgRatingLabel.setText(String.format("  Average Rating: %.2f / 5  (%d responses)", avg, count));
    }

    // ===== Validation =====
    private boolean validateForm() {
        if (nameField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name is required!", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String email = emailField.getText().trim();
        if (email.isEmpty() || !email.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Enter a valid email address!", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!recommendYes.isSelected() && !recommendNo.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select Yes/No for recommendation!",
                    "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (feedbackArea.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your comments!", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void clearForm() {
        nameField.setText("");
        emailField.setText("");
        feedbackArea.setText("");
        ratingBox.setSelectedIndex(0);
        recommendGroup.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomerFeedbackSystem frame = new CustomerFeedbackSystem();
            frame.setVisible(true);
        });
    }
}

/*
============================================================
EVALUATION NOTES (BL5 - Evaluate)
============================================================

1. LIMITATIONS OF APPLET TECHNOLOGY IN MODERN APPLICATIONS:

   a) Browser Compatibility:
      - All major browsers (Chrome since v45, Firefox, Edge, Safari)
        REMOVED support for NPAPI plugins, which Java Applets depended
        on to run inside a browser tab. Applets simply cannot run in
        any modern browser without a legacy/unsupported plugin.

   b) Security Issues:
      - Applets ran with access to the local JVM sandbox, but had a
        long history of critical security vulnerabilities (sandbox
        escape exploits), leading Oracle itself to deprecate the
        technology (deprecated in Java 9, removed in Java 11+ from
        the JDK entirely as java.applet.Applet, fully gone by Java 17).
      - No code-signing model was strong enough to keep user trust
        as browsers moved toward stricter sandboxing (e.g., JavaScript-
        only execution models).

   c) Performance & Maintenance:
      - Required a separate JVM startup inside the browser causing
        slow load times compared to native JS/HTML rendering.
      - No ongoing support/updates from Oracle - a dead technology
        for any new project.

2. EVALUATION OF CHOSEN UI DESIGN:
   - GridLayout(6,2) for the form ensures clean label-field pairing,
     suitable for a structured survey form.
   - FlowLayout for buttons and radio buttons allows natural,
     left-aligned grouping that adapts to different screen widths.
   - BorderLayout as the outer container lets the results table
     occupy the most space (CENTER), which is appropriate since
     viewing aggregated feedback is the dashboard's main purpose.
   - DocumentListener-free design here is intentional - feedback
     submission is event-driven (button click) rather than live-type,
     which matches a "review before submit" UX pattern, better for
     formal feedback forms.

3. MODERN ALTERNATIVES (Recommended Replacements):
   - Web-based: React / Angular / Vue frontend with a REST API
     backend (Spring Boot) - works in any modern browser, no plugin
     needed, fully responsive on mobile too.
   - Desktop alternative: JavaFX (Oracle's official Swing/AWT
     successor) offers richer UI controls, CSS styling, and better
     performance than Swing while still being a native Java desktop app.
   - Cross-platform: Electron (JS) or Flutter Desktop for a modern
     look-and-feel with a single codebase across OS platforms.

   CONCLUSION: For any new system, Applet technology should NOT be
   used. A Spring Boot + React web app (or JavaFX desktop app if a
   pure Java desktop solution is mandatory) is the recommended
   modern replacement, offering better security, compatibility, and
   long-term maintainability.
============================================================
*/