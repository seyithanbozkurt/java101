package basitOrn;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double mesafe;
        double kmfiyat=2.20;
        double tutar;

        Scanner inp= new Scanner(System.in);

        System.out.print("mesafe giriniz:");
        mesafe=inp.nextInt();

        if(mesafe<20){
            tutar =20;
            System.out.print("tutar:" + tutar);
        }
        else{
            tutar= mesafe * kmfiyat;
            System.out.print("tutar:" + tutar);

        }

    }
    
}
