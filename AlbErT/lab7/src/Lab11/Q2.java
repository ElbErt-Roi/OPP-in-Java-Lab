
package Lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2 extends JFrame {

    JTextField number1Field, number2Field;
    JTextField resultField;
    JLabel resultLabel;

    public Q2() {
        setTitle("Add & Subtract Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Input Fields
        add(new JLabel("Enter Number 1:"));
        number1Field = new JTextField();
        add(number1Field);

        add(new JLabel("Enter Number 2:"));
        number2Field = new JTextField();
        add(number2Field);

        // Buttons
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        add(addButton);
        add(subtractButton);

        // Result Label and Field
        resultLabel = new JLabel("Result:");
        add(resultLabel);
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Add Button Action
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1Field.getText());
                    double num2 = Double.parseDouble(number2Field.getText());

                    double sum = num1 + num2;

                    resultLabel.setText("Addition Result:");
                    resultField.setText(String.format("%.2f", sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
                }
            }
        });

        // Subtract Button Action
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1Field.getText());
                    double num2 = Double.parseDouble(number2Field.getText());

                    double difference = num1 - num2;

                    resultLabel.setText("Subtraction Result:");
                    resultField.setText(String.format("%.2f", difference));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
                }
            }
        });

//        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q2();
    }
}
