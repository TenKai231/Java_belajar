package Java_pertemuan_11;

public class Mahasiswa {

    // Atribut
    private String nama;
    private int nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String bidangPeminatan;
    private String alamat;
    private String noTelpon;

    // Constructor
    public Mahasiswa(String nama, int nim, String jurusan, String fakultas,
                     String universitas, String bidangPeminatan,
                     String alamat, String noTelpon) {

        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.universitas = universitas;
        this.bidangPeminatan = bidangPeminatan;
        this.alamat = alamat;
        this.noTelpon = noTelpon;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public String getBidangPeminatan() {
        return bidangPeminatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public void setBidangPeminatan(String bidangPeminatan) {
        this.bidangPeminatan = bidangPeminatan;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }
}
