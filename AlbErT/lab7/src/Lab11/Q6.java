package Lab11;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q6 extends JFrame {

    private JDesktopPane desktopPane;

    public Q6() {
        // Set up the main frame
        setTitle("Swing Components Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open Table");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action to open a table in internal frame
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTableInInternalFrame();
            }
        });

        // Add action to exit
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Create a desktop pane
        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);
    }

    // Method to create and show JTable in JInternalFrame
    private void showTableInInternalFrame() {
        // Table data
        String[] columns = {"ID", "Name", "Course"};
        Object[][] data = {
                {1, "RAM", "BCA"},
                {2, "HARI", "CSIT"},
                {3, "GITA", "BBA"}
        };

        JTable table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane scrollPane = new JScrollPane(table);

        JInternalFrame internalFrame = new JInternalFrame("Student Table", true, true, true, true);
        internalFrame.setSize(400, 300);
        internalFrame.setVisible(true);
        internalFrame.add(scrollPane, BorderLayout.CENTER);

        desktopPane.add(internalFrame);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           Q6 demo = new Q6();
            demo.setVisible(true);
        });
    }
}

