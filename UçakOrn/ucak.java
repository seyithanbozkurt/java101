package UçakOrn;

import java.util.Scanner;

public class ucak {
   public static void main(String[] args) {
       
   
   double mesafe;
   double ucret =1;
   double yas;
   int tip;

   Scanner inp= new Scanner(System.in);

   System.out.print("mesafe giriniz:");
   mesafe = inp.nextInt();
   if(mesafe<=0){
    System.out.println("Hatalı bilgi girdiniz.");
    
   }
   else{
    
   

   System.out.println("Yas giriniz:");
   yas=inp.nextInt();
   if(yas<=0){
    System.out.println("Hatalı bilgi girdiniz.");
   }
   else{

   System.out.println("Yolculuk tipi giriniz:");
   tip=inp.nextInt();
   if(tip!=1 & tip!=2){
    System.out.println("Hatali bilgi girdiniz");
   }
   else{

   double tutar= mesafe* ucret;
   if(yas<=12){
    double yasİndirim=tutar * 0.5;
    double indirimliTutar= tutar - yasİndirim;
    System.out.println("Yas indrimli tutar" + indirimliTutar);
   }
   else if(yas>12 & yas<24){
        double yasİndirim=tutar * 0.10;
        double indirimliTutar=tutar - yasİndirim;
        System.out.println("Yas indirimli tutar:" + indirimliTutar);
   }
   else if(yas>65){
    double yasİndirim=tutar * 0.30;
    double indirimliTutar=tutar - yasİndirim;
    System.out.println("Yas indirimli tutar:" + indirimliTutar);
   }
   else if(tip == 2 ){
    double tipindirim= tutar * 0.20;
    double indirimliTutar= tutar - tipindirim;
    System.out.println("Tip indirimli tutar:" + indirimliTutar);
     }
     else{
        System.out.println("Tutar:" + tutar);
     }

  


   
    }
    }   
    }   

   }
    

}
