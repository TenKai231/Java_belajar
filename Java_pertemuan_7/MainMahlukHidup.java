package Java_pertemuan_7;

public class MainMahlukHidup {
    public void cekMahlukHidup(MahlukHidup mHidup){
        mHidup.berdiri();
    }
    public static void main(String[] args) {
        MainMahlukHidup mh = new MainMahlukHidup();
        mh.cekMahlukHidup(new Manusia("dua kaki"));
    }
}
