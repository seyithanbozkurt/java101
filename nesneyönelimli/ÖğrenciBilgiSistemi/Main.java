package nesneyönelimli.ÖğrenciBilgiSistemi;

public class Main {
    public static void main(String[] args){
        Teacher t1= new Teacher("Gül", "00000000000", "TRH");
        Teacher t2= new Teacher("Seyithan", "000000000", "FZK");
        Teacher t3= new Teacher("Fuat", "000000000", "MAT");


        Courses tarih = new Courses("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Courses fizik= new Courses("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Courses matematik=new Courses("Matematik", "103", "MAT");
        matematik.addTeacher(t3);

        Student s1= new Student("gülgül", "3357", "Y3", tarih,fizik,matematik);
        s1.addBulkExamNote(30,35,60);
        s1.printNot();
        s1.calcAvarage();
        s1.isPass();

        System.out.println("====================================");

        Student s2= new Student("Seysey", "5733", "Y3", tarih,fizik,matematik);
        s2.addBulkExamNote(85,75,100);
        s2.printNot();
        s2.calcAvarage();
        s2.isPass();

    }
}
