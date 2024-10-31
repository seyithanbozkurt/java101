package nesneyönelimli.Boks;

public class Main {
    public static void main(String[] args){
      Fighter f1= new Fighter("SeySey", 20, 100, 100,10);
      Fighter f2= new Fighter("gülgül", 50, 100, 85, 25);

      Match m1= new Match(f1,f2,100,85);
      m1.run();

    }
}
