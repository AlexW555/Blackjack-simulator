import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    Deck() {
        deck = new ArrayList<Card>();
        for (Card.suits suit : Card.suits.values()) {
            for (Card.ranks rank : Card.ranks.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Card c: deck)
        {
            sb.append(c);
            sb.append("\n");
        }
        return sb.toString();
    }

    public Card drawCard() {
        return deck.remove(0);
    }

}
