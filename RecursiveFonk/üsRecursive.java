package RecursiveFonk;

import java.util.Scanner;

public class üsRecursive {
   public  static int us(int taban, int üs){
        if(üs !=0 ){
            return taban*us(taban, üs-1);
        }else{
            return 1;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri giriniz:");
        int taban = input.nextInt();
        System.out.println("Üs değerini giriniz:");
        int üs= input.nextInt();

        int result = us(taban, üs);
        System.out.println("sonuç:" + result);

        
        
    }
}
