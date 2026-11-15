
package Java_pertemuan_9;

public class ArithmeticDemo {

    public static void main(String[] args) {

        int angka1 = 10;
        int angka2 = 0;

        try {
            int hasil = angka1 / angka2;

            System.out.println("Hasil pembagian: " + hasil);
        }

        catch (ArithmeticException e) {
            System.out.println("Terjadi ArithmeticException!");
            System.out.println("Pesan error: " + e.getMessage());
        }

        finally {
            System.out.println("Program selesai dijalankan.");
        }
    }
}
