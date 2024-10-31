package nesneyönelimli.ÖğrenciBilgiSistemi;

public class Student {
    Courses c1;
    Courses c2;
    Courses c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Courses c1, Courses c2, Courses c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = isPass;
    }

    void addBulkExamNote(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.c1.note = not1;
        }
        if (not2 >= 0 && not2 <= 100) {
            this.c2.note = not2;
        }
        if (not3 >= 0 && not3 <= 100) {
            this.c3.note = not3;
        }

    }

    void isPass(){
        if(((this.c1.note + this.c2.note + this.c3.note) / 3) >= 55){
            System.out.println( this.isPass=true);
        }
        else {
            System.out.println(this.isPass = false);
        }
    }

    void calcAvarage(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3;
        System.out.println("Ortalamanız" + this.avarage);
    }

    void printNot(){
        System.out.println("İsim:" + this.name);
        System.out.println("No:" + this.stuNo);
        System.out.println("Sınıf:" + this.classes);


        System.out.println(this.c1.name + " : " + this.c1.note);
        System.out.println(this.c2.name + " : " + this.c3.note);
        System.out.println(this.c3.name + " : " + this.c3.note);


    }
}
