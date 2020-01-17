import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deck {
    private ArrayList<Card> deck;

    Deck() {
        deck = new ArrayList<Card>();
         for(Card.suits suit:  Card.suits.values()){
             for(Card.ranks rank: Card.ranks.values() ){
                deck.add(new Card(suit,rank));
            }
        }


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

}
