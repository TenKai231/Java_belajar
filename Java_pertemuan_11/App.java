
package Java_pertemuan_11;

public class App {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa(
            "Rama",
            90202,
            "Sistem Informasi",
            "Fakultas Ilmu Komputer",
            "Universitas Contoh",
            "Pengembangan Perangkat Lunak",
            "Palembang",
            "081234567890"
        );

        System.out.println(mhs.getNama());
        System.out.println(mhs.getNim());
        System.out.println(mhs.getJurusan());
    }
}
