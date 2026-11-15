package Java_pertemuan_8;

import java.util.Scanner;

class latihan_1_code_1 {
    public static void main(String[] args) {
        classA superClass = new classA();
        classB subClass = new classB();
        Scanner input = new Scanner(System.in);

        System.out.println("SuperClass adalah kelas A");
        superClass.x = 100;
        superClass.y = 125;
        superClass.tampilkanKelasXY();

        System.out.println("\nSubClass adalah kelas B");
        subClass.x = 10;
        subClass.y = 15;
        subClass.tampilkanKelasXY();

        System.out.print("Masukkan nilai z : ");
        subClass.z = input.nextInt();
        subClass.tampilkanKelasJumlah();
    }
}