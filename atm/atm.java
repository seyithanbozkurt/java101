package atm;

import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
         String username, password;
         int right=3;
         int balance=1500;
         int select;
        while(right>0){
         System.out.print("Kullanıcı Adınız:");
         username=inp.nextLine();
         System.out.print("Şifreniz:");
         password=inp.nextLine();

         if(username.equals("gül") && password.equals("gül5733")){
            System.out.println("GÜL BANKASİNA HOŞGELDİNİZ");
         
              do{
            
                       System.out.println("1-Para çekme\n"+
                               "2- Para Yatirma\n"+
                               "3- Bakiye Sorgulama\n"+
                               "4- Çikiş");
                      System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz:");
                       select=inp.nextInt();

            if(select==1){
                System.out.println("Çekmek İstediğiniz miktar:");
                int price=inp.nextInt();

                  if(price>balance){
                    System.out.println("Bakiye yetersiz");
                  }
                  else{
                    balance -=price;
                  }
                }
                  else if(select==2){
                    System.out.println("Yatirilicak miktar:");
                    int price = inp.nextInt();
                    balance += price;
                  }else if(select == 3){
                    System.out.print("Bakiyeniz" + balance);
                  }
            }
              while(select != 4);
                  System.out.println("Tekrar görüşmek üzere");
                    break;
         
        } else{
            right--;
            System.out.println("HATALİ KULANİCİ ADİ VEYA ŞİFRE. TEKRAR DENEYİNİZ.");
            if(right==0){
                System.out.println("HESABİNİZ BLOKE OLMUŞUTUR LÜTFEN BANKA İLE İLETİŞİME GEÇİNİZ.");
            }else{
                System.out.println("Kalan Hakkiniz:" + right);
            }
         }
        }
    
    }
    
}
