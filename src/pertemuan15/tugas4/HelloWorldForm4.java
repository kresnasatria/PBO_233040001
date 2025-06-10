package pertemuan15.tugas4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldForm4 extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JButton tombol;

    public HelloWorldForm4 () {
        setTitle("Program Penjumlahan Angka");
        setSize(250, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField1 = new JTextField();
        textField1.setBounds(50, 30, 150, 30);

        textField2 = new JTextField();
        textField2.setBounds(50, 70, 150, 30);

        tombol = new JButton("Jumlah");
        tombol.setBounds(50, 110, 150, 30);
        tombol.addActionListener(this);

        add(textField1);
        add(textField2);
        add(tombol);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(textField1.getText());
            int angka2 = Integer.parseInt(textField2.getText());
            int hasil = angka1 + angka2;

            JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        }
    }
}