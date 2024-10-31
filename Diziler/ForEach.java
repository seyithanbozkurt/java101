package Diziler;

public class ForEach {
    public static void main(String[] args){
        String[] arabalar={"BMW", "MERCEDES","AUDİ","TOROS"};
        for(String cars: arabalar){
            //System.out.println(cars);
        }

        int[][]matris={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        for(int[] row: matris){
            for(int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
