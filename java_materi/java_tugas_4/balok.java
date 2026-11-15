public class balok extends BagunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        super("Balok");
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public String getDekripsiUkuran() {
        return "Panjang: " + panjang + ", Lebar: " + lebar + ", Tinggi: " + tinggi;
    }
}