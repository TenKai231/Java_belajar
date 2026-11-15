package Java_pertemuan_7;
import java.io.*;


abstract class p{
    abstract public void mathod2();
    int x,y,z;
    
    public void mathod1(){
        System.out.println("Method nyata dari class p");
        System.out.println("Nilai x,y,z ditentukan dalam class p");
        x = 12;
        y = 10;
    }
}

class Q extends p{
    public void mathod2(){
        System.out.println("Method abstrak dari class p diimplementasikan dalam class Q");
        z = x + y;
        System.out.println("Hasil penjumlahan x + y = " + z);
    }
}
public class latihan_1_code_1 {
    public static void main(String[] args) {
        Q object = new Q();
        object.mathod1();
        object.mathod2();
    }
}