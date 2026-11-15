public abstract class BagunRuang{
    protected String nama;

    public BagunRuang(String nama){
        this.nama = nama;
    }
    
    public abstract double hitungVolume();

    public abstract double hitungLuasPermukaan();

    public abstract String getDekripsiUkuran();

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Bangun Ruang: " + nama);
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
        System.out.println("Dekripsi Ukuran: " + getDekripsiUkuran());
    }
}