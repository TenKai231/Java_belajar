package Java_pertemuan_5;

import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] X = new int[2][2];
        int[][] Y = new int[2][2];
        int[][] hasil = new int[2][2];

        // Input Matriks X
        System.out.println("Masukkan elemen Matriks X:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("X[" + i + "][" + j + "] : ");
                X[i][j] = input.nextInt();
            }
        }

        // Input Matriks Y
        System.out.println("\nMasukkan elemen Matriks Y:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Y[" + i + "][" + j + "] : ");
                Y[i][j] = input.nextInt();
            }
        }

        // Menu Operasi
        System.out.println("\n===== MENU OPERASI MATRIKS =====");
        System.out.println("1. Perkalian Matriks");
        System.out.println("2. Pengurangan Matriks");
        System.out.print("Pilih operasi: ");

        int pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                // Perkalian Matriks
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {

                        hasil[i][j] = 0;

                        for (int k = 0; k < 2; k++) {
                            hasil[i][j] += X[i][k] * Y[k][j];
                        }
                    }
                }

                System.out.println("\nHasil Perkalian Matriks X * Y:");
                break;

            case 2:
                // Pengurangan Matriks
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasil[i][j] = X[i][j] - Y[i][j];
                    }
                }

                System.out.println("\nHasil Pengurangan Matriks X - Y:");
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
                input.close();
                return;
        }

        // Menampilkan hasil
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
