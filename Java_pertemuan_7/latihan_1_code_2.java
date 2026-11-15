package Java_pertemuan_7;

class Encapsulation{
    private String name;
    private String addres;
    private int nim;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void ModifNama(String name){
        this.name = name;
    }
    public void ModifAddres(String addres){
        this.addres = addres;
    }
    public void ModifNim(int nim){
        this.nim = nim; 
    }
}


public class latihan_1_code_2 {
    public static void main(String[] args) {
        Encapsulation obejet = new Encapsulation();
        obejet.setName("Dimas");
        obejet.setAddres("Jalan Raya");
        obejet.setNim(123456);
        System.out.println("Nama: " + obejet.getName());
        System.out.println("Alamat: " + obejet.getAddres());
        System.out.println("NIM: " + obejet.getNim());
    }
}
