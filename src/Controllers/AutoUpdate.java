package Controllers;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class AutoUpdate{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Retrieve All Data from Table");
        JTable table = new JTable();

        // Create the table model with column names
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Name", "Age", "City"});
        table.setModel(model);

        // Add data to the table
        model.addRow(new Object[]{"John Doe", 25, "New York"});
        model.addRow(new Object[]{"Jane Smith", 30, "London"});
        model.addRow(new Object[]{"Bob Johnson", 40, "Paris"});

        // Retrieve all data from the table
        Vector<Vector> data = model.getDataVector();
        for (Vector<Object> row : data) {
            for (Object value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
