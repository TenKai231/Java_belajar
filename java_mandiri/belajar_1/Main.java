package java_mandiri.belajar_1;

public class Main {

    // =========================
    // SOAL 1 - PROGRAM OOP
    // =========================

    static class Bangun {

        // Method menghitung volume tabung
        double volumeTabung(double r, double t) {
            return Math.PI * r * r * t;
        }

        // Method menghitung luas persegi panjang
        double luasPersegiPanjang(double panjang, double lebar) {
            return panjang * lebar;
        }

        // Method menghitung luas trapesium
        double luasTrapesium(double sisiAtas, double sisiBawah, double tinggi) {
            return 0.5 * (sisiAtas + sisiBawah) * tinggi;
        }
    }


    // =========================
    // SOAL 2 - PROSEDURAL
    // =========================

    static double volumeTabungProsedural(double r, double t) {
        return Math.PI * r * r * t;
    }


    // =========================
    // MAIN PROGRAM
    // =========================

    public static void main(String[] args) {

        // =====================================
        // SOAL 1
        // Object dan Method
        // =====================================

        Bangun bangun = new Bangun();

        double jariJari = 7;
        double tinggiTabung = 10;

        double panjang = 10;
        double lebar = 5;

        double sisiAtas = 8;
        double sisiBawah = 12;
        double tinggiTrapesium = 5;

        System.out.println("===== SOAL 1 =====");

        System.out.println("Volume Tabung = "
                + bangun.volumeTabung(jariJari, tinggiTabung));

        System.out.println("Luas Persegi Panjang = "
                + bangun.luasPersegiPanjang(panjang, lebar));

        System.out.println("Luas Trapesium = "
                + bangun.luasTrapesium(sisiAtas, sisiBawah, tinggiTrapesium));


        // =====================================
        // SOAL 2
        // Perbandingan Prosedural dan OOP
        // =====================================

        System.out.println("\n===== SOAL 2 =====");

        // -------- PROSEDURAL --------

        double r = 7;
        double t = 10;

        double volumeProsedural = volumeTabungProsedural(r, t);

        System.out.println("Volume Tabung (Prosedural) = "
                + volumeProsedural);


        // -------- OOP --------

        Bangun tabungOOP = new Bangun();

        double volumeOOP = tabungOOP.volumeTabung(7, 10);

        System.out.println("Volume Tabung (OOP) = "
                + volumeOOP);
    }
}