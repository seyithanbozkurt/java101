package nesneyönelimli.Boks;
import java.lang.Object;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double randomDamage;

    Fighter(String name, int damage, int health, int weight, double dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
        this.randomDamage=randomDamage;
    }

    double hit(Fighter rakip){
        System.out.println("-----------------");
        System.out.println(this.name + "=>" + rakip.name + " " +  this.randomDamage + "Hasar vurdu");

        if(rakip.randomDamage()){
            System.out.println(rakip.name + "Kritik vuruş:" + this.randomDamage);
            return rakip.health;
        }

        if(this.randomDamage > 60){
            System.out.println(  "KRİTİK:" + this.randomDamage);
        }

        if(rakip.dodge()){
            System.out.println(rakip.name + "Blokladı");
            return rakip.health;
        }

        if(rakip.health - this.randomDamage < 0){
            return 0;
        }

        return rakip.health - this.randomDamage;
    }

    public boolean  randomDamage(){
         this.randomDamage=Math.random() * 100;
         return this.randomDamage == this.damage;
    }

    public boolean dodge(){
        double randomValue = Math.random() * 100; // 0.5 99.3 10.5
        return randomValue < this.dodge;

    }
}
