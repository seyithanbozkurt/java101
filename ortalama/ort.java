package ortalama;

import java.util.Scanner;

public class ort{
      public static void main(String[] args) {
          int mat;
          int fizik;
          int kimya;
          int tarih;

          Scanner inp = new Scanner(System.in);

         System.out.print("Matematik notunuzu giriniz:");
         mat=inp.nextInt();

         System.out.print("fizik notunuzu giriniz:");
         fizik=inp.nextInt();

         System.out.print("kimya notunuzu giriniz:");
         kimya=inp.nextInt();

         System.out.print("Matematik notunuzu giriniz:");
         tarih=inp.nextInt();

         int toplam=mat+fizik+kimya+tarih;
         double ortalama=toplam/4;

         System.out.println("ortalamaniz:" + ortalama);

         if(ortalama>=50){
            System.out.println("Dersten geçtiniz");
         }
         else{
            System.out.println("Dersten kaldiniz");
         }


      }
}