package Lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1 extends JFrame {

    JTextField lengthField, widthField;
    JTextField resultField;
    JLabel resultLabel;

    public Q1() {
        setTitle("Rectangle");
        setSize(400, 300);
        setDefaultCloseOperation(3);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Enter Length:"));
        lengthField = new JTextField();
        add(lengthField);

        add(new JLabel("Enter Width:"));
        widthField = new JTextField();
        add(widthField);

        JButton areaButton = new JButton("Find Area");
        add(areaButton);

        JButton perimeterButton = new JButton("Find Perimeter");
        add(perimeterButton);

        resultLabel = new JLabel("Result:");
        add(resultLabel);
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        areaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double width = Double.parseDouble(widthField.getText());

                    double area = length * width;

                    resultLabel.setText("Calculated Area:");
                    resultField.setText(String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
                }
            }
        });
        perimeterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double width = Double.parseDouble(widthField.getText());

                    double perimeter = 2 * (length + width);

                    resultLabel.setText("Calculated Perimeter:");
                    resultField.setText(String.format("%.2f", perimeter));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q1();
    }
}
