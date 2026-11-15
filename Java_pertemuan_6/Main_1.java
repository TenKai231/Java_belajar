package Java_pertemuan_6;

/**
 * Main_1
 */

    class SteudentRecord {
    
        private String name;
        private String addres;
        private int age;
        private double mathGrade;
        private double englishGrade;
        private double scaninceGrande;
        private double average;
        private static int stuentCount;

        public String getName(){
            return name;
        }

        public void setName( String temp){
            name = temp;
        }

        public double getAverge(){
            double result = 0;
            result = (mathGrade+englishGrade+scaninceGrande) / 3;
            return  result;
        }

        public static int getStudentCount(){
            return stuentCount;
        }
    }

// Overoloading met
    class StudentRecord2{
        private String name;
        private String addres;
        private int age;
        private double mathGrade;
        private double englishGrade;
        private double scaninceGrande;
        private double average;
        private static int stuentCount;

        public void setName(String temp){
            name = temp;
        }

        public String getName(){
            return name;
        }

        public void setAddrease(String temp){
            addres = temp;
        }

        public void setAge(int temp){
            age = temp;
        }

        public void setMathGreade(double temp){
            mathGrade = temp;
        }
        public double getMathGreade(){
            return mathGrade;
        }
        public void setEnglishGreade(double temp){
            englishGrade = temp;
        }
        public double getEnglishGraade(){
            return englishGrade;
        }
        public void setScaninceGrade(double temp){
            scaninceGrande = temp;
        }
        public  double getScainceGreade(){
            return scaninceGrande;
        }
        public double getAvarge(){
            double result = 0;
            result = (mathGrade + englishGrade + scaninceGrande) / 3;
            return result;
        }

        public void print(String temp){
            System.out.println("Name = " + name);
            System.out.println("Adrres = " + addres);
            System.out.println("Age = " + age + "\n");
        }

        public void print (double mGrade, double eGrade, double sGreade){
            System.out.println("Nama = " + name);
            System.out.println("Nilai Matematika = " + mGrade);
            System.out.println("Nilai Inggris = " + eGrade);
            System.out.println("Nilai Sains = " + sGreade);
        }
    }


    // overloading cosntuktor

    
    class StudentData{
        private int studID;
        private String stuName;
        private int stuAge;

        StudentData (){
            studID = 100;
            stuName = "new Student";
            stuAge = 10;
        }

        StudentData(int numl, String atr, int num2){
            studID = numl;
            stuName = atr;
            stuAge = num2;
        }

        public int getStuID(){
            return studID;
        }

        public void setStuID(int stuID){
            this.studID = stuID;
        }

        public String getStuName(){
            return stuName;
        }

        public void setstuName(String stuName){
            this.stuName = stuName;
        }

        public int getstuAge(){
            return stuAge;
        }

        public void setStuAge(int stuAge){
            this.stuAge = stuAge;
        }
    }


public class Main_1 { 
    
    public static void main(String[] args) {
        SteudentRecord RamaRecord = new SteudentRecord();
        SteudentRecord WahyuRecord = new SteudentRecord();
        SteudentRecord DianaRecord = new SteudentRecord();
        StudentRecord2 RayenRecord = new StudentRecord2();

        RayenRecord.setName("Rayen");
        RayenRecord.setAddrease("Curup");
        RayenRecord.setAge(20);

        RayenRecord.print("Data");

        RayenRecord.print(30,40,100);

        // Add names
        RamaRecord.setName("Rama");
        WahyuRecord.setName("Wahyu");
        DianaRecord.setName("Diana");

        System.out.println(DianaRecord.getName());

        System.out.println("Counte " + SteudentRecord.getStudentCount());
        
        StudentData data1 = new StudentData();
        System.out.println("student name is : "+ data1.getStuName());
        System.out.println("student age is : "+ data1.getstuAge());
        System.out.println("student id is : "+ data1.getStuID() + "\n");

        StudentData data2 = new StudentData(101,"chayo",40);
        System.out.println("student name is : "+ data2.getStuName());
        System.out.println("student age is : "+ data2.getstuAge());
        System.out.println("student id is : "+ data2.getStuID());
    }
    
}