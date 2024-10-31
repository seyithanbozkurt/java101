package basitOrn;

import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] args) {
        double boy, kilo;
        double vucutkitleEndeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("boy giriniz:");
        boy = inp.nextInt();

        System.out.print("kilo giriniz:");
        kilo = inp.nextInt();

        vucutkitleEndeks=(boy * boy) / kilo;
        System.out.println("Vucut Kitle Endeksiniz:" + vucutkitleEndeks);
    }
    
}
