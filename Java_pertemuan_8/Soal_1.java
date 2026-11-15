package Java_pertemuan_8;

// Superclass
abstract class BangunRuang {

    abstract double hitungVolume();

}

// 1. Kubus
class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

// 2. Balok
class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

// 3. Tabung
class Tabung extends BangunRuang {
    double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}

// 4. Kerucut
class Kerucut extends BangunRuang {
    double jariJari, tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return (1.0 / 3.0) * Math.PI *
               jariJari * jariJari * tinggi;
    }
}

// 5. Limas dengan alas persegi panjang
class Limas extends BangunRuang {
    double panjangAlas, lebarAlas, tinggi;

    public Limas(double panjangAlas, double lebarAlas, double tinggi) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = lebarAlas;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return (1.0 / 3.0) * panjangAlas * lebarAlas * tinggi;
    }
}

// 6. Prisma segitiga
class Prisma extends BangunRuang {
    double alasSegitiga, tinggiSegitiga, panjangPrisma;

    public Prisma(double alasSegitiga, double tinggiSegitiga,
                  double panjangPrisma) {
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
        this.panjangPrisma = panjangPrisma;
    }

    @Override
    double hitungVolume() {
        double luasAlas = 0.5 * alasSegitiga * tinggiSegitiga;
        return luasAlas * panjangPrisma;
    }
}

// 7. Bola
class Bola extends BangunRuang {
    double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI *
               Math.pow(jariJari, 3);
    }
}

// Main class
public class Soal_1 {

    public static void main(String[] args) {

        BangunRuang[] bangun = {
            new Kubus(5),
            new Balok(10, 5, 4),
            new Tabung(7, 10),
            new Kerucut(7, 12),
            new Limas(6, 4, 9),
            new Prisma(6, 8, 10),
            new Bola(7)
        };

        String[] nama = {
            "Kubus",
            "Balok",
            "Tabung",
            "Kerucut",
            "Limas",
            "Prisma",
            "Bola"
        };

        System.out.println("===== VOLUME BANGUN RUANG =====");

        for (int i = 0; i < bangun.length; i++) {
            System.out.printf("%-10s : %.2f%n",
                    nama[i], bangun[i].hitungVolume());
        }
    }
}
