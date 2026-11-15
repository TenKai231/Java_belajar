
package Java_pertemuan_11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {

    // Menambahkan mahasiswa
    public boolean tambah(Mahasiswa mhs) {

        String sql = """
            INSERT INTO mahasiswa
            (nama, nim, jurusan, fakultas, universitas, bidang_peminatan, alamat, no_telpon)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?)
        """;

        try (
            Connection koneksi = koneksiAtauLemparError();
            PreparedStatement ps = koneksi.prepareStatement(sql)
        ) {

            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getNim());
            ps.setString(3, mhs.getJurusan());
            ps.setString(4, mhs.getFakultas());
            ps.setString(5, mhs.getUniversitas());
            ps.setString(6, mhs.getBidangPeminatan());
            ps.setString(7, mhs.getAlamat());
            ps.setString(8, mhs.getNoTelpon());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Gagal menambahkan: " + e.getMessage());
            return false;
        }
    }

    // Mengubah mahasiswa berdasarkan NIM
    public boolean ubah(Mahasiswa mhs) {

        String sql = """
            UPDATE mahasiswa
            SET nama = ?, jurusan = ?, fakultas = ?, universitas = ?,
                bidang_peminatan = ?, alamat = ?, no_telpon = ?
            WHERE nim = ?
        """;

        try (
            Connection koneksi = koneksiAtauLemparError();
            PreparedStatement ps = koneksi.prepareStatement(sql)
        ) {

            ps.setString(1, mhs.getNama());
            ps.setString(2, mhs.getJurusan());
            ps.setString(3, mhs.getFakultas());
            ps.setString(4, mhs.getUniversitas());
            ps.setString(5, mhs.getBidangPeminatan());
            ps.setString(6, mhs.getAlamat());
            ps.setString(7, mhs.getNoTelpon());
            ps.setInt(8, mhs.getNim());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Gagal mengubah: " + e.getMessage());
            return false;
        }
    }

    // Menghapus mahasiswa berdasarkan NIM
    public boolean hapus(int nim) {
        String sql = "DELETE FROM mahasiswa WHERE nim = ?";

        try (
            Connection koneksi = koneksiAtauLemparError();
            PreparedStatement ps = koneksi.prepareStatement(sql)
        ) {
            ps.setInt(1, nim);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Gagal menghapus: " + e.getMessage());
            return false;
        }
    }

    // Mengambil semua data untuk ditampilkan pada tabel
    public List<Mahasiswa> ambilSemua() {
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        String sql = """
            SELECT nama, nim, jurusan, fakultas, universitas, bidang_peminatan, alamat, no_telpon
            FROM mahasiswa
            ORDER BY nim
        """;

        try (
            Connection koneksi = koneksiAtauLemparError();
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                daftarMahasiswa.add(new Mahasiswa(
                    rs.getString("nama"),
                    rs.getInt("nim"),
                    rs.getString("jurusan"),
                    rs.getString("fakultas"),
                    rs.getString("universitas"),
                    rs.getString("bidang_peminatan"),
                    rs.getString("alamat"),
                    rs.getString("no_telpon")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
        }
        return daftarMahasiswa;
    }

    private Connection koneksiAtauLemparError() throws SQLException {
        Connection koneksi = Koneksi.getKoneksi();
        if (koneksi == null) {
            throw new SQLException("Koneksi database tidak tersedia.");
        }
        return koneksi;
    }
}
