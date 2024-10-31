package nesneyönelimli.ÖğrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    public void print(){
        System.out.println("Name:" + this.name);
        System.out.println("mpno:" + this.mpno);
        System.out.println("branch:" + this.branch);
    }
}
