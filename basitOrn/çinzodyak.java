package basitOrn;

import java.util.Scanner;
public class çinzodyak {
    public static void main(String[] args) {
        int dogumYili;

        Scanner inp= new Scanner(System.in);

        System.out.println("Doğum yili giriniz:");
        dogumYili=inp.nextInt();

        if(dogumYili % 12 == 0 ){
            System.out.println("maymun");
        }  
        else if(dogumYili % 12 == 1){
           System.out.println("horoz");
        }
        else if(dogumYili % 12 == 2){
            System.out.println("köpek");
         }
         else if(dogumYili % 12 == 3){
            System.out.println("domuz");
         }
         else if(dogumYili % 12 == 4){
            System.out.println("fare");
         }
         else if(dogumYili % 12 == 5){
            System.out.println("öküz");
         }
         else if(dogumYili % 12 == 6){
            System.out.println("kaplan");
         }
         else if(dogumYili % 12 == 7){
            System.out.println("tavşan");
         }
         else if(dogumYili % 12 == 8){
            System.out.println("ejderha");
         }
         else if(dogumYili % 12 == 9){
            System.out.println("yilan");
         }
         else if(dogumYili % 12 == 10){
            System.out.println("at");
         }
         else if(dogumYili % 12 == 11){
            System.out.println("koyun");
         }
         else{}



    }
    
}
