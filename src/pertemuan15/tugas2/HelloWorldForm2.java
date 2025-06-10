package pertemuan15.tugas2;

import javax.swing.*;

public class HelloWorldForm2 extends JFrame {
    private JLabel label;

    public HelloWorldForm2() {
        label = new JLabel();
        label.setText("Hallo Dunia!");

        add(label);
        setTitle("Program Utama");

        setSize(600, 300);
    }
}
