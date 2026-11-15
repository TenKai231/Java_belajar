public class Prosedural {

    // Method untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {

        double volume = Math.PI * jariJari * jariJari * tinggi;

        return volume;
    }

    public static void main(String[] args) {

        // Menentukan nilai
        double jariJari = 7;
        double tinggi = 10;

        // Memanggil method
        double hasil = hitungVolume(jariJari, tinggi);

        // Menampilkan hasil
        System.out.println("=== PROGRAM PROSEDURAL ===");
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume Tabung: " + hasil);
    }
}