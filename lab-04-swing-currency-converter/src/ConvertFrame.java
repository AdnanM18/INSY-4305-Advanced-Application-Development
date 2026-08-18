import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertFrame extends JFrame implements ActionListener {
    private JMenu fileMenu;
    private JMenuItem aboutItem, exitItem;
    private JTextField inputField, outputField;
    private ButtonGroup fromButtonGroup, toButtonGroup;
    private JRadioButton usdFrom, pesoFrom, euroFrom, usdTo, pesoTo, euroTo;
    private JButton convertButton, clearButton, exitButton;

    public ConvertFrame() {
        super("Currency Conversion");

        // Set up the menu
        fileMenu = new JMenu("File");
        aboutItem = new JMenuItem("About");
        exitItem = new JMenuItem("Exit");

        fileMenu.add(aboutItem);
        fileMenu.add(exitItem);

        JMenuBar bar = new JMenuBar();
        bar.add(fileMenu);
        setJMenuBar(bar);

        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(
                this,
                "Currency Conversion Program\nINSY 4305 – Advanced Application Development",
                "About",
                JOptionPane.INFORMATION_MESSAGE
        ));

        exitItem.addActionListener(e -> confirmExit());

        // Set up labels
        JLabel labelFrom = new JLabel("Convert from: ");
        JLabel labelTo = new JLabel("Convert to: ");
        JLabel labelComp = new JLabel("Comparable Currency is: ");

        // Load and resize icons
        Icon dollarIcon = resizeIcon(new ImageIcon("assets/dollar.jpg"), 40, 40);
        Icon pesoIcon = resizeIcon(new ImageIcon("assets/peso.jpg"), 40, 40);
        Icon euroIcon = resizeIcon(new ImageIcon("assets/euro.jpg"), 40, 40);

        // Radio buttons for "Convert from" section
        usdFrom = new JRadioButton("US Dollar");
        pesoFrom = new JRadioButton("Mexican Peso");
        euroFrom = new JRadioButton("Euro");

        fromButtonGroup = new ButtonGroup();
        fromButtonGroup.add(usdFrom);
        fromButtonGroup.add(pesoFrom);
        fromButtonGroup.add(euroFrom);

        // "Convert from" panel with GridBagLayout for alignment
        JPanel fromPanel = new JPanel(new GridBagLayout());
        fromPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));  // Add padding
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // Set spacing between components

        gbc.gridx = 0;
        gbc.gridy = 0;
        fromPanel.add(new JLabel(dollarIcon), gbc);
        gbc.gridy = 1;
        fromPanel.add(usdFrom, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        fromPanel.add(new JLabel(pesoIcon), gbc);
        gbc.gridy = 1;
        fromPanel.add(pesoFrom, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        fromPanel.add(new JLabel(euroIcon), gbc);
        gbc.gridy = 1;
        fromPanel.add(euroFrom, gbc);

        // Radio buttons for "Convert to" section
        usdTo = new JRadioButton("US Dollar");
        pesoTo = new JRadioButton("Mexican Peso");
        euroTo = new JRadioButton("Euro");

        toButtonGroup = new ButtonGroup();
        toButtonGroup.add(usdTo);
        toButtonGroup.add(pesoTo);
        toButtonGroup.add(euroTo);

        // "Convert to" panel with GridBagLayout
        JPanel toPanel = new JPanel(new GridBagLayout());
        toPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));  // Add padding

        gbc.gridx = 0;
        gbc.gridy = 0;
        toPanel.add(new JLabel(dollarIcon), gbc);
        gbc.gridy = 1;
        toPanel.add(usdTo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        toPanel.add(new JLabel(pesoIcon), gbc);
        gbc.gridy = 1;
        toPanel.add(pesoTo, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        toPanel.add(new JLabel(euroIcon), gbc);
        gbc.gridy = 1;
        toPanel.add(euroTo, gbc);

        // Text fields for input and output
        inputField = new JTextField(10);
        outputField = new JTextField(10);
        outputField.setEditable(false);
        outputField.setBackground(Color.GREEN);

        // Buttons for conversion, clearing, and exiting
        convertButton = new JButton("Convert");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");

        convertButton.addActionListener(this);
        clearButton.addActionListener(e -> {
            inputField.setText("0.0");  // Set Enter Currency field to 0.0
            outputField.setText("");     // Clear the output field
        });
        exitButton.addActionListener(e -> confirmExit());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(convertButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

        // Layout the components in the frame with additional padding
        setLayout(new GridBagLayout());
        GridBagConstraints layoutGbc = new GridBagConstraints();
        layoutGbc.fill = GridBagConstraints.HORIZONTAL;
        layoutGbc.insets = new Insets(5, 5, 5, 5);  // Set spacing around components

        layoutGbc.gridx = 0;
        layoutGbc.gridy = 0;
        add(labelFrom, layoutGbc);

        layoutGbc.gridy = 1;
        add(fromPanel, layoutGbc);

        layoutGbc.gridy = 2;
        add(new JLabel("Enter Amount:"), layoutGbc);

        layoutGbc.gridy = 3;
        add(inputField, layoutGbc);

        layoutGbc.gridy = 4;
        add(labelTo, layoutGbc);

        layoutGbc.gridy = 5;
        add(toPanel, layoutGbc);

        layoutGbc.gridy = 6;
        add(labelComp, layoutGbc);

        layoutGbc.gridy = 7;
        add(outputField, layoutGbc);

        layoutGbc.gridy = 8;
        add(buttonPanel, layoutGbc);

        pack();
        setLocationRelativeTo(null);
    }

    // Helper method to resize icons
    private Icon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    // Method to show exit confirmation popup
    private void confirmExit() {
        int response = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to exit?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double amount = Double.parseDouble(inputField.getText());
            double rate = 1.0;
            String fromCurrency = "";
            String toCurrency = "";

            if (usdFrom.isSelected() && pesoTo.isSelected()) {
                rate = 20.31;
                fromCurrency = "US Dollar";
                toCurrency = "Mexican Peso";
            } else if (usdFrom.isSelected() && euroTo.isSelected()) {
                rate = 0.94;
                fromCurrency = "US Dollar";
                toCurrency = "Euro";
            } else if (pesoFrom.isSelected() && usdTo.isSelected()) {
                rate = 0.049;
                fromCurrency = "Mexican Peso";
                toCurrency = "US Dollar";
            } else if (pesoFrom.isSelected() && euroTo.isSelected()) {
                rate = 0.046;
                fromCurrency = "Mexican Peso";
                toCurrency = "Euro";
            } else if (euroFrom.isSelected() && usdTo.isSelected()) {
                rate = 1.068;
                fromCurrency = "Euro";
                toCurrency = "US Dollar";
            } else if (euroFrom.isSelected() && pesoTo.isSelected()) {
                rate = 21.69;
                fromCurrency = "Euro";
                toCurrency = "Mexican Peso";
            } else {
                JOptionPane.showMessageDialog(this, "Please select different currencies for conversion.");
                return;
            }

            double result = amount * rate;
            outputField.setText(String.format("%.2f", result));

            // Show result popup with detailed message
            String message = String.format(
                    "<html><strong>%s to %s</strong><br>%s is equivalent to %.2f</html>",
                    fromCurrency, toCurrency, String.format("%.2f", amount), result
            );
            JOptionPane.showMessageDialog(
                    this,
                    message,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
}
