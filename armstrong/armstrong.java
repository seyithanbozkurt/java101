package armstrong;

import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int number =inp.nextInt();
        int basNumber=0; int tempNumber=number;
        int basValue;
        int basPow;
        int result=0;

         while(tempNumber !=0){
             tempNumber= tempNumber / 10;
             basNumber++;
         }

         tempNumber=number;

         while(tempNumber !=0){
            basValue=tempNumber % 10;  //2451 % 10 =1 ,  245 % 10 = 5 , 24 % 10 = 4
            basPow=1;
            for(int i =1; i<=basNumber; i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10; // 2451/10=245 , 245 / 10 = 24 , 24 / 10 = 4
         }
         System.out.println("Sonuç" + result);

         if(tempNumber == result){
            System.out.println(number +" " + "Bir armstrong.armstrong sayidir");
         }
         else{
            System.out.println(number +" " + "Bir armstrong.armstrong sayi değildir");
         }
        
        /* 
         //BASAMAK SAYISI BULMA İŞLEMİ

        int a=2451; int basamakSayısı=0; int numberCounter=0;

        //2451/10 = 245
        //245/10 = 24    // sayıyı her defasından 10 a böldüğümde bir basamak silinik hali sonuc verir çünkü 
        //24/10 = 2      // int değer bölüyorum çıkan sonucları 10 a bölerek sonuc sıfır olana kadar devam 
        //2/10 = 0       // ettiğimde kaç basamaklı sayı olduğunu bulabilirim

        while(a != 0){
            a = a/10;
            numberCounter++;
            System.out.println(a);


        }
        System.out.println("basamak sayısı:" + numberCounter);
        */

        //BİR SAYININ SON BASAMAĞINI BULMA
    /* 
        int c=2451;
        int b = c % 10;

        //ÜS ALMA
        int sub=2; int sup=5;
        int result = 1;
        for(int i =1; i<=sup; i++){
            result*=sub;
        }
        System.out.println(result);
        */



    }
}