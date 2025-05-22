package Lab11;

import javax.swing.JOptionPane;

public class Q4 {
    public static void main(String[] args) {
        // Get Principal
        String principalStr = JOptionPane.showInputDialog("Enter Principal amount:");
        double principal = Double.parseDouble(principalStr);

        // Get Rate of Interest
        String rateStr = JOptionPane.showInputDialog("Enter Rate of Interest (in %):");
        double rate = Double.parseDouble(rateStr);

        // Get Time in years
        String timeStr = JOptionPane.showInputDialog("Enter Time (in years):");
        double time = Double.parseDouble(timeStr);

        // Calculate Simple Interest: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Show result in a message dialog
        JOptionPane.showMessageDialog(null,
            "Simple Interest is: " + simpleInterest,
            "Result",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
