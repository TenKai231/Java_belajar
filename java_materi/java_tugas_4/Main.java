class Main {

    public static void main(String[] args) {
        // Membuat objek tabung
        tabung tabung1 = new tabung(5, 10);
        System.out.println("Tabung:");
        System.out.println("Volume: " + tabung1.hitungVolume());
        System.out.println("Luas Permukaan: " + tabung1.hitungLuasPermukaan());
        System.out.println("Deskripsi Ukuran: " + tabung1.getDekripsiUkuran());
        System.out.println();

        // Membuat objek balok
        balok balok1 = new balok(4, 6, 8);
        System.out.println("Balok:");
        System.out.println("Volume: " + balok1.hitungVolume());
        System.out.println("Luas Permukaan: " + balok1.hitungLuasPermukaan());
        System.out.println("Deskripsi Ukuran: " + balok1.getDekripsiUkuran());
        System.out.println();

        // Membuat objek bola
        bola bola1 = new bola(7);
        System.out.println("Bola:");
        System.out.println("Volume: " + bola1.hitungVolume());
        System.out.println("Luas Permukaan: " + bola1.hitungLuasPermukaan());
        System.out.println("Deskripsi Ukuran: " + bola1.getDekripsiUkuran());
    }
}
