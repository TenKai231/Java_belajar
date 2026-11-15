public class Main_3 {

    static class kali {
        double a;
        double b;

        void hasil() {
            System.out.println("Hasil perkalian = " + (a * b));
        }
    }

    public static void main(String[] args) {
        kali variabel1, variabel2;

        variabel1 = new kali();
        variabel2 = new kali();

        variabel1.a = 10;
        variabel1.b = 5;

        variabel2.a = 20;
        variabel2.b = 10;

        variabel1.hasil();
        variabel2.hasil();
    }
}