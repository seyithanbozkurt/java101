package HesapMakinesi;

import java.util.Scanner;
public class HesapMakinesi {
        static void toplama(){
            Scanner input= new Scanner(System.in);
            System.out.print("Kaç adet sayi gireceksiniz");
            int adet=input.nextInt();
            int number, result=0;
            for(int i=1; i<=adet; i++){
                System.out.println(i + ". sayi:");
                number=input.nextInt();
                result += number;
            }
            System.out.println("Sonuç:" + result);
            
        }

        static void cikarma(){
            Scanner input = new Scanner(System.in);
            System.out.print("Kaç adet sayi gireceksiniz");
            int adet =input.nextInt();
            int number, result=0; 
        for(int i=1; i<=adet; i++){
            System.out.print(i + ".sayi:");
            number=input.nextInt();
            if(i==1){
                result+=number;
                continue;
            }
            result-=number;
        }
        
        System.out.println("Sonuç:" + result);
        }

        static void carpma(){
            Scanner input = new Scanner(System.in);
            System.out.println("Kaç adet sayi girceksiniz:");
            int adet=input.nextInt();
            int number , result=1;
            for(int i=1; i<=adet; i++){
                System.out.print(i + ". Sayi:");
                number=input.nextInt();
                if(number==0){
                    result=0;
                    break;
                }
                result *=number;
            }
            System.out.println("Sonuç:" + result);
        }

        static void bolme(){
            Scanner input = new Scanner(System.in);
            System.out.println("Kaç adet sayi gireceksiniz:");
            int adet = input.nextInt();
            double number; double result=0.0;
            for(int i=1; i<=adet; i++){
                System.out.print(i + ". Sayi:");
                number = input.nextInt();
                if(i!=1 && number == 0){
                    System.out.println("0 ile bölünmez");
                    continue;
                }
                if(i == 1){
                    result=number;
                    continue;
                }
                result /= number;
            }
            System.out.println("Sonuç:" + result);
        }

        static void üs(){
            Scanner input = new Scanner(System.in);
            int taban , us, result=1;
            System.out.println("taban degerini giriniz:");
            taban = input.nextInt();
            System.out.println("Üs degerini giriniz:");
            us=input.nextInt();
            for(int i=1; i<=us; i++){
                result*=taban;
            }
            System.out.println("Sonuç:" + result);
            
        }

        static void fak(){
            Scanner input = new Scanner(System.in);
            int fak;
            int result=1;
            System.out.println("Bir değer giriniz:");
            fak=input.nextInt();
            for(int i= 1; i<=fak; i++){
                result *= i;
            }
            System.out.print(fak + "! faktoriyel:" + result);
        }

        static void mod(){
            Scanner input = new Scanner(System.in);
            
            double value1;
            System.out.println("1. Değeri giriniz:"); 
            value1=input.nextInt();
            double value2;
            System.out.println("2. Değeri giriniz:");
            value2=input.nextInt();
            double result;
            result = value1 % value2;

            System.out.println("sonuç:" + result);
            
            
        }

        static void dikdortgen(){
            Scanner input = new Scanner(System.in);
            System.out.println("Uzun kenar giriniz:");
            int uzunkenar = input.nextInt();
            System.out.println("Kisa kenar giriniz:");
            int kisakenar = input.nextInt();
            int alan;
            int çevre;

            alan=uzunkenar*kisakenar;
            System.out.println("alan:" + alan);

            çevre=(2*uzunkenar) + (2*kisakenar);

            System.out.println("çevre:" + çevre);
        }
        
     



    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       int select;
       /* 
       while (true) {

        System.out.println("""
                0- Programı Sonlandır
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı\n""");

        System.out.print("Lütfen bir işlem seçiniz: ");
        select = input.nextByte();

        if (select== 0) {
            break;
        }

        switch (select) {
            case 1:
                toplama();
                break;

            case 2:
                cikarma();
                break;

            case 3:
                carpma();
                break;

            case 4:
                bolme();
                break;

            case 5:
                donguler.üs();
                break;

            case 6:
                fak();
                break;

            case 7:
                mod();
                break;

            case 8:
                dikdortgen();
                break;

            default:
                System.out.println("Lütfen geçerli bir işlem numarası seçiniz!!!");
        }

    }

    System.out.println("Hesap makinesi kapanıyor !!!");
    */



      
       String menu = 
               "0- Çikiş\n" +
               "1- Toplama işlemi\n" +
               "2- Çikarma işlemi\n" +
               "3- Çarpma İşlemi\n" +
               "4- Bölme işlemi\n" + 
               "5- Üs sayi işlemi\n" +
               "6- Faktoriyel işlemi\n" + 
               "7- Mod alma\n" + 
               "8- Dikdortgen alan+çevre";

          do{
            System.out.println(menu);
            System.out.print("İşlem açiniz:");
            select=input.nextInt();
           
               switch(select){
                case 1:
                  toplama();
                  break;
                case 2:
                  cikarma();
                  break;
                case 3:
                  carpma();
                  break;
                case 4:
                  bolme();
                  break;
                case 5:
                  üs();
                  break;
                case 6:
                  fak();
                  break;
                case 7:
                  mod();
                  break;
                case 8:
                  dikdortgen();
                  break;
                case 0:
                break;
            default:
            System.out.println("Yanliş bir değer girdiniz.");
               }
           } while (select!=0);
           
            

    }
    
}
