package basitOrn;

import java.util.Scanner;
public class üçgen {
    public static void main(String[] args) {
        int kenar1, kenar2, dikKenar;

        Scanner inp= new Scanner(System.in);

        System.out.print("kenar1 giriniz:");
        kenar1=inp.nextInt();

        System.out.print("kenar2 giriniz:");
        kenar2=inp.nextInt();
        System.out.print("dikKenar giriniz:");
        dikKenar=inp.nextInt();

        int alan;
        alan = (dikKenar*kenar2) / 2;

        System.out.print("üçgenin alani:" + alan);
        

    }
    
}
