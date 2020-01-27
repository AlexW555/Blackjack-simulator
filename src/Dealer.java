import java.util.Scanner;

public class Dealer {
    private Hand dealerHand;
    public int dealerHandValue = 0;

    public Dealer(Hand dh){
        dealerHand = dh;
    }

    public int dealerGetHandTotal() throws InterruptedException {
        System.out.println("*******************************");
        System.out.println("Dealers turn");
        System.out.println("**Dealer will hit up to 16**");


        dealerHandValue += dealerHand.card1.getValue();
        dealerHandValue += dealerHand.card2.getValue();
        System.out.println("Dealer picks up their cards....");
        Thread.sleep(1000);
        System.out.println("Dealer draws the " + dealerHand);
        System.out.println("Dealers total is " + dealerHandValue);
        return dealerHandValue;
    }

    public void dealerHandTotal(Card card) {
        System.out.println("Your total is " + dealerHandValue);

    }

    public int play(Card card) throws InterruptedException {

        System.out.println("Dealer picks up another card....");
        Thread.sleep(1000);

        System.out.println("Dealer draws the card " + card);
        dealerHandValue += card.getValue();

        if (dealerHandValue > 21) {
            System.out.println("Dealer busted with a score of " + dealerHandValue);
            return dealerHandValue;
        } else if (dealerHandValue == 21) {
            System.out.println("Dealer hit up to 21, Ooof!");
            return dealerHandValue;
        } else {
            dealerHandTotal(card);
            return dealerHandValue;
        }
    }

}
