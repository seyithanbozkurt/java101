package methods;

public class method {

    static void toplama(int a, int b,int c){
        System.out.println(a+b);
    }

    static void toplama(int d, int e){
        System.out.println(d+e);
    }

    static int üs(int taban, int üs){
        int sonuc=1;
        for(int i=1; i<=üs; i++){
           sonuc*=taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        
    toplama(5, 2);
    toplama(10, 23);

    int orn=üs(5,5);
    System.out.println(orn);


    

}
    
}
