package Java_pertemuan_7;

class Mahasiswa {

    // Atribut private
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String alamat;
    private String email;
    private String pekerjaan;
    private String hobi;
    private String keahlian;
    private String karya;

    // Constructor
    public Mahasiswa(
            String nama,
            String nim,
            String jurusan,
            String fakultas,
            String universitas,
            String alamat,
            String email,
            String pekerjaan,
            String hobi,
            String keahlian,
            String karya) {

        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.universitas = universitas;
        this.alamat = alamat;
        this.email = email;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.keahlian = keahlian;
        this.karya = karya;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
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

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getHobi() {
        return hobi;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public String getKarya() {
        return karya;
    }

    // Setter contoh
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    // Method menampilkan biodata
    public void tampilkanBiodata() {

        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama        : " + getNama());
        System.out.println("NIM         : " + getNim());
        System.out.println("Jurusan     : " + getJurusan());
        System.out.println("Fakultas    : " + getFakultas());
        System.out.println("Universitas : " + getUniversitas());
        System.out.println("Alamat      : " + getAlamat());
        System.out.println("Email       : " + getEmail());
        System.out.println("Pekerjaan   : " + getPekerjaan());
        System.out.println("Hobi        : " + getHobi());
        System.out.println("Keahlian    : " + getKeahlian());
        System.out.println("Karya       : " + getKarya());

        System.out.println("============================");
    }
}

public class Soal_2 {

    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa(
            "Nama Kamu",
            "NIM Kamu",
            "Sistem Informasi",
            "Fakultas Ilmu Komputer",
            "Universitas Sriwijaya",
            "Alamat Kamu",
            "email@example.com",
            "Mahasiswa",
            "Membaca dan Coding",
            "Java, SQL, Python",
            "Project Machine Learning"
        );

        mahasiswa.tampilkanBiodata();
    }
}
