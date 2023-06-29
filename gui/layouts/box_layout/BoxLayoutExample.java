package gui.layouts.box_layout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BoxLayout;

public class BoxLayoutExample {
    JButton buttons[];

    public BoxLayoutExample() {
        JFrame frame = new JFrame("BoxLayout Example");

        buttons = new JButton[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            // adding the buttons so that they can be displayed
            frame.add(buttons[i]);
        }

        // the buttons will be placed vertically
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // main method
    public static void main(String args[]) {
        new BoxLayoutExample();
    }
}
