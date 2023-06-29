package gui.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ActionEventDemo implements ActionListener {


    //for click Event
    @Override
    public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(null,"Click Event Triggered",  null, 0);
    }
    
}
