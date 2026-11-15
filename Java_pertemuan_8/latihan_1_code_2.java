package Java_pertemuan_8;
import java.*;
import java.io.*;

class BentukWajah {
    public String respons(){
        return ("Bentuk reaksi wajah saya");
    }
}

class Senyum extends BentukWajah {
    public String respons(){
        return ("Senyum karena saya senang");
    }
}

class tertawa extends BentukWajah {
    public String respons(){
        return ("Tertawa karena saya bahagia");
    }
}

class Marah extends BentukWajah {
    public String respons(){
        return ("Marah karena probowo masi jadi presiden");
    }
}

class sedih extends BentukWajah {
    public String respons(){
        return ("Sedih karena saya gagal");
    }
}

    public class latihan_1_code_2 {
        public static void main(String[] args) {
            BentukWajah bentukWajah = new BentukWajah();
            Senyum senyum = new Senyum();
            tertawa tertawa = new tertawa();
            Marah marah = new Marah();
            sedih sedih = new sedih();

            BentukWajah[] bentukWajahArray = new BentukWajah[5];
            bentukWajahArray[0] = bentukWajah;
            bentukWajahArray[1] = senyum;
            bentukWajahArray[2] = tertawa;
            bentukWajahArray[3] = marah;
            bentukWajahArray[4] = sedih;

            System.out.println("Bentuk[0] : " + bentukWajahArray[0].respons());
            System.out.println("Bentuk[1] : " + bentukWajahArray[1].respons());
            System.out.println("Bentuk[2] : " + bentukWajahArray[2].respons());
            System.out.println("Bentuk[3] : " + bentukWajahArray[3].respons());
            System.out.println("Bentuk[4] : " + bentukWajahArray[4].respons());
        }
    }
