public class Card {
    private ranks rank;
    private suits suit;

    enum suits {
        Clubs,
        Spades,
        Hearts,
        Diamonds
    }

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
        Kin0(10);

        public final int value;

        ranks(final int value){
           this.value = value;
       }
    }

    Card(suits suit, ranks rank){
        this.rank = rank;
        this.suit = suit;
    }

    public int getValue()
    {
        return rank.value;
    }



    @Override
    public String toString() {
        return rank + " of "+ suit;
    }
}
