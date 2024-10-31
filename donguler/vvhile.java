package donguler;

import java.util.Scanner;

public class vvhile {
    public static void main(String[] args) {
        int password;
        boolean ispasswordSucces=false;

        Scanner inp= new Scanner(System.in);

        while(!ispasswordSucces){
            System.out.println("Şifre giriniz:");
            password=inp.nextInt();
            if(password == 123){
                System.out.println("şifre doğru");
                ispasswordSucces=true;
            }
            else{
                System.out.println("yanliş şifre");
            }
        }
    }
    
}
