
package Java_Pertemuan_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== PROGRAM BILANGAN =====");
        System.out.println("1. Bilangan Prima");
        System.out.println("2. Bilangan Ganjil");
        System.out.println("3. Bilangan Genap");
        System.out.print("Pilih menu: ");

        int pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                System.out.println("\nBilangan Prima:");
                
                for (int i = 2; i <= 1000; i++) {

                    int jumlahFaktor = 0;

                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            jumlahFaktor++;
                        }
                    }

                    if (jumlahFaktor == 2) {
                        System.out.print(i + " ");
                    }
                }
                break;

            case 2:
                System.out.println("\nBilangan Ganjil:");

                for (int i = 1; i <= 1000; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
                break;

            case 3:
                System.out.println("\nBilangan Genap:");

                for (int i = 1; i <= 1000; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}
