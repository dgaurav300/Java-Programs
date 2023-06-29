package threads_example;

import java.awt.Color;
import java.util.Random;
import javax.swing.*;

public class Race extends Thread {
    String ThreadName;
    JLabel l;
    JPanel l1, l2, l3;
    JFrame fr;

    public Race() {

        buildGui();
    }


    public void run()
{

    
if(Thread.currentThread().getName().equals("ObstacleA"))
{
runObjectA();
}
if(Thread.currentThread().getName().equals("ObstacleB"))
{
runObjectB();
}
if(Thread.currentThread().getName().equals("ObstacleC"))
{
    runObjectC();
}
}
    public void buildGui() {
        fr = new JFrame("Racing Game");
        fr.setVisible(true);
        fr.setSize(400, 200);
        fr.setLayout(null);

        l = new JLabel("");
        l.setBounds(10, 10, 400, 20);
        fr.add(l);
        l1 = new JPanel();
        l1.setSize(20, 20);
        l1.setBackground(Color.red);
        l1.setBounds(10, 40, 20, 20);
        fr.add(l1);
        l2 = new JPanel();
        l2.setSize(20, 20);
        l2.setBackground(Color.blue);
        l2.setBounds(10, 80, 20, 20);
        fr.add(l2);
        l3 = new JPanel();
        l3.setSize(20, 20);
        l3.setBackground(Color.black);
        l3.setBounds(10, 120, 20, 20);
        fr.add(l3);

    }

    public static void main(String[] args) {

        Race r=new Race();
        Thread Obstacle1 = new Thread(r);
        Thread Obstacle2 = new Thread(r);
        Thread Obstacle3 = new Thread(r);

        Obstacle1.setName("ObstacleA");
Obstacle2.setName("ObstacleB");
Obstacle3.setName("ObstacleC");

Obstacle1.setPriority(Thread.NORM_PRIORITY+5);
Obstacle2.setPriority(Thread.NORM_PRIORITY-3);
Obstacle1.start();
Obstacle2.start();
Obstacle3.start();


    }

    public void runObjectA() {
        Random ran = new Random();
        int s = ran.nextInt(1000);
        for (int i = -10; i < 400; i++) {
            l1.setBounds(i, s, 20, 20);
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        runObjectC();
    }

    public void runObjectB()
{
Random ran = new Random();
int r = ran.nextInt(180);
for(int i=-10;i<400;i++)
{
l2.setBounds(i, r, 20, 20);
try {
Thread.sleep(11);
}
catch(Exception e)
{
System.out.println(e);
}
}
runObjectA();
}
    
public void runObjectC()
{
Random ran = new Random();
int m = ran.nextInt(10);
for(int i=-10;i<400;i++)
{
l3.setBounds(i, m, 20, 20);
try {
Thread.sleep(10);
}
catch(Exception e)
{
System.out.println(e);
}
}

runObjectB();
}
}
