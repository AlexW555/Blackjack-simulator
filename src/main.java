import java.util.Scanner;
import java.util.*;


    public class main {
        public static void main(String[] args) {
            int amount;
            System.out.println("Hello welcome to Blackjack, please enter in how much money you would like to start with: ");
            Scanner scan = new Scanner(System.in);
            amount = scan.nextInt();
            System.out.println("You will start with £" + amount);
            Deck deck = new Deck();
            int playerHandTotal = 0;
            int dealerHandTotal = 0;
            int decision;

           // System.out.print(deck);
            deck.shuffle();
            System.out.print(deck);
           // System.out.println("\n");
           // System.out.print(deck.drawCard());
            //System.out.print(deck.drawCard());
            System.out.println("\n");
            Card card1 = deck.drawCard();
            Card card2 = deck.drawCard();
            Card card3 = deck.drawCard();
            Card card4 = deck.drawCard();
            Hand hand = new Hand(deck.drawCard(), deck.drawCard());
            Hand dealerHand = new Hand(deck.drawCard(), deck.drawCard());
            System.out.println("You draw the " + hand);
            playerHandTotal += deck.getValue(hand.card1);
            playerHandTotal += deck.getValue(hand.card2);
            System.out.println("Your total is " + playerHandTotal);
            System.out.println("*******************************");
            System.out.println("What do you want to do:");
            System.out.println("1. Hit (Take another card)");
            System.out.println("2. Stand (Stay on your score)");
            Scanner input = new Scanner(System.in);
            decision = input.nextInt();
            if (decision == 1) {
                System.out.println("You draw the card" + deck.drawCard());
            }
            else if (decision == 2) {

            }

            dealerHandTotal += deck.getValue(dealerHand.card1);
            dealerHandTotal += deck.getValue(dealerHand.card2);
            //System.out.print(dealerHandTotal);







        }
    }
