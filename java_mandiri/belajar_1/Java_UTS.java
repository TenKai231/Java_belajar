package java_mandiri.belajar_1;
import java.util.Scanner;

class Product {
    String namaProduk;
    String kodeProduk;
    int hargaProduk;
    int jumlahProduk;

    Product(String namaProduk, String kodeProduk, int hargaProduk, int jumlahProduk) {
        this.namaProduk = namaProduk;
        this.kodeProduk = kodeProduk;
        this.hargaProduk = hargaProduk;
        this.jumlahProduk = jumlahProduk;
    }
}

public class Java_UTS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama produk: ");
        String namaProduk = input.nextLine();
        System.out.print("Masukkan kode produk: ");
        String kodeProduk = input.nextLine();
        System.out.print("Masukkan harga produk: ");
        int hargaProduk = input.nextInt();
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = input.nextInt();

        Product produk = new Product(namaProduk, kodeProduk, hargaProduk, jumlahProduk);



        System.out.println("\nInformasi Produk");
        System.out.println("================================");
        System.out.println("Nama Produk: " + produk.namaProduk);
        System.out.println("Kode Produk: " + produk.kodeProduk);
        // System.out.println("Harga Produk: " + produk.hargaProduk);
        // System.out.println("Jumlah Produk: " + produk.jumlahProduk);
        System.out.println("Total Harga: " + (produk.hargaProduk * produk.jumlahProduk));
        System.out.println("================================");
    }
}
