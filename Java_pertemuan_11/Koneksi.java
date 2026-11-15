package Java_pertemuan_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static final String URL =
            "jdbc:mysql://localhost:3308/Mahasiswa";

    private static final String USER = "mahasiswa_app";
    private static final String PASSWORD = "mahasiswa123";

    public static Connection getKoneksi() {

        try {
            Connection koneksi = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Koneksi database berhasil!");

            return koneksi;

        } catch (SQLException e) {

            System.out.println("Koneksi database gagal!");
            System.out.println("Pesan error: " + e.getMessage());

            return null;
        }
    }
}
