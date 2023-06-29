package gui.layouts.grid_layout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class GridLayoutDemo  extends Frame{

    public GridLayoutDemo()
    {

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        JPanel p6=new JPanel();


        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.blue);
        p3.setBackground(Color.green);
        p4.setBackground(Color.red);
        p5.setBackground(Color.gray);
        p6.setBackground(Color.yellow);

        setSize(400, 400);
        GridLayout gridLayout = new GridLayout(3,2,10,10);
        setLayout(gridLayout);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        setVisible(true);


    }
    public static void main(String[] args) {
        
 new GridLayoutDemo();
    }
}
