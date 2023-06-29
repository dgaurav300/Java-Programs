package joptionpaneexamle;
import java.awt.event.*;
import javax.swing.*;

class JOptionPaneDemo extends JFrame {
    public JOptionPaneDemo() {
        setTitle("JOptionPane Example");

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(150, 150, 100, 30);
        add(btnDelete);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // write confirm JOption Pane
                //int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Error",
                        //JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
                        //System.out.println(confirm);
                String input =JOptionPane.showInputDialog(null,"Enter a Name","Hello",JOptionPane.INFORMATION_MESSAGE);
                
                JOptionPane.showMessageDialog(null, "Hello Your input name is:"+input, "Message",JOptionPane.INFORMATION_MESSAGE);


                
            }
        });
    }

    public static void main(String[] args) {
       new JOptionPaneDemo();
    }
}
