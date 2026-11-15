class bagunDatar {
    double Keliling;
    double Luas;

    public double hitungKeliling() {
        return Keliling;
    }

    public double hitungLuas() {
        return Luas;
    }

}

class persegi extends bagunDatar {
    double sisi;
    
    public persegi() {
        this.sisi = 1;
    }
    
    public persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        Keliling = 4 * sisi;
        return Keliling;
    }

    @Override
    public double hitungLuas() {
        Luas = sisi * sisi;
        return Luas;
    }

}

class lingkaran extends bagunDatar {
    double jariJari;

    public lingkaran() {
        this.jariJari = 1;
    }

    public lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungKeliling() {
        Keliling = 2 * Math.PI * jariJari;
        return Keliling;
    }

    @Override
    public double hitungLuas() {
        Luas = Math.PI * jariJari * jariJari;
        return Luas;
    }
}

class segitiga extends bagunDatar {
    double alas;
    double tinggi;

    public segitiga() {
        this.alas = 1;
        this.tinggi = 1;
    }

    public segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        Keliling = alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
        return Keliling;
    }

    @Override
    public double hitungLuas() {
        Luas = 0.5 * alas * tinggi;
        return Luas;
    }
}

public class tugas_2 {
    public static void main(String[] args) {
        persegi p = new persegi(5);
        lingkaran l = new lingkaran();
        segitiga s = new segitiga();

        System.out.println("Keliling Persegi: " + p.hitungKeliling());
        System.out.println("Luas Persegi: " + p.hitungLuas());

        System.out.println("Keliling Lingkaran: " + l.hitungKeliling());
        System.out.println("Luas Lingkaran: " + l.hitungLuas());

        System.out.println("Keliling Segitiga: " + s.hitungKeliling());
        System.out.println("Luas Segitiga: " + s.hitungLuas());
    }
}


