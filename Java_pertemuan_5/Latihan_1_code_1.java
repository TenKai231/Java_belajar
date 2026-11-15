package Java_pertemuan_5;

public class Latihan_1_code_1 {
    public static void main(String[] args) {
        int java[];

        java = new int[5];

        int i;

        java[0] = 2;
        java[1] = 1;
        java[2] = 4;
        java[3] = 10;
        java[4] = 3;

        for (i = 0; i < java.length; i++) {
            System.out.println("Java ke- [" + i + "] = " + java[i]);
        }
    }
}
