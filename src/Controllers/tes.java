package Controllers;

import javax.swing.*;
import javax.swing.text.*;

public class tes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Auto Update TextField");
        JTextField textField = new JTextField();

        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new AutoUpdateFilter());

        frame.getContentPane().add(textField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    static class AutoUpdateFilter extends DocumentFilter {
        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            super.replace(fb, offset, length, text.toUpperCase(), attrs);
        }
    }
}
