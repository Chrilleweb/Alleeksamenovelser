import java.lang.reflect.Array;
import java.util.Random;

public class Card {
    private int value;
    private String[] suit = {"hearts", "diamonds", "clubs", "spades"};
    private Random random = new Random();

    public Card(){}

    public void beats(int card, int yourCard){
        int randomCard = random.nextInt(1, 14);
        int index = random.nextInt(suit.length);
        String randomSuit = suit[index];
        String yourCardSuit = suit[yourCard];
        if (randomCard > card){
            System.out.println("Random card wins!");
        } else if (randomCard < card) {
            System.out.println("you win!");
        } else if (randomSuit.equals(suit[0]) && !yourCardSuit.equals(suit[0])) {
            System.out.println("random card wins!");
        } else if (randomSuit.equals(suit[1]) && !yourCardSuit.equals(suit[0]) || !yourCardSuit.equals(suit[1])) {
            System.out.println("RandomCard wins!");
        } else if (randomSuit.equals(suit[2]) && !yourCardSuit.equals(suit[2]) || !yourCardSuit.equals(suit[1]) || !yourCardSuit.equals(suit[0])) {
            System.out.println("Random card wins!");
        }

        System.out.println(randomCard + " " + randomSuit);
    }

    public static void main(String[] args) {
        Card card = new Card();
        card.beats(5, 0);
    }
}
