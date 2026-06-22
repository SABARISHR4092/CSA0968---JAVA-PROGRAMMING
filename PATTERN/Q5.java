import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class TicketBookingSystem extends JFrame {

    private static final int ROWS = 5;
    private static final int COLS = 8;
    private JButton[][] seatButtons = new JButton[ROWS][COLS];
    private Set<String> bookedSeats = new HashSet<>();
    private Set<String> selectedSeats = new HashSet<>();

    private JTextField nameField, phoneField;
    private JLabel selectedSeatsLabel, totalLabel;
    private static final double PRICE_PER_SEAT = 250.00;

    private DefaultTableModel bookingTableModel;

    public TicketBookingSystem() {
        setTitle("Ticket Booking System - Seat Selection");
        setSize(750, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // ===== Menu Bar =====
        JMenuBar menuBar = new JMenuBar();
        JMenu bookingMenu = new JMenu("Booking");
        JMenuItem viewBookings = new JMenuItem("View All Bookings");
        JMenuItem exitItem = new JMenuItem("Exit");
        viewBookings.addActionListener(e -> openBookingHistoryWindow());
        exitItem.addActionListener(e -> System.exit(0));
        bookingMenu.add(viewBookings);
        bookingMenu.add(exitItem);
        menuBar.add(bookingMenu);
        setJMenuBar(menuBar);

        // ===== Screen Label =====
        JLabel screenLabel = new JLabel("SCREEN THIS WAY", SwingConstants.CENTER);
        screenLabel.setOpaque(true);
        screenLabel.setBackground(Color.DARK_GRAY);
        screenLabel.setForeground(Color.WHITE);
        screenLabel.setFont(new Font("Arial", Font.BOLD, 14));
        screenLabel.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));

        // ===== Seat Grid Panel (GridLayout) =====
        JPanel seatPanel = new JPanel(new GridLayout(ROWS, COLS, 5, 5));
        seatPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                String seatId = (char) ('A' + r) + String.valueOf(c + 1);
                JButton seatBtn = new JButton(seatId);
                seatBtn.setBackground(new Color(144, 238, 144)); // Available - light green
                seatBtn.setFont(new Font("Arial", Font.PLAIN, 10));
                seatBtn.addActionListener(new SeatClickListener(seatId, seatBtn));
                seatButtons[r][c] = seatBtn;
                seatPanel.add(seatBtn);
            }
        }

        // ===== Legend Panel (FlowLayout) =====
        JPanel legendPanel = new JPanel(new FlowLayout());
        legendPanel.add(makeLegendLabel("Available", new Color(144, 238, 144)));
        legendPanel.add(makeLegendLabel("Selected", Color.YELLOW));
        legendPanel.add(makeLegendLabel("Booked", Color.RED));

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(screenLabel, BorderLayout.NORTH);
        topPanel.add(seatPanel, BorderLayout.CENTER);
        topPanel.add(legendPanel, BorderLayout.SOUTH);

        // ===== Customer Details + Confirm/Cancel Panel =====
        JPanel detailsPanel = new JPanel(new GridLayout(2, 2, 8, 8));
        detailsPanel.setBorder(BorderFactory.createTitledBorder("Customer Details"));
        detailsPanel.add(new JLabel("Customer Name:"));
        nameField = new JTextField();
        detailsPanel.add(nameField);
        detailsPanel.add(new JLabel("Phone Number:"));
        phoneField = new JTextField();
        detailsPanel.add(phoneField);

        selectedSeatsLabel = new JLabel("Selected Seats: None");
        totalLabel = new JLabel("Total: ₹0.00");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        infoPanel.add(selectedSeatsLabel);
        infoPanel.add(totalLabel);

        JButton confirmBtn = new JButton("Confirm Booking");
        JButton cancelBtn = new JButton("Cancel Selection");
        JPanel actionPanel = new JPanel(new FlowLayout());
        actionPanel.add(confirmBtn);
        actionPanel.add(cancelBtn);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(detailsPanel, BorderLayout.NORTH);
        bottomPanel.add(infoPanel, BorderLayout.CENTER);
        bottomPanel.add(actionPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // ===== Booking history table model (shared with second window) =====
        String[] columns = {"Customer Name", "Phone", "Seats", "Total Amount (Rs)", "Status"};
        bookingTableModel = new DefaultTableModel(columns, 0);

        confirmBtn.addActionListener(new ConfirmBookingListener());
        cancelBtn.addActionListener(e -> resetSelection());
    }

    private JLabel makeLegendLabel(String text, Color color) {
        JLabel label = new JLabel(" " + text + " ");
        label.setOpaque(true);
        label.setBackground(color);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return label;
    }

    // ===== Seat Click Event Handler =====
    class SeatClickListener implements ActionListener {
        private String seatId;
        private JButton button;

        SeatClickListener(String seatId, JButton button) {
            this.seatId = seatId;
            this.button = button;
        }

        public void actionPerformed(ActionEvent e) {
            if (bookedSeats.contains(seatId)) {
                JOptionPane.showMessageDialog(TicketBookingSystem.this,
                        "Seat " + seatId + " is already booked!", "Unavailable",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (selectedSeats.contains(seatId)) {
                selectedSeats.remove(seatId);
                button.setBackground(new Color(144, 238, 144));
            } else {
                selectedSeats.add(seatId);
                button.setBackground(Color.YELLOW);
            }
            updateSelectionInfo();
        }
    }

    private void updateSelectionInfo() {
        if (selectedSeats.isEmpty()) {
            selectedSeatsLabel.setText("Selected Seats: None");
        } else {
            java.util.List<String> sorted = new ArrayList<>(selectedSeats);
            Collections.sort(sorted);
            selectedSeatsLabel.setText("Selected Seats: " + String.join(", ", sorted));
        }
        double total = selectedSeats.size() * PRICE_PER_SEAT;
        totalLabel.setText(String.format("Total: Rs %.2f", total));
    }

    // ===== Confirm Booking Listener =====
    class ConfirmBookingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (selectedSeats.isEmpty()) {
                JOptionPane.showMessageDialog(TicketBookingSystem.this,
                        "Please select at least one seat!", "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nameField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(TicketBookingSystem.this,
                        "Customer name is required!", "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            String phone = phoneField.getText().trim();
            if (!phone.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(TicketBookingSystem.this,
                        "Enter a valid 10-digit phone number!", "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                openConfirmationWindow();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(TicketBookingSystem.this,
                        "An error occurred while processing booking: " + ex.getMessage(),
                        "Booking Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // ===== Second Window: Booking Confirmation (Modal Dialog) =====
    private void openConfirmationWindow() {
        JDialog confirmDialog = new JDialog(this, "Booking Confirmation", true);
        confirmDialog.setSize(400, 300);
        confirmDialog.setLocationRelativeTo(this);
        confirmDialog.setLayout(new BorderLayout(10, 10));

        java.util.List<String> sorted = new ArrayList<>(selectedSeats);
        Collections.sort(sorted);
        double total = selectedSeats.size() * PRICE_PER_SEAT;

        JTextArea summary = new JTextArea();
        summary.setEditable(false);
        summary.setText(
                "======== BOOKING SUMMARY ========\n\n" +
                        "Customer Name : " + nameField.getText().trim() + "\n" +
                        "Phone Number  : " + phoneField.getText().trim() + "\n" +
                        "Seats Booked  : " + String.join(", ", sorted) + "\n" +
                        "No. of Seats  : " + selectedSeats.size() + "\n" +
                        "Total Amount  : Rs " + String.format("%.2f", total) + "\n\n" +
                        "==================================\n" +
                        "Click CONFIRM to finalize booking."
        );
        summary.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel btnPanel = new JPanel(new FlowLayout());
        JButton confirmFinalBtn = new JButton("Confirm");
        JButton backBtn = new JButton("Go Back");
        btnPanel.add(confirmFinalBtn);
        btnPanel.add(backBtn);

        confirmDialog.add(new JScrollPane(summary), BorderLayout.CENTER);
        confirmDialog.add(btnPanel, BorderLayout.SOUTH);

        confirmFinalBtn.addActionListener(e -> {
            for (String seat : selectedSeats) {
                bookedSeats.add(seat);
                markSeatBooked(seat);
            }
            bookingTableModel.addRow(new Object[]{
                    nameField.getText().trim(), phoneField.getText().trim(),
                    String.join(", ", sorted), String.format("%.2f", total), "Confirmed"
            });

            confirmDialog.dispose();
            JOptionPane.showMessageDialog(this, "Booking Confirmed! Enjoy your show.");
            resetSelection();
            nameField.setText("");
            phoneField.setText("");
        });

        backBtn.addActionListener(e -> confirmDialog.dispose());

        confirmDialog.setVisible(true);
    }

    // ===== Third Window: Booking History (Menu-triggered, independent JFrame) =====
    private void openBookingHistoryWindow() {
        JFrame historyFrame = new JFrame("All Bookings - History");
        historyFrame.setSize(600, 350);
        historyFrame.setLocationRelativeTo(this);
        historyFrame.setLayout(new BorderLayout());

        JTable historyTable = new JTable(bookingTableModel);
        historyFrame.add(new JScrollPane(historyTable), BorderLayout.CENTER);

        JButton closeBtn = new JButton("Close");
        closeBtn.addActionListener(e -> historyFrame.dispose());
        JPanel btnPanel = new JPanel(new FlowLayout());
        btnPanel.add(closeBtn);
        historyFrame.add(btnPanel, BorderLayout.SOUTH);

        historyFrame.setVisible(true);
    }

    private void markSeatBooked(String seatId) {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                String id = (char) ('A' + r) + String.valueOf(c + 1);
                if (id.equals(seatId)) {
                    seatButtons[r][c].setBackground(Color.RED);
                    seatButtons[r][c].setEnabled(false);
                }
            }
        }
    }

    private void resetSelection() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                String id = (char) ('A' + r) + String.valueOf(c + 1);
                if (!bookedSeats.contains(id)) {
                    seatButtons[r][c].setBackground(new Color(144, 238, 144));
                }
            }
        }
        selectedSeats.clear();
        updateSelectionInfo();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicketBookingSystem frame = new TicketBookingSystem();
            frame.setVisible(true);
        });
    }
}

