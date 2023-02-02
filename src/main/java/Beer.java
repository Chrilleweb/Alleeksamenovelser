import java.util.ArrayList;

public class Beer {
    private String name;
    private double alcoholPercentage;
    private double price;

    public Beer(String name){
        this.name = name;
    }

    public void setAlcoholPercentage(double alcoholPercentage){
        try {
            if (alcoholPercentage >= 0 && alcoholPercentage < 100){
                this.alcoholPercentage = alcoholPercentage;
            }

        } catch (Exception e){
            System.out.println("That cant be right");
        }
    }

    public void setPrice(double price){
        try {
            if (price >= 0){
                this.price = price;
            }
        } catch (Exception e){
            System.out.println("That cant be right");
        }
    }

    public static void main(String[] args) {
        Beer beer = new Beer("Beer 1");
        beer.setAlcoholPercentage(35);
        beer.setPrice(10);
        Beer beer1 = new Beer("Beer 2");
        beer.setAlcoholPercentage(15);
        beer1.setPrice(100);
        Beer beer2 = new Beer("Beer 3");
        beer.setAlcoholPercentage(25);
        beer2.setPrice(40);

        double total = beer.price + beer1.price + beer2.price;
        double avergaePrice = total / 3;
        System.out.println(avergaePrice);
    }
}
