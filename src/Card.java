public class Card {
    private int rank;
    private int suit;
    private int value;

    enum suits {
        Clubs,
        Spades,
        Hearts,
        Diamonds
    }

    enum ranks {
        Ace,
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King
    }

    Card(int suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }

    /*
    This function returns the value of a card. If Facecard it returns 10.
    TODO: Implement Aces = 10 or 1 (Currently: Ace = 11)
     */
    public int getValue() {
        if (rank > 10) {
            value = 10;
        }
        else if (rank == 1){
            value = 11;
        }
        else {
            value = rank;
        }
        return value;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }


}
