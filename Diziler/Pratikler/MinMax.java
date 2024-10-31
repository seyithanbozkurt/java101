package Diziler.Pratikler;

public class MinMax {
    public static void main(String[] args){
        int[] array={10,25,34,27,65,24,15};
         int min= array[0];
         int max = array[0];

         for(int i : array){
             if(i < min){
                 min=i;
             }
             if(i > max){
                 max=i;
             }
         }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        
    }
}
