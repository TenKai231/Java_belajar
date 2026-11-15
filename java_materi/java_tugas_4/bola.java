public class bola extends BagunRuang {
    private double jariJari;

    public bola(double jariJari) {
        super("Bola");
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");

        }
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public String getDekripsiUkuran() {
        return "Jari-jari: " + jariJari;
    }
}