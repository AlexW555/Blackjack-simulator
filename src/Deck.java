import java.util.*;

public class Deck {
    private ArrayList<Card> deck;
    private static final Map<Integer, Card> BY_LABEL = new HashMap<>();

    Deck() {
        deck = new ArrayList<Card>();
        for (Card.suits suit : Card.suits.values()) {
            for (Card.ranks rank : Card.ranks.values()) {
                deck.add(new Card(suit, rank));
                //BY_LABEL.put(rank.value , Card.ranks);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card c : deck) {
            sb.append(c);
            sb.append("\n");
        }
        return sb.toString();
    }

    public Card drawCard() {
        return deck.remove(0);
    }

    /*
This function returns the value of a card. If Facecard it returns 10.
TODO: Implement Aces = 10 or 1 (Currently: Ace = 11)
 */
    public int getValue(Card card1) {
        return card1.getValue();


//          if (rank > 10) {
//            value = 10;
//        }
//        else if (rank == 1){
//            value = 11;
//        }
//        else {
//            value = rank;
//        }
//        return value;
//     }
    }
}
