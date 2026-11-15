package Java_pertemuan_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2 {
    public static void main(String[] args) throws IOException {
        String nama;

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        System.out.print("Masukkan Nama: ");
        nama = br.readLine();

        System.out.println("Nama Anda: " + nama);
    }
}
