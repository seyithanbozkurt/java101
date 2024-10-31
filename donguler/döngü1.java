package donguler;

import java.util.Scanner;
public class döngü1 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       
        int fak;
        
        System.out.println("sayi giriniz:");
        fak=inp.nextInt();

        int sonuc=1;

        for(int i=1; i<=fak; i++){
            
            sonuc= sonuc * i;
        }

        System.out.println(fak + "fak" + sonuc );
           
           
    }
}
