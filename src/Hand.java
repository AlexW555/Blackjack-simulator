import java.util.ArrayList;
import java.util.List;

/**
 * A Hand holds two cards by default.
 */
public class Hand {
    public Card card1;
    public Card card2;

    Hand(Card card1, Card card2){
        this.card1 = card1;
        this.card2 = card2;
    }

    /**
     * Overrides the toString of Hand to call the two cards with an "and"
     * @return
     */
    @Override
    public String toString() {
        return card1 + " and "+ card2;
    }
}
