package daire;

import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        double pi=3.14;
        double r, a;
        double alan;

        Scanner inp= new Scanner(System.in);

        System.out.print("yarıçap giriniz:");
        r=inp.nextInt();

        System.out.print("merkez açı giriniz:");
        a=inp.nextInt();

        alan=(pi *(r*r) * a) / 360;

        System.out.print("daire.daire diliminin alani:" + alan);

    }
    
}
