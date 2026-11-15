class Tabung {

    double jariJari;
    double tinggi;

    // Constructor
    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    // Method menghitung luas permukaan tabung
    public double hitungLuas() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}

class PersegiPanjang {

    double panjang;
    double lebar;

    // Constructor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}

class Trapesium {

    double sisiAtas;
    double sisiBawah;
    double tinggi;

    // Constructor
    public Trapesium(double sisiAtas, double sisiBawah, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    // Method menghitung luas
    public double hitungLuas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
}

public class Soal_1 {

    public static void main(String[] args) {

        // Membuat objek Tabung
        Tabung tabung = new Tabung(7, 10);

        // Membuat objek Persegi Panjang
        PersegiPanjang persegi = new PersegiPanjang(12, 8);

        // Membuat objek Trapesium
        Trapesium trapesium = new Trapesium(10, 6, 8);


        // Menampilkan hasil
        System.out.println("=== MENGHITUNG LUAS ===");

        System.out.println("Luas Permukaan Tabung: "
                + tabung.hitungLuas());

        System.out.println("Luas Persegi Panjang: "
                + persegi.hitungLuas());

        System.out.println("Luas Trapesium: "
                + trapesium.hitungLuas());
    }
}