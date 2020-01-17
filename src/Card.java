public class Card {
    private ranks rank;
    private suits suit;
    private int value;

    enum suits {
        Clubs,
        Spades,
        Hearts,
        Diamonds
    }

    enum ranks {
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

        ranks(int i) {
        }
    }

    Card(suits suit, ranks rank){
        this.rank = rank;
        this.suit = suit;
    }

    /*
    This function returns the value of a card. If Facecard it returns 10.
    TODO: Implement Aces = 10 or 1 (Currently: Ace = 11)
     */
   // public int getValue() {
 //      if (rank > 10) {
//            value = 10;
//        }
//        else if (rank == 1){
//            value = 11;
//        }
//        else {
//            value = rank;
//        }
//        return value;
   // }



    @Override
    public String toString() {
        return rank + " of "+ suit;
    }
}
