
package Java_pertemuan_9;

public class IndexDemo {

    public static void main(String[] args) {

        int[] angka = {10, 20, 30};

        try {
            System.out.println("Angka indeks 0: " + angka[0]);
            System.out.println("Angka indeks 1: " + angka[1]);
            System.out.println("Angka indeks 3: " + angka[3]);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Terjadi IndexOutOfBoundsException!");
            System.out.println("Pesan error: " + e.getMessage());
        }

        finally {
            System.out.println("Program selesai dijalankan.");
        }
    }
}
