package Java_pertemuan_7;
// Abstract class
abstract class BangunRuang {

    abstract double hitungVolume();

}

// Class Balok
class Balok extends BangunRuang {

    double panjang;
    double lebar;
    double tinggi;

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

// Class Bola
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

        Balok balok = new Balok(10, 5, 4);
        Bola bola = new Bola(7);

        System.out.println("=== VOLUME BANGUN RUANG ===");

        System.out.println("Volume Balok: " +
                balok.hitungVolume());

        System.out.println("Volume Bola: " +
                bola.hitungVolume());
    }
}
