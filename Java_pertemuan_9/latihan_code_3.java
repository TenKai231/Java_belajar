package Java_pertemuan_9;

public class latihan_code_3 {
    public static void main(String[] args) {
        String input = "invalid input";

        try {
            if (input.equals("invalid input")) {
                throw new IllegalArgumentException(" thrown demo.");
            }else{
                System.out.println(input);
            }

            System.out.println("after throwing");
        }
        catch (RuntimeException e) {
            System.out.println("Exception caught here ");
            System.out.println(e);
        }
    }
}
