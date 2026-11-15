class varibael {
    int panjang;
    int lebar;
}

public class Main_2 {
    public static void main(String[] args) {
        double luas;
        varibael p = new varibael();
        p.panjang = 10;
        p.lebar = 5;
        luas = p.panjang * p.lebar; 
        System.out.println("luas persegi panjang = " + luas);
    }
}
