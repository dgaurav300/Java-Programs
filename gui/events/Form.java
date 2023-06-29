package gui.events;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Form {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Event Example");
        JPanel panel=new JPanel();
        JButton btn=new JButton("Click Me");
        JButton btn2=new JButton("Click Me 2");
        JLabel status=new JLabel("");
        panel.add(btn);
        panel.add(btn2);
        panel.add(status);
        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
        btn.addActionListener(new ActionEventDemo());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Click Event Triggered"+e.getModifiers(),  null, 0);
            }
        });


        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                status.setText("Mouse Dragged");
            }
            @Override
            public void mouseMoved(MouseEvent e) {
                status.setText("Mouse Moved x:"+e.getX()+", y:"+e.getY()+", "+e.getPoint());
            }
        });

        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                status.setText("Welcome");
            }
            @Override
            public void windowClosing(WindowEvent e) {
                //System.exit(0);

            int status=JOptionPane.showConfirmDialog(null, "Do You want to Close this window?", null, 0, 0, null);
            System.out.println(status);
            if(status==1)
            {
                //System.exit(1);
            }
            else
            {
                System.exit(0);
            }

            }
            @Override
            public void windowClosed(WindowEvent e) {
            }
            @Override
            public void windowIconified(WindowEvent e) {
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
            }
            @Override
            public void windowActivated(WindowEvent e) {
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
            }

        });
        


        
    }
}
