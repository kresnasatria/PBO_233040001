package pertemuan15;

import javax.swing.*;

public class HelloWorldForm1 extends JFrame {
    private JLabel label;

    public HelloWorldForm1 () {
        label = new JLabel();
        label.setText("Hello World!");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}