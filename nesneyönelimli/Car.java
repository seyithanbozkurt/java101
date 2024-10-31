package nesneyönelimli;

class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    Car(String type, String model, String color, int speed, int speedLimit){
        this.type=type;
        this.model=model;
        this.color=color;
        this.speed=speed;
        this.speedLimit=speedLimit;
        System.out.println("Parametreli consructor");

    }

    Car(String type, String model, String color, int speed){
        this.type=type;
        this.model=model;
        this.color=color;
        this.speed=speed;

    }


    void increaseSpeed(int increament) {
        if ((speed + increament) < speedLimit) {
            speed += increament;
        }
    }


    void decreaseSpeed(int decrease) {
        if (speed > 0) {
             speed-=decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hızınız:" + speed);
        ;
    }

    void ınfo(){
        System.out.println("--------------------");
        System.out.println("Tip\t:" + this.type);
        System.out.println("Model\t:" + this.model);
        System.out.println("Renk\t:" + this.color);
        System.out.println("Hız\t:" + this.speed);
    }

}