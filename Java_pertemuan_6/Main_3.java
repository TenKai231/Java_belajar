package Java_pertemuan_6;
import java.util.Scanner;

/**
 * Main_3
 */

class Mahasiswa{
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private double ipk_semeter;
    private double ipk_kumulatif;
    private boolean riwayat_beasiswa;

    Mahasiswa(){
        nama = "Tidak Diketahui";
        nim = "Tidak Diketahui";
        jurusan = "Tidak Diketahui";
        fakultas = "Tidak Diketahui";
        ipk_semeter = 0;
        ipk_kumulatif = 0;
        riwayat_beasiswa = false;
    }

    Mahasiswa(String nama, String nim, String jurusan, String fakultas, double ipk_semeter, double ipk_kumulatif, boolean riwayat_beasiswa){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipk_semeter = ipk_semeter;
        this.ipk_kumulatif = ipk_kumulatif;
        this.riwayat_beasiswa = riwayat_beasiswa;
    }

    public void setName(String temp){
        nama = temp;
    }

    public String getName(){
        return nama;
    }

    public void setnim(String temp){
        nim = temp;
    }

    public String getNim(){
        return nim;
    }

    public void setjurusan(String temp){
        jurusan = temp;
    }

    public String getJurusan(){
        return jurusan;
    }
    
    public void setFakultas(String temp){
        fakultas = temp;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setIpkSemester(int temp){
        ipk_semeter = temp;
    }

    public double getIpkSemester(){
        return ipk_semeter;
    }

    public void setIpkKumulatif(int temp){
        ipk_kumulatif = temp;
    }

    public double getIpkKumulatif(){
        return ipk_kumulatif;
    }

    public void setRiwayatBeasiswa(boolean temp){
        riwayat_beasiswa = temp;
    }

    public boolean getRiwayatBeasiswa(){
        return riwayat_beasiswa;
    }

    public void print(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
    }

    public void print(double ipk_semeter, double ipk_kumulatif, boolean riwayat_beasiswa){
        System.out.println("Nama: " + nama);
        System.out.println("IPK Semester: " + ipk_semeter);
        System.out.println("IPK Kumulatif: " + ipk_kumulatif);
        System.out.println("Riwayat Beasiswa: " + riwayat_beasiswa);

    }

    public void print(String nama, String nim, String jurusan , String fakultas, double ipk_semeter, double ipk_kumulatif,boolean riwayat_beasiswa){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("IPK Semester: " + ipk_semeter);
        System.out.println("IPK Kumulatif: " + ipk_kumulatif);
        System.out.println("Riwayat Beasiswa: " + riwayat_beasiswa);
    }

}

public class Main_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Mahasiswa mahasiswa1 = new Mahasiswa();
        // mahasiswa1.setName("John Doe");
        // mahasiswa1.setnim("123456789");
        // mahasiswa1.setjurusan("Teknik Informatika");
        // mahasiswa1.setFakultas("Fakultas Teknik");
        // mahasiswa1.setIpkSemester(3);
        // mahasiswa1.setIpkKumulatif(3);
        // mahasiswa1.setRiwayatBeasiswa(true);
        // mahasiswa1.print();

        
        System.out.println("PROGRAM INPUT DATA MAHASISWA");
        System.out.println("==============================");
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan Fakultas: ");
        String fakultas = input.nextLine();
        System.out.print("Masukkan IPK Semester: ");
        double ipk_semester = input.nextDouble();
        System.out.print("Masukkan IPK Kumulatif: ");
        double ipk_kumulatif = input.nextDouble();
        System.out.print("Apakah memiliki riwayat beasiswa? (true/false): ");
        boolean riwayat_beasiswa = input.nextBoolean();
        input.nextLine(); // Consume the newline character
        input.close();

        Mahasiswa mahasiswa2 = new Mahasiswa(
            nama,
            nim,
            jurusan,
            fakultas,
            ipk_semester,
            ipk_kumulatif,
            riwayat_beasiswa
        );

        mahasiswa2.print();
    }
}