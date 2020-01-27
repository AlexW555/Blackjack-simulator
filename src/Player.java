import java.util.Scanner;

public class Player {
    private Hand playerHand;
    public int playerHandValue;

    public Player(Hand ph){
        playerHand = ph;
    }

    public void playerGetHandTotal() {
        playerHandValue += playerHand.card1.getValue();
        playerHandValue += playerHand.card2.getValue();
        System.out.println("You draw the" + playerHand);
        System.out.println("Your total is " + playerHandValue);
    }

    public void playerHandTotal(Card card) {
        System.out.println("Your total is " + playerHandValue);

    }

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
