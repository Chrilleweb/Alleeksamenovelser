public class DateAgeCalculator {
     private int yourAge;
     private int dateAge;

     public DateAgeCalculator(int yourAge, int dateAge){
         this.yourAge = yourAge;
         this.dateAge = dateAge;
     }

     public int getAcceptableAge(){
         int acceptableAge = yourAge / 2 + 7;
         return acceptableAge;
     }

     public void youngOrNot(){
         if (dateAge < getAcceptableAge()){
             System.out.println("Too young");
         } else if (dateAge >= getAcceptableAge()) {
             System.out.println("Thats good");
         }
     }

    public static void main(String[] args) {
        DateAgeCalculator dateAgeCalculator = new DateAgeCalculator(22, 19);
        System.out.println(dateAgeCalculator.getAcceptableAge());
        dateAgeCalculator.youngOrNot();
    }
}
