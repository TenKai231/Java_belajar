package Java_pertemuan_2;

import java.util.Scanner;

class rumusLingkaran {
    double R;
    double PI = 3.14;

    rumusLingkaran(double R){
        this.R = R;
    }

    double keliling() {
        return 2 * R * PI;
    }

    double luas() {
        return PI * R * R;
    }
}

class rumusTrapsium {
    int a,b,t;
    
    rumusTrapsium(int a, int b, int t){
        this.a = a;
        this.b = b;
        this.t = t;
    }

    double luas() {
        return 0.5 * (a + b) * t;
    }
}

class rumusPermainan {
    int as, ts, s1, s2, s3, tp;
    
    rumusPermainan(int as, int ts, int s1, int s2, int s3, int tp){
        this.as = as;
        this.ts= ts;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.tp = tp;
    }

    double luas() {
        return (2 * 0.5 * as * ts) + ((s1 + s2 + s3) * tp);
    }
}
public class Main_4 {
    
    public static void main(String[] args){
        int pilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("""
            === MENU ===
            1. Rumus Keliling Lingkaran
            2. Rumus Luas Trapesium
            3. Rumus Luas Permainan
                """);
        System.out.print("Silahakan masukan pilihan kamu : ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukan rusuk : ");
                double R = input.nextDouble();

                // System.out.println("rusuk = " + R);
                input.close();

                rumusLingkaran rumusLingkaran = new rumusLingkaran(R);
                System.out.println("Rumus Lingkaran = " +  rumusLingkaran.luas());
                break;
            case 2:
                System.out.print("Masukan panjang jajar 1 : ");
                int a = input.nextInt();
                System.out.print("Masukan panjang jajar 2 : ");
                int b = input.nextInt();
                System.out.print("Masukan tinggi : ");
                int t = input.nextInt();
                
                // System.out.println("Panjang sisi 1 = " + a);
                // System.out.println("Panjang sisi 2 = " + b);
                // System.out.println("Tinggi = " + t);

                rumusTrapsium  rumusTrapsium = new rumusTrapsium(a, b, t);
                System.out.println("luas Trapasium adalah = " + rumusTrapsium.luas());
            case 3:
                System.out.print("Masukan Alas segitiga : ");
                int as = input.nextInt();
                System.out.print("Masukan tinggi segitiga : ");
                int ts = input.nextInt();
                System.out.print("Masukan panjang sisi 1 : ");
                int s1 = input.nextInt();
                System.out.print("Masukan panjang sisi 1 : ");
                int s2 = input.nextInt();
                System.out.print("Masukan panjang sisi 1 : ");
                int s3 = input.nextInt();
                System.out.print("masukan tinggi total bagunan prisma : ");
                int tp = input.nextInt();
                rumusPermainan rumusPermainan = new rumusPermainan(as, ts, s1, s2, s3, tp);
                System.out.println("luas dari permianan adalah = " + rumusPermainan.luas());
        }
    }
}
