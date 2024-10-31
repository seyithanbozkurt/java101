package minmax;

import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Kaç adet sayi giriceksiniz:");
        int n = inp.nextInt();
        int k=1;
        int max=0;
        int min=0;
        for(int i=1; i<=n; i++){
            System.out.print(i + " nci " + "sayi giriniz:");
           k= inp.nextInt();
        
        if(k < min){
            min = k;
            
        }

        if(k > max){
            max = k;
            
        }
    }
    System.out.println("min sayı:" + k);
    System.out.println("Max sayı:" + k);
    
        

        

    }
    
}
