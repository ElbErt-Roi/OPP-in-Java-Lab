package Lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame {

    JTextField num1Field, num2Field, num3Field;
    JTextField resultField;
    JLabel resultLabel;

    public Q3() {
        setTitle("Min & Max Finder");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Input Fields
        add(new JLabel("Enter Number 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Enter Number 2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Enter Number 3:"));
        num3Field = new JTextField();
        add(num3Field);

        // Buttons
        JButton minButton = new JButton("Find Smallest");
        JButton maxButton = new JButton("Find Largest");
        add(minButton);
        add(maxButton);

        // Result Label and TextField
        resultLabel = new JLabel("Result:");
        add(resultLabel);
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Action for Min Button
        minButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double num3 = Double.parseDouble(num3Field.getText());

                    double min = Math.min(num1, Math.min(num2, num3));

                    resultLabel.setText("Smallest Number:");
                    resultField.setText(String.format("%.2f", min));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
                }
            }
        });

        // Action for Max Button
        maxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double num3 = Double.parseDouble(num3Field.getText());

                    double max = Math.max(num1, Math.max(num2, num3));

                    resultLabel.setText("Largest Number:");
                    resultField.setText(String.format("%.2f", max));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
                }
            }
        });

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3();
    }
}

