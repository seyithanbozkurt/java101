package ebobEkok;

import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.println("N1 sayisini giriniz:");
        int n1=inp.nextInt();

        System.out.println("N2 sayisini giriniz:");
        int n2= inp.nextInt();

        int ebob;

        
            for(int i=1; i<= n1; i++){
                if(n1%i==0 && n2%i==0){
                    System.out.println(i);
                        ebob=i;
                        
                }
            }
                

        System.out.println("------------------");

        for(int k=n1; k>=1; k--){
            if(n1%k==0 && n2%k==0){
                ebob=k;
                System.out.println(ebob);
                break;
            }
        }

        for(int j=1; j<=(n1*n2); j++){
            if(j%n1==0 && j%n2==0){
                System.out.println(j);
                break;
            }
        }
    }
}
