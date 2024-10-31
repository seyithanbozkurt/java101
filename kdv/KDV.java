package kdv;

import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        int fiyat;
        double kdvoran=0.18, kdvtutar, kdvliTutar;

        Scanner inp= new Scanner(System.in);
        System.out.println("bir fiyat giriniz:");
        fiyat=inp.nextInt();

        kdvtutar= fiyat * kdvoran;
        kdvliTutar = fiyat + kdvtutar;

        if(fiyat<1000){
            System.out.println("KDVli Tutar:" + kdvliTutar);
        }
        else{
            kdvtutar= fiyat * 0.8;
            kdvliTutar = fiyat + kdvtutar;
            System.out.println("kdvli tutar:"+ kdvliTutar);
        }

       
        
        


        
    }
}
