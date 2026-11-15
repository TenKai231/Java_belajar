package Java_pertemuan_9;

public class latihan_code_2 {
    static void myMethod(int n) throws Exception {
        try {
            switch (n) {
                case 1: System.out.println("case pertama");
                return;

                case 3 : 
                System.out.println("case ketiga");
                throw new RuntimeException("demo case ke tiga");

                case 4 : System.out.println("case keempat");
                throw new Exception("demo case ke empat");

                case 2 : System.out.println("case kedua");
            }
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException terjadi: ");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block dieksekusi.");
        }
    }
    public static void main(String[] args){
        for (int i = 1; i<=4; i++){
            try{
                latihan_code_2.myMethod(i);
            }
            catch (Exception e){
                System.out.println("Exception terjadi: ");
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
