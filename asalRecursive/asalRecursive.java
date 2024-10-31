package asalRecursive;

import java.util.Scanner;

public class asalRecursive {
    public static int asal(int x, int y){
        if( y < x){
          if(x % y !=0){
               return asal(x , ++y);
            }
        
        else
        {
            return 0;
        }     
        
    }
    return 1;
        
}

 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Bir sayi giriniz:");
        sayi=input.nextInt();

        if(asal(sayi,2) == 1){
            System.out.println(sayi + " Asaldir.");
        }
        else{
            System.out.println(sayi + " Asal deildir");
        }
    }
}
