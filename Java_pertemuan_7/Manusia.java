package Java_pertemuan_7;

public class Manusia extends MahlukHidup {

    private String duakaki;
    private String tangan;

    public Manusia(String duakaki) {
        this.duakaki = duakaki;
    }

    public void berdiri() {
        System.out.println("Manusia berdiri Mengunakan : " + duakaki);
    }
}