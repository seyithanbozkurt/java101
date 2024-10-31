package donguler;

import java.util.Scanner;
public class üs {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int taban;
        System.out.println("taban giriniz:");
        taban=inp.nextInt();

        int üs;
        System.out.println("donguler.üs giriniz:");
        üs=inp.nextInt();

        int sonuc=1;

        for(int i=1; i<=üs; i++){
            sonuc*=taban;
            System.out.println(" üssü" + sonuc);
        }

    }
    
}
