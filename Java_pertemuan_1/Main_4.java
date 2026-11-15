public class Main_4 {
    public static void main(String[] args) {
        
    konstruktor k1, k2;
    k1 = new konstruktor();
    k2 = new konstruktor();
    
    System.out.println("Luas persegi panjang 1 = " + k1.luas());
    System.out.println("Luas persegi panjang 2 = " + k2.luas());
    }
}
class konstruktor {
    int panjang;
    int lebar;

    konstruktor(){
        panjang = 10;
        lebar = 5;
    }
    
    int luas() {
        return panjang * lebar;
    }
}
