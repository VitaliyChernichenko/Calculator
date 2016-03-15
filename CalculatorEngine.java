package cherbox.Javax.Massiv.MyCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Виталий on 15.03.2016.
 */
public abstract class CalculatorEngine implements ActionListener {
    public void actionPerfomed (ActionEvent e){
        JButton clickedButton = (JButton)e.getSource();
        String clickedButtonLebel = clickedButton.getText();
        JOptionPane.showConfirmDialog(null,
                "Somthing happened...",
                "Just a test",
                JOptionPane.PLAIN_MESSAGE);
    }
}
