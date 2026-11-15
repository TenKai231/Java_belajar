
package Java_pertemuan_11;

import java.sql.Connection;
import java.sql.SQLException;

public class TestKoneksi {

    public static void main(String[] args) {

        Connection koneksi = Koneksi.getKoneksi();

        if (koneksi != null) {

            System.out.println("Database siap digunakan!");

            try {
                koneksi.close();
                System.out.println("Koneksi berhasil ditutup.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("Periksa konfigurasi database!");
        }
    }
}
