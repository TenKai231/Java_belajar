package Java_pertemuan_5;
import java.util.Scanner;

public class Latihan_2_code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        System.out.println("Masukkan nilai matrik A:");
        System.out.println("================================");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan nilai matrik B:");
        System.out.println("================================");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }

        // Penjumlahan matriks
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan matriks A dan B:");
        System.out.println("================================");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
