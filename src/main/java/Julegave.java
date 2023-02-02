import java.util.Random;

public class Julegave {
     private boolean isSoft;
     private boolean isRectangular;
     private boolean doesRattle;

     private Random random = new Random();

     public Julegave(){
         this.isSoft = random.nextBoolean();
         this.isRectangular = random.nextBoolean();
         this.doesRattle = random.nextBoolean();
     }

     public boolean couldBeLego(){
         if (isSoft && isRectangular && doesRattle){
             return true;
         }
         return false;
     }

    public static void main(String[] args) {
        Julegave julegave = new Julegave();
        System.out.println(julegave.couldBeLego());
    }
}
