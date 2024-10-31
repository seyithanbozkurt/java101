package desen;

import java.util.Scanner;
public class desen {
    public static void  desen(int number){
        System.out.println(number + " ");
        if(number <=0){
            return;
        }
        desen(number - 5);
        System.out.println("" + number);
        
        
        
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Bir sayi giriniz");
         int sayi = input.nextInt();
         desen(sayi);
         int a;
         a = sayi;

         if(a == sayi){
            System.exit(a);
         }

         if(sayi > 0 ){
            desen(sayi + 5);
         }
    }
    
}
