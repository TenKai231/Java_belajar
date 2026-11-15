package Java_pertemuan_2;

import javax.swing.JOptionPane;

public class Main_3 {

    public static void main(String[] args) {

        String nama = "";

        nama = JOptionPane.showInputDialog("Masukkan Nama: ");

        String msg = "Selamat Datang " + nama;

        JOptionPane.showMessageDialog(null, msg);
    }
}
