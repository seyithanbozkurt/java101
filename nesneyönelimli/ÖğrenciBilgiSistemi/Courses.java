package nesneyönelimli.ÖğrenciBilgiSistemi;

public class Courses {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;


    Courses(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;


    }

   public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
            System.out.println("İşlem başarılı.");
        }
            else{
                System.out.println(teacher.name+ " " + "Öğretmen ve ders bölümleri uyuşmuyor");
            }


    }

   public void printTeacher(){
        this.teacher.print();
    }


}
