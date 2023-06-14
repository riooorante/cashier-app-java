package Controllers;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener {
    private JTextField textField;
    private int valueTotal;

    public Key(JTextField textField, int valueTotal) {
        this.textField = textField;
        this.valueTotal = valueTotal;
    }

    public int getValueTotal() {
        return valueTotal;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        updateText();}

    private void updateText() {
        textField.setText(String.valueOf(getValueTotal()));
    }


}
