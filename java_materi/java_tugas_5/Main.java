package java_tugas_5;

public class Main {

    public static void main(String[] args) {

        // Membuat objek Circle
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);

        // Membuat objek Employee
        Employee e1 = new Employee("Andi", 5000000);
        Employee e2 = new Employee("Budi", 7000000);

        // Membuat objek Cube
        Cube cube1 = new Cube(3);
        Cube cube2 = new Cube(5);


        // Menampilkan hasil perbandingan Circle
        System.out.println("=== CIRCLE ===");
        System.out.println("Area Circle 1: " + c1.area());
        System.out.println("Area Circle 2: " + c2.area());
        System.out.println("Circle 1 lebih kecil: " + c1.isLess(c2));
        System.out.println("Circle 1 lebih besar: " + c1.isGreaterThan(c2));
        System.out.println("Circle 1 sama dengan Circle 2: " + c1.isEqualTo(c2));


        // Menampilkan hasil perbandingan Employee
        System.out.println("\n=== EMPLOYEE ===");
        System.out.println("Salary Employee 1: " + e1.getSalary());
        System.out.println("Salary Employee 2: " + e2.getSalary());
        System.out.println("Employee 1 lebih kecil: " + e1.isLess(e2));
        System.out.println("Employee 1 lebih besar: " + e1.isGreaterThan(e2));
        System.out.println("Employee 1 sama dengan Employee 2: " + e1.isEqualTo(e2));


        // Menampilkan hasil perbandingan Cube
        System.out.println("\n=== CUBE ===");
        System.out.println("Volume Cube 1: " + cube1.volume());
        System.out.println("Volume Cube 2: " + cube2.volume());
        System.out.println("Cube 1 lebih kecil: " + cube1.isLess(cube2));
        System.out.println("Cube 1 lebih besar: " + cube1.isGreaterThan(cube2));
        System.out.println("Cube 1 sama dengan Cube 2: " + cube1.isEqualTo(cube2));


        // Demonstrasi Polymorphism
        System.out.println("\n=== POLYMORPHISM ===");

        Compare[] objects = {
            c1, e1, cube1
        };

        for (Compare obj : objects) {
            System.out.println(obj.getClass().getSimpleName());
            System.out.println("Lebih kecil: " + obj.isLess(
                obj instanceof Circle ? c2 :
                obj instanceof Employee ? e2 : cube2
            ));
        }
    }
}