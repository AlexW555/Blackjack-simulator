import java.util.ArrayList;
import java.util.List;

public class Hand {
    public Card card1;
    public Card card2;
    private List<Card> hand;

    Hand(Card card1, Card card2){
        this.card1 = card1;
        this.card2 = card2;
    }

    @Override
    public String toString() {
        return card1 + " and "+ card2;
    }
}
