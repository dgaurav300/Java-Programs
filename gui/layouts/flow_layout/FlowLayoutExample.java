package gui.layouts.flow_layout;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
       JButton btn1=new JButton("Button 1");
       JButton btn2=new JButton("Button 2");
       JButton btn3=new JButton("Button 3");
       JButton btn4=new JButton("Button 4");

       JPanel panel=new JPanel();


     
        FlowLayout layout=new FlowLayout(FlowLayout.CENTER,20,20);
     
        
        panel.setLayout(layout);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        add(panel);
        
        setTitle("Flow Layout Demo");
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
      new FlowLayoutExample();

        
    }
}
