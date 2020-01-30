import java.util.Scanner;

public class Player {
    private Hand playerHand;
    public int playerHandValue;

    public Player(Hand ph){
        playerHand = ph;
    }

    /**
     * The player hand total is used once when the player first picks up two cards and looks at their hand
     */
    public void playerGetHandTotal() {
        playerHandValue += playerHand.card1.getValue();
        playerHandValue += playerHand.card2.getValue();
        System.out.println("You draw the " + playerHand);
        System.out.println("Your total is " + playerHandValue);
    }

    /**
     * Taking in a card this is used to print out the total the player has in their hand.
     * @param card
     */
    public void playerHandTotal(Card card) {
        System.out.println("Your total is " + playerHandValue);

    }

    /**
     * A decision choice of if the player wishes to play on.
     * @return True = Yes they want to play on, False = No stop playing.
     */
    public boolean decision() {
        int decision;

        System.out.println("*******************************");
        System.out.println("What do you want to do:");
        System.out.println("1. Hit (Take another card)");
        System.out.println("2. Stand (Stay on your score)");
        Scanner input = new Scanner(System.in);
        decision = input.nextInt();
        if (decision == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * If they player wishes to play on they will draw a card
     * @param card
     * @return The return type assosicates with if the player has busted or not.
     */
    public boolean play(Card card) {

            System.out.println("You draw the card " + card);
            playerHandValue += card.getValue();

            if (playerHandValue > 21) {
                System.out.println("Player busted with a score of " + playerHandValue);
                return false;
            } else if (playerHandValue == 21) {
                System.out.println("Player hit up to 21, Nice!");
                return false;
            } else {
                playerHandTotal(card);
                return true;
            }
    }
}
