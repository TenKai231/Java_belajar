package java_mandiri.belajar_1;

public class Java_Qiez {
    public static void main(String[] args) {
        
        film film1 = new film();
        film1.tampilkanFilm();

        film film2 = new film("Inception");
        film2.tampilkanFilm();

        film film3 = new film("The Dark Knight", "Action");
        film3.tampilkanFilm();

        film film4 = new film("Interstellar", "Sci-Fi", 169);
        film4.tampilkanFilm();

        film film5 = new film("The Shawshank Redemption", "Drama", 142, 1994, 9.3);
        film5.tampilkanFilm();
    }
}

class film {
    String judul;
    String genre;
    int durasi;
    int tahunRilis;
    double rating;


    public film() {
        this.judul = "-";
        this.genre = "-";
        this.durasi = 0;
        this.tahunRilis = 0;
        this.rating = 0.0;
    }

    public film(String judul) {
        this();
        this.judul = judul;
    }

    public film (String judul, String genre) {
        this();
        this.judul = judul;
        this.genre = genre;
    }

    public film(String judul, String genre, int durasi) {
        this();
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    public film(String judul, String genre, int durasi, int tahunRilis,double rating) {
        this();
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.tahunRilis = tahunRilis;
        this.rating = rating;
    }


    public void tampilkanFilm(){
        
        System.out.println("Judul: " + this.judul);
        System.out.println("Genre: " + this.genre);
        System.out.println("Durasi: " + this.durasi + " menit");
        System.out.println("Tahun Rilis: " + this.tahunRilis);
        System.out.println("Rating: " + this.rating + "\n");
    }


}