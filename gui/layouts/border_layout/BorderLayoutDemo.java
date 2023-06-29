package gui.layouts.border_layout;

import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo() {
        JButton north=new JButton("North");
        JButton south=new JButton("South");
        JButton east=new JButton("East");
        JButton west=new JButton("West");
        JButton center=new JButton("Center");
        BorderLayout border=new BorderLayout();
        setLayout(border);
        add(north,BorderLayout.NORTH);
        add(south,BorderLayout.SOUTH);
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(center,BorderLayout.CENTER);
        setVisible(true);
        setSize(400,400);
        setTitle("Border Layout Example");


    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
