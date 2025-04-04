// Dealer.java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {
    private List<Card> deck;

    public Dealer() {
        this.deck = createDeck();
    }

    private List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (String suit : Card.SUITS) {
            for (String rank : Card.RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    public Card pickCard() {
        Random random = new Random();
        int index = random.nextInt(deck.size());
        return deck.get(index);
    }
}