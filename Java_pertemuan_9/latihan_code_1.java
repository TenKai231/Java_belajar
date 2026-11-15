package Java_pertemuan_9;

public class latihan_code_1 {
    static void nestedTry(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a/b);
        }

            catch(ArithmeticException e){
                System.out.println("Error: Pembagian dengan nol.");
            }
        }

    public static void main(String[] args) {
        
        try {
            nestedTry(args);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2 paremeter di butuhkan.");
        }
    }
}
