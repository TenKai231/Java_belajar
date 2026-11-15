package Java_pertemuan_6;

/**
 * Main_2
 */

class Identitas{
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private int ipk_semeter;
    private int ipk_kumulatif;
    private boolean riwayat_beasiswa;


    Identitas(){
        nama = "Tidak Diketahui";
        nim = "Tidak Diketahui";
        jurusan = "Tidak Diketahui";
        fakultas = "Tidak Diketahui";
        ipk_semeter = 0;
        ipk_kumulatif = 0;
        riwayat_beasiswa = false;
    }

    Identitas(String nama, String nim, String jurusan, String fakultas, int ipk_semeter, int ipk_kumulatif, boolean riwayat_beasiswa){
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

    public void setIpk_semeter(int temp){
        ipk_semeter = temp;
    }

    public int getIpk_semeter(){
        return ipk_semeter;
    }

    public void setIpk_kumulatif(int temp){
        ipk_kumulatif = temp;
    }

    public int getIpk_kumulatif(){
        return ipk_kumulatif;
    }

    public void setRiwayat_beasiswa(boolean temp){
        riwayat_beasiswa = temp;
    }

    public boolean getRiwayat_beasiswa(){
        return riwayat_beasiswa;
    }

    public void print(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Fakultas : " + fakultas + "\n");
    }
    public void print(int ipk_semeter, int ipk_kumulatif, boolean riwayat_beasiswa){
        System.out.println("Nama : " + nama);
        System.out.println("IPK Semeter : " + ipk_semeter);
        System.out.println("IPK Kumulatif : " + ipk_kumulatif);
        System.out.println("Riwayat Beasiswa : " + riwayat_beasiswa + "\n");
    }
    public void print(String nama, String nim, String jurusan, String fakultas, int ipk_semeter, int ipk_kumulatif){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("IPK Semeter : " + ipk_semeter);
        System.out.println("IPK Kumulatif : " + ipk_kumulatif + "\n");
    }
}

public class Main_2 {
    public static void main(String[] args) {
        Identitas identitasWahyu = new Identitas();
        identitasWahyu.setName("Wahyu");
        identitasWahyu.setnim("123456789");
        identitasWahyu.setjurusan("Teknik Informatika");
        identitasWahyu.setFakultas("Fakultas Teknik");
        identitasWahyu.print();
        identitasWahyu.print(3, 3, true);
        identitasWahyu.print("Wahyu", "123456789", "Teknik Informatika", "Fakultas Teknik", 3, 3);

        Identitas identitasBudi = new Identitas("Budi", "987654321", "Teknik Mesin", "Fakultas Teknik", 3, 3, false);
        identitasBudi.print();
        identitasBudi.print(3, 3, false);

        Identitas identitasTanpanama = new Identitas();
        identitasTanpanama.print();
        identitasTanpanama.print(0, 0, false);

        Identitas  identitasRama = new Identitas("Rama", "123456789", "Teknik Elektro", "Fakultas Teknik", 3, 3, true);
        identitasRama.print();
        identitasRama.print("Rama", "123456789", "Teknik Elektro", "Fakultas Teknik", 3, 3);
    }
}