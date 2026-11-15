
package Java_pertemuan_10;

import javax.swing.*;
import java.awt.*;

public class JFrame_form extends javax.swing.JFrame {

    String bil = "";
    double jumlah, bil1, bil2;
    int pilih;

    JTextField jTextField;

    // Constructor untuk membuat tampilan kalkulator
    public JFrame_form() {

        setTitle("Kalkulator Sederhana");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5, 5));

        // Text field
        jTextField = new JTextField("0");
        jTextField.setEditable(false);
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.setFont(new Font("Arial", Font.BOLD, 25));

        add(jTextField, BorderLayout.NORTH);

        // Panel tombol
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] tombol = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String teks : tombol) {

            JButton button = new JButton(teks);
            button.setFont(new Font("Arial", Font.BOLD, 20));

            button.addActionListener(e -> {

                switch (teks) {
                    case "7":
                        jButtom2MouseClicked(null);
                        break;

                    case "8":
                        jButtom3MouseClicked(null);
                        break;

                    case "9":
                        jButtom4MouseClicked(null);
                        break;

                    case "/":
                        jButtom17MouseClicked(null);
                        break;

                    case "4":
                        jButtom6MouseClicked(null);
                        break;

                    case "5":
                        jButtom7MouseClicked(null);
                        break;

                    case "6":
                        jButtom8MouseClicked(null);
                        break;

                    case "*":
                        jButtom13MouseClicked(null);
                        break;

                    case "1":
                        jButtom10MouseClicked(null);
                        break;

                    case "2":
                        jButtom11MouseClicked(null);
                        break;

                    case "3":
                        jButtom12MouseClicked(null);
                        break;

                    case "-":
                        jButtom9MouseClicked(null);
                        break;

                    case "0":
                        jButtom14MouseClicked(null);
                        break;

                    case "=":
                        jButtom16MouseClicked(null);
                        break;

                    case "+":
                        jButtom5MouseClicked(null);
                        break;

                    case "C":
                        jButtom18MouseClicked(null);
                        break;
                }
            });

            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    // Tombol hapus satu angka
    private void JButtonMouseClicked(java.awt.event.MouseEvent evt) {

        if (!bil.isEmpty()) {
            bil = bil.substring(0, bil.length() - 1);
        }

        if (bil.isEmpty()) {
            jTextField.setText("0");
        } else {
            jTextField.setText(bil);
        }
    }

    // Tombol angka 7
    private void jButtom2MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "7";
        jTextField.setText(bil);
    }

    // Tombol angka 8
    private void jButtom3MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "8";
        jTextField.setText(bil);
    }

    // Tombol angka 9
    private void jButtom4MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "9";
        jTextField.setText(bil);
    }

    // Tombol tambah
    private void jButtom5MouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(jTextField.getText());
        bil = "";
        pilih = 1;
    }

    // Tombol angka 4
    private void jButtom6MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "4";
        jTextField.setText(bil);
    }

    // Tombol angka 5
    private void jButtom7MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "5";
        jTextField.setText(bil);
    }

    // Tombol angka 6
    private void jButtom8MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "6";
        jTextField.setText(bil);
    }

    // Tombol kurang
    private void jButtom9MouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(jTextField.getText());
        bil = "";
        pilih = 2;
    }

    // Tombol angka 1
    private void jButtom10MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "1";
        jTextField.setText(bil);
    }

    // Tombol angka 2
    private void jButtom11MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "2";
        jTextField.setText(bil);
    }

    // Tombol angka 3
    private void jButtom12MouseClicked(java.awt.event.MouseEvent evt) {
        bil += "3";
        jTextField.setText(bil);
    }

    // Tombol kali
    private void jButtom13MouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(jTextField.getText());
        bil = "";
        pilih = 3;
    }

    // Tombol angka 0
    private void jButtom14MouseClicked(java.awt.event.MouseEvent evt) {

        if (bil.isEmpty()) {
            bil = "0";
        } else if (!bil.equals("0")) {
            bil += "0";
        }

        jTextField.setText(bil);
    }

    // Tombol koma
    private void jButtom15MouseClicked(java.awt.event.MouseEvent evt) {

        if (!bil.contains(".")) {

            if (bil.isEmpty()) {
                bil = "0.";
            } else {
                bil += ".";
            }

            jTextField.setText(bil);
        }
    }

    // Tombol sama dengan
    private void jButtom16MouseClicked(java.awt.event.MouseEvent evt) {

        if (bil.isEmpty() || pilih == 0) {
            return;
        }

        bil2 = Double.parseDouble(jTextField.getText());

        double hasil = 0;

        switch (pilih) {

            case 1:
                hasil = bil1 + bil2;
                break;

            case 2:
                hasil = bil1 - bil2;
                break;

            case 3:
                hasil = bil1 * bil2;
                break;

            case 4:
                if (bil2 == 0) {
                    jTextField.setText("Tidak bisa dibagi 0");
                    bil = "";
                    pilih = 0;
                    return;
                }

                hasil = bil1 / bil2;
                break;
        }

        bil = String.valueOf(hasil);
        jTextField.setText(bil);
        pilih = 0;
    }

    // Tombol bagi
    private void jButtom17MouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(jTextField.getText());
        bil = "";
        pilih = 4;
    }

    // Tombol clear
    private void jButtom18MouseClicked(java.awt.event.MouseEvent evt) {
        bil = "";
        bil1 = 0.0;
        bil2 = 0.0;
        jumlah = 0.0;
        pilih = 0;

        jTextField.setText("0");
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_form().setVisible(true);
            }
        });
    }
}
