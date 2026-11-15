package Java_pertemuan_5;

public class Latihan_1_code_2 {
    public static void main(String[] args) {
        int javaku[];
        javaku = new int[8];
        int i;
        int bd;
        float total;
        float average;
        bd = 0;
        total = 0;

        javaku[0] = 3;
        javaku[1] = 2;
        javaku[2] = 8;
        javaku[3] = 10;
        javaku[4] = 14;
        javaku[5] = 22;
        javaku[6] = 30;
        javaku[7] = 40;

        for (i = 0; i < javaku.length; i++) {
            System.out.println("Java ke- [" + i + "] = " + javaku[i]);
            total = total + javaku[i];
            bd++;
        }
        average = total / bd;
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
