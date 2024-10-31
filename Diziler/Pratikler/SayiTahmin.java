package Diziler.Pratikler;
import java.util.Scanner;
import java.util.Random;

public class SayiTahmin {
    public static  void main(String[] args){
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);
        Scanner input=new Scanner(System.in);

        int right=0;
        int selected;

        while(right < 5){
            System.out.println("Lütfen Tahmininizi Giriniz:");
            selected=input.nextInt();

            if(selected < 0 || selected > 100){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz");
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler doğru tahmin ettiniz");
                break;
            }
            else{
                right++;
                System.out.println("Yanliş tahim!!!");
                if(selected>number){
                    System.out.println(selected+ " " + "GİZLİ SAYİDAN BÜYÜK");
                }
                else{
                    System.out.println(selected+ " " + "GİZLİ SAYİDAN KÜÇÜK");
                }
                System.out.println("Kalan Hakkiniz:" + (5 - right));
            }
        }

    }
}
