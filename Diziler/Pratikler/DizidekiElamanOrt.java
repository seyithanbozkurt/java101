package Diziler.Pratikler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DizidekiElamanOrt {
    public static void main(String[] args){
        int[] arrays={1,2,3,4,5,6,7,8,9};
        int toplam=0;
        for(int i=0; i<arrays.length; i++){
            toplam+=arrays[i];
        }
        System.out.println(toplam / arrays.length);
        System.out.println(Arrays.toString(arrays));
    }
}
