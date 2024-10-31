package Diziler;



public class Deneme {

    static int[] reserve(int[] list){
        int[] reserve= new int[list.length];
        for( int i=0 , j=list.length -1; i<list.length; i++, j--){
            reserve[i] = list[i];
        }
        return reserve;
    }

    static void printArray(int[] list) {
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int[] newListe = reserve(list);
        printArray(newListe);
    }
}

