public class tabung extends BagunRuang {
    private double jariJari;
    private double tinggi;

    public tabung(double jariJari, double tinggi) {
        super("Tabung");
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    @Override
    public String getDekripsiUkuran() {
        return "Jari-jari: " + jariJari + ", Tinggi: " + tinggi;
    }
}