import java.util.Scanner;

public class BMI {
   private double height;
   private double weight;

   public BMI(double height, double weight){
       this.height = height;
       this.weight = weight;
   }

   public double calculate(){
       double bmi = weight / (height * height);
       double bmiRound = Math.round(bmi);
       return bmiRound;
   }

   public boolean isUnderWeight(){
       if (calculate() < 18.5){
           return true;
       }
       return false;
   }

   public boolean isNormalWeight(){
       if (calculate() >= 18.5 && calculate() <= 25){
           return true;
       }
       return false;
   }

   public boolean isOverWeight(){
       if (calculate() > 25){
           return true;
       }
       return false;
   }

    public static void main(String[] args) {
        BMI bmi = new BMI(1.83, 72);
        System.out.println(bmi.calculate());
        System.out.println(bmi.isOverWeight());
        System.out.println(bmi.isNormalWeight());
        System.out.println(bmi.isUnderWeight());
    }
}
