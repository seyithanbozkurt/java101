package nesneyönelimli.MaaşHesaplayici;

public class Emplooye {
    String name;
    int maaş;
    int çalismaSaat;
    int başYıl;


    Emplooye(String name, int maaş, int çalismaSaat, int başYıl){
        this.name=name;
        this.maaş=maaş;
        this.çalismaSaat=çalismaSaat;
        this.başYıl=başYıl;

    }

     double Vergi(){
        double vergi=0;
        if(this.maaş >= 100){
            vergi = this.maaş * 0.03;
        }
        return vergi;
    }

    double bpnus(){
        double bonus =0;
        if(this.çalismaSaat >= 40){
            bonus = (this.çalismaSaat-40) * 30;
        }
        return bonus;
    }

    double yılZam(){
        if(2021 - this.başYıl < 10){
            double zamOran=0.05;
            double zamMiktar= this.maaş * zamOran;
            return zamMiktar;
        }
        if(2021 - this.başYıl > 9 || 2021 - this.başYıl <20){
            double zamOran=0.10;
            double zamMiktar= this.maaş * zamOran;
            return zamMiktar;
        }
        if (2021 - this.başYıl > 19){
            double zamOran=0.15;
            double zamMiktar= this.maaş * zamOran;
            return zamMiktar;
        }
        return 0;
    }

    void printInfo(){
        System.out.println("İsim:" + this.name);
        System.out.println("Maaş:" + this.maaş);
        System.out.println("vergi:" + Vergi());
        System.out.println("Çalışma Saat:" + this.çalismaSaat);
        System.out.println("Bonus:" + bpnus());
        System.out.println("Başlangıç Yıl:" + this.başYıl);
        System.out.println("Yıllık zam:" + yılZam());



    }
    public String toString(){
        return String.format("Name: %-5s | Maaş: %-5f | Çalışma saati: %-1d | Başlangıç Yıl: %-5d",
                this.name,this.maaş,this.çalismaSaat,this.başYıl);
    }
}
