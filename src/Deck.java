import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    /**
     * Initialises the deck ArrayList with the cards
     */
    Deck() {
        deck = new ArrayList<Card>();
        for (Card.suits suit : Card.suits.values()) {
            for (Card.ranks rank : Card.ranks.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    /**
     * Shuffles the Deck
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /**
     * Builds the string together for the card and the deck
     * e.g Four of Clubs
     * @return A combined string
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card c : deck) {
            sb.append(c);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Removes a card from the deck
     * @return The card removed from the deck
     */
    public Card drawCard() {
        return deck.remove(0);
    }

    /**
    This function returns the value of a card. If Facecard it returns 10.
     * @return Returns the cards value
    TODO: Implement Aces = 10 or 1 (Currently: Ace = 11)
 */
    public int getValue(Card card1) {
        return card1.getValue();
    }
}
