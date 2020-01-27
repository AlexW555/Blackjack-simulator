/**
 * This is the class for a card. Each card has a rank and a suit
 */
public class Card {
    private ranks rank;
    private suits suit;

    enum suits {
        Clubs,
        Spades,
        Hearts,
        Diamonds
    }

    /*
    Each suit has a value relative to its value in blackjack
     */
   public enum ranks {
        Ace(1),
        Two(2),
        Three(3),
        Four(4),
        Five(5),
        Six(6),
        Seven(7),
        Eight(8),
        Nine(9),
        Ten(10),
        Jack(10),
        Queen(10),
        King(10);

        public final int value;

        ranks(final int value){
           this.value = value;
       }
    }

    /**
     * Initializer for a card
     * @param suit
     * @param rank
     */
    Card(suits suit, ranks rank){
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Gets the value of the card
     * @return Value of given card
     */
    public int getValue() {
        return rank.value;
    }

    /**
     * Overrides the toString method to combine rank with suit
     * @return
     */
    @Override
    public String toString() {
        return rank + " of "+ suit;
    }
}
