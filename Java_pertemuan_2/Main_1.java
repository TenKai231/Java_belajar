package Java_pertemuan_2;

import java.util.Scanner;


public class Main_1 {
    public static void main(String[] args) {
        String nama, jurusan, fakultas, universitas;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan Jurusan: ");
        jurusan = input.nextLine();

        System.out.print("Masukkan Fakultas: ");
        fakultas = input.nextLine();

        System.out.print("Masukkan Universitas: ");
        universitas = input.nextLine();
    }
}
