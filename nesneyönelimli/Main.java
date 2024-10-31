package nesneyönelimli;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("sedan" , "E 60 M5" , "SİYAH",120,300);
        bmw.increaseSpeed(120);
        bmw.ınfo();

        /*
        bmw.model="E60 M5";
        bmw.speed= 100;
        bmw.increaseSpeed(50);
        bmw.decreaseSpeed(80);
        System.out.println(bmw.model +" "+ "Hızınız:" + bmw.speed);
        bmw.printSpeed();
        */


        Car audi = new Car("hatchback", "RS6", "MOR", 120);
        audi.increaseSpeed(40);
        audi.ınfo();
        /*
        audi.model="RS 6";
        audi.color="Siyah";
        audi.speed=180;
        audi.increaseSpeed(100);
        audi.decreaseSpeed(120);
        audi.increaseSpeed(100);
        System.out.println("Model:" + audi.model + " "+ "Renk:" + audi.color +" " +  "Hızınız:" + audi.speed);
        audi.printSpeed();
        */

    }
}
