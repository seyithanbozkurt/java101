package RecursiveFonk;

//kendini kendi içinde çağırma
public class recursive {
    static int f(int n){
        System.out.println("n=>" + n);
        if(n == 1){
            return 1;
        }

        int result = f( n- 1) + n;
        System.out.println("result=> " + result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(f(4));
        // f(4) = f(3) + 4
        // f(3) = f(2) + 3
        // f(2) = f(1) + 2 
        // f(1) = 1
    }
    
}
