
package Java_pertemuan_10;

import javax.swing.*;
import java.awt.*;

public class JFrame_form_1 extends JFrame {

    String bil = "";
    double bil1, bil2, jumlah;
    int pilih;

    JTextField jTextField;

    public JFrame_form_1() {

        setTitle("Kalkulator Sederhana");
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5, 5));

        // Tampilan angka
        jTextField = new JTextField("0");
        jTextField.setEditable(false);
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.setFont(new Font("Arial", Font.BOLD, 25));

        add(jTextField, BorderLayout.NORTH);

        // Panel tombol
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 5, 5));

        String[] tombol = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+",
            "%", "mod", "x2", "x3",
            "√", "", "", ""
        };

        for (String teks : tombol) {

            JButton button = new JButton(teks);
            button.setFont(new Font("Arial", Font.BOLD, 18));

            if (teks.isEmpty()) {
                button.setEnabled(false);
            } else {
                button.addActionListener(e -> prosesTombol(teks));
            }

            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    // Proses tombol kalkulator
    private void prosesTombol(String teks) {

        // Input angka
        if (teks.matches("[0-9]")) {

            if (bil.isEmpty()) {
                bil = teks;
            } else if (bil.equals("0")) {
                bil = teks;
            } else {
                bil += teks;
            }

            jTextField.setText(bil);
        }

        // Hapus semua
        else if (teks.equals("C")) {

            bil = "";
            bil1 = 0;
            bil2 = 0;
            jumlah = 0;
            pilih = 0;

            jTextField.setText("0");
        }

        // Operasi matematika dasar dan modulo
        else if (teks.equals("+") ||
                 teks.equals("-") ||
                 teks.equals("*") ||
                 teks.equals("/") ||
                 teks.equals("mod")) {

            if (bil.isEmpty()) {
                return;
            }

            bil1 = Double.parseDouble(bil);

            switch (teks) {

                case "+":
                    pilih = 1;
                    break;

                case "-":
                    pilih = 2;
                    break;

                case "*":
                    pilih = 3;
                    break;

                case "/":
                    pilih = 4;
                    break;

                case "mod":
                    pilih = 5;
                    break;
            }

            bil = "";
        }

        // Persen
        else if (teks.equals("%")) {

            if (bil.isEmpty()) {
                return;
            }

            bil1 = Double.parseDouble(bil);
            jumlah = bil1 / 100;

            tampilkanHasil();
        }

        // Pangkat kuadrat
        else if (teks.equals("x2")) {

            if (bil.isEmpty()) {
                return;
            }

            bil1 = Double.parseDouble(bil);
            jumlah = Math.pow(bil1, 2);

            tampilkanHasil();
        }

        // Pangkat kubik
        else if (teks.equals("x3")) {

            if (bil.isEmpty()) {
                return;
            }

            bil1 = Double.parseDouble(bil);
            jumlah = Math.pow(bil1, 3);

            tampilkanHasil();
        }

        // Akar kuadrat
        else if (teks.equals("√")) {

            if (bil.isEmpty()) {
                return;
            }

            bil1 = Double.parseDouble(bil);

            if (bil1 < 0) {
                jTextField.setText("Angka tidak valid");
                bil = "";
                pilih = 0;
                return;
            }

            jumlah = Math.sqrt(bil1);

            tampilkanHasil();
        }

        // Tombol sama dengan
        else if (teks.equals("=")) {

            if (bil.isEmpty() || pilih == 0) {
                return;
            }

            bil2 = Double.parseDouble(bil);

            switch (pilih) {

                case 1:
                    jumlah = bil1 + bil2;
                    break;

                case 2:
                    jumlah = bil1 - bil2;
                    break;

                case 3:
                    jumlah = bil1 * bil2;
                    break;

                case 4:
                    if (bil2 == 0) {
                        jTextField.setText("Tidak bisa dibagi 0");
                        bil = "";
                        pilih = 0;
                        return;
                    }

                    jumlah = bil1 / bil2;
                    break;

                case 5:
                    if (bil2 == 0) {
                        jTextField.setText("Modulo tidak bisa 0");
                        bil = "";
                        pilih = 0;
                        return;
                    }

                    jumlah = bil1 % bil2;
                    break;
            }

            tampilkanHasil();
        }
    }

    // Menampilkan hasil perhitungan
    private void tampilkanHasil() {

        bil = String.valueOf(jumlah);
        jTextField.setText(bil);
        pilih = 0;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame_form_1 kalkulator = new JFrame_form_1();
            kalkulator.setVisible(true);
        });
    }
}
