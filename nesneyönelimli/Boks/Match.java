package nesneyönelimli.Boks;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    void run(){
        if(ischeckWeight()){
            while(this.f1.health > 0 && this.f2.health > 0 ){
                f2.health = (int) this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                f1.health = (int) this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
                printHealth();
            }

        }
        else{
            System.out.println("Siklet uygun değil.");
        }
    }

    public boolean ischeckWeight(){
        return(this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println("Maçı kazanan :" + this.f2.name);
            return true;
        }
        if(this.f2.health==0){
            System.out.println("Maçı kazanan :" + this.f1.name);
            return true;
        }
        return false;
    }

    void printHealth(){
        System.out.println(this.f1.name + "Can:" + this.f1.health);
        System.out.println(this.f2.name + "Can:" + this.f2.health);
    }
}
