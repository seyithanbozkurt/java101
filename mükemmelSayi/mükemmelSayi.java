package mükemmelSayi;

import java.util.Scanner;
public class mükemmelSayi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int n = input.nextInt();
        int mukemmel=0;
        for(int i=1; i<n; i++){
            if(n % i ==0){
                System.out.println(i);
                mukemmel+=i;
        }
        

        }
        if(mukemmel == n){
            System.out.println(n+ "  " + "mükemmel sayidir");
        }
        else{
            System.out.println(n + "mükemmel sayi değildir");
        }
    }
}
