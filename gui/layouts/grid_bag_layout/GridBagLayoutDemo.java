package gui.layouts.grid_bag_layout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class GridBagLayoutDemo extends JFrame {
   public GridBagLayoutDemo(){
    GridBagLayout grid=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    setLayout(grid);
    setTitle("Grid Bag Layout Demo");
    gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=0;
add(new JButton("Button One"),gbc);
gbc.gridx=1;
gbc.gridy=0;
add(new JButton("Button Two"),gbc);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipady=20;
gbc.gridx=0;
gbc.gridy=1;
add(new JButton("ButtonThree"),gbc);
gbc.gridx=1;
gbc.gridy=1;
add(new JButton("ButtonFour"),gbc);
gbc.gridx=0;
gbc.gridy=2;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.gridwidth=2;
this.add(new JButton("Button Five"),gbc);
setSize(300,300);
setPreferredSize(getSize());
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);

   }

    public static void main(String[] args) {
        new GridBagLayoutDemo();
        
    }
    
}
