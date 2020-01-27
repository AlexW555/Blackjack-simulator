import java.util.Scanner;

public class Dealer {

    private Hand dealerHand;
    public int dealerHandValue;

    public Dealer(Hand dh){
        dealerHand = dh;
    }

    public int dealerGetHandTotal() {
        System.out.println("*******************************");
        System.out.println("Dealers turn");
        System.out.println("**Dealer will hit up to 16**");


        dealerHandValue += dealerHand.card1.getValue();
        dealerHandValue += dealerHand.card2.getValue();
        System.out.println("Dealer draws the" + dealerHand);
        System.out.println("Dealers total is " + dealerHandValue);
        return dealerHandValue;
    }

    public void dealerHandTotal(Card card) {
        System.out.println("Your total is " + dealerHandValue);

    }

    public int play(Card card) {

        System.out.println("Dealer draws the card " + card);
        dealerHandValue += card.getValue();

        if (dealerHandValue > 21) {
            System.out.println("Player busted with a score of " + dealerHandValue);
            return false;
        } else if (dealerHandValue == 21) {
            System.out.println("Player hit up to 21, Nice!");
            return false;
        } else {
            dealerHandTotal(card);
            return true;
        }
    }

}
