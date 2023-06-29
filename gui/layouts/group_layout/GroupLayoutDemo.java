package gui.layouts.group_layout;
import java.awt.*;    
import javax.swing.*;  

public class GroupLayoutDemo {
    public GroupLayoutDemo(){
        JFrame frame = new JFrame("GroupLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container=frame.getContentPane();
        GroupLayout groupLayout=new GroupLayout(container);
        container.setLayout(groupLayout);
        JLabel clickMe = new JLabel("Click Here");  
        JButton button = new JButton("This Button"); 

        groupLayout.setHorizontalGroup(
            groupLayout.createSequentialGroup()
            .addComponent(clickMe)
            .addGap(10, 20, 100)
            .addComponent(button));

            groupLayout.setVerticalGroup(  
                groupLayout.createParallelGroup(
                    GroupLayout.Alignment.BASELINE)  
                           .addComponent(clickMe)  
                           .addComponent(button)); 
                           frame.pack();  
                           frame.setSize(400, 400);
                           frame.setVisible(true); 
    }
    public static void main(String[] args) {

        new GroupLayoutDemo();
        
    }
}
